package com.trabalhofinal.parte1.mecanico;

import jakarta.validation.constraints.NotBlank;

public record DadosMecanico (
        @NotBlank
        String nome,
        String anos_experiencia){
}
