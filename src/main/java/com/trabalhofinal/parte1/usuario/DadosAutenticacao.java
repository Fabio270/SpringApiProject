package com.trabalhofinal.parte1.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosAutenticacao(@NotBlank
                                String login,
                                @NotBlank
                                String senha){}
