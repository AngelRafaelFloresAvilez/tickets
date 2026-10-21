package mx.edu.utez.tickets.service.ticket;

import mx.edu.utez.tickets.controller.ticket.dto.RequestUpdateTicketDto;
import mx.edu.utez.tickets.exception.custom.CustomBadRequestException;
import mx.edu.utez.tickets.model.ticket.Ticket;
import mx.edu.utez.tickets.repository.ticket.TicketRepository;

public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

//    public Ticket updateTicket(Long id, RequestUpdateTicketDto payload) {
//        Ticket ticket = ticketRepository.findById(id).orElseThrow(() ->
//                new CustomBadRequestException("EL ticket con el ID " + id + " no existe"));
//
//
//    }

}
