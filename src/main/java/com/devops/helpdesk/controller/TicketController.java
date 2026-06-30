package com.devops.helpdesk.controller;

import com.devops.helpdesk.model.Ticket;
import com.devops.helpdesk.repository.TicketRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin("*")
public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ticket> getTicketById(@PathVariable Long id) {
        return ticketRepository.findById(id);
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticketDetails) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow();
        ticket.setTitle(ticketDetails.getTitle());
        ticket.setDescription(ticketDetails.getDescription());
        ticket.setPriority(ticketDetails.getPriority());
        ticket.setStatus(ticketDetails.getStatus());
        return ticketRepository.save(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketRepository.deleteById(id);
    }
}