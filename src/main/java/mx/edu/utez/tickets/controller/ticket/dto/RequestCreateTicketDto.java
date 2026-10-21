package mx.edu.utez.tickets.controller.ticket.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestCreateTicketDto {

    @NotBlank(message = "La descripción no debe estar vacía")
    private String descripcion;

    @NotBlank(message = "La prioridad es obligatoria")
    @Pattern(regexp = "^(BAJA|MEDIA|ALTA)$", message = "La prioridad solo puede ser BAJA MEDIA y ALTA")
    private String prioridad;

    @NotNull(message = "El ID es obligatorio")
    private Long usuarioId;
}