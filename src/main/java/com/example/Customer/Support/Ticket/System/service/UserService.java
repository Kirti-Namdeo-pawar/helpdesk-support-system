package com.example.Customer.Support.Ticket.System.service;

import com.example.Customer.Support.Ticket.System.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUserById(Long id);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
