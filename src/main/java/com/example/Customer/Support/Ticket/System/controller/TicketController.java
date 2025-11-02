package com.example.Customer.Support.Ticket.System.controller;

import com.example.Customer.Support.Ticket.System.entity.Ticket;
import com.example.Customer.Support.Ticket.System.entity.TicketStatus;
import com.example.Customer.Support.Ticket.System.repository.TicketRepository;
import com.example.Customer.Support.Ticket.System.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;
@Autowired
private TicketRepository ticketRepository;
    // Create a new ticket
    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    // Get ticket by ID
    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    // Get all tickets
    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    // Get tickets by user ID
    @GetMapping("/user/{userId}")
    public List<Ticket> getTicketsByUserId(@PathVariable Long userId) {
        return ticketService.getTicketsByUserId(userId);
    }

    // Get tickets by status
    @GetMapping("/status/{status}")
    public List<Ticket> getTicketsByStatus(@PathVariable TicketStatus status) {
        return ticketService.getTicketsByStatus(status);
    }

    // Update ticket status
    @PutMapping("/{id}/status")
    public Ticket updateTicketStatus(@PathVariable Long id, @RequestParam TicketStatus status) {
        return ticketService.updateTicketStatus(id, status);
    }

    //Delete ticket
    @DeleteMapping("/{id}")
    public String deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
        return "Ticket deleted successfully with id: " + id;
    }


    // optional: endpoint that toggles status (Open -> IN_PROGRESS -> CLOSED)
    @PostMapping("/{id}/toggle")
    public Ticket toggleTicketStatus(@PathVariable Long id) {
        Ticket t = ticketService.getTicketById(id);          // returns an instance
        TicketStatus current = t.getStatus();               // <-- instance method
        TicketStatus next;
        if (current == TicketStatus.OPEN) next = TicketStatus.IN_PROGRESS;
        else if (current == TicketStatus.IN_PROGRESS) next = TicketStatus.CLOSED;
        else next = TicketStatus.OPEN;
        return ticketService.updateTicketStatus(id, next);
    }

}
