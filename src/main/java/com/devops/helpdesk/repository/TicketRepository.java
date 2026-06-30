package com.devops.helpdesk.repository;

import com.devops.helpdesk.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}