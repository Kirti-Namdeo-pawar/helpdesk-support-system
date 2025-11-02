package com.example.Customer.Support.Ticket.System.repository;

import com.example.Customer.Support.Ticket.System.entity.Ticket;

import com.example.Customer.Support.Ticket.System.entity.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
    // Find all tickets by user id
    List<Ticket> findByUserId(Long userId);

    // Find tickets by their current status (OPEN, IN_PROGRESS, CLOSED)
    List<Ticket> findByStatus(TicketStatus status);
}
