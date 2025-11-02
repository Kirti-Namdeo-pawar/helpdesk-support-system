package com.example.Customer.Support.Ticket.System.service;

import com.example.Customer.Support.Ticket.System.entity.Ticket;
import com.example.Customer.Support.Ticket.System.entity.TicketStatus;

import java.util.List;

public interface TicketService {
    Ticket createTicket(Ticket ticket);
    Ticket getTicketById(Long id);
    List<Ticket> getAllTickets();
    List<Ticket> getTicketsByUserId(Long userId);
    List<Ticket> getTicketsByStatus(TicketStatus status);
    Ticket updateTicketStatus(Long ticketId, TicketStatus status);
    void deleteTicket(Long ticketId);
}
