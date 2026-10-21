package mx.edu.utez.tickets.controller.ticket.dto;

import mx.edu.utez.tickets.model.ticket.EstadoTicket;
import mx.edu.utez.tickets.model.ticket.PrioridadTicket;
import mx.edu.utez.tickets.model.usuario.Usuario;

public class RequestUpdateTicketDto {
    private Long id;
    private String descripcion;
    private EstadoTicket estado;
    private PrioridadTicket prioridad;
    private Usuario usuario;

}
