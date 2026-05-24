package com.tprints.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank
    private String nombres;

    private String apellidos;

    @Email
    @NotBlank
    private String correo;

    @NotBlank
    private String password;

    private String telefono;

    private String fotoPerfilUrl;

    // Valores permitidos para registro público:
    // CLIENTE o DISENADOR.
    // ADMINISTRADOR no se permite desde registro público.
    private String rol;
}