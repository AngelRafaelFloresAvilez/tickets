package mx.edu.utez.tickets.controller.usuario.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestCreateUserDto {

    @NotBlank(message = "El nombre del usuario debe estar colocado, es obligatorio")
    private String nombre;
}