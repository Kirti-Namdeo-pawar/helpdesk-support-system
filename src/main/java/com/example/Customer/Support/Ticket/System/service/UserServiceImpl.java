package com.example.Customer.Support.Ticket.System.service;

import com.example.Customer.Support.Ticket.System.entity.User;
import com.example.Customer.Support.Ticket.System.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{



    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        // Save user to the database
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        // Find user by ID, throw exception if not found
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    @Override
    public User getUserByEmail(String email) {
        // Find user by email
        return userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found with email: " + email));
    }

    @Override
    public List<User> getAllUsers() {
        // Get all users
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        // Delete user by ID
        userRepository.deleteById(id);
    }
}
