package com.trabalhofinal.parte1.veiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosVeiculo(
        @NotBlank
        String marca,
        @NotBlank
        String modelo,
        String cor,
        @NotBlank
        @Pattern(regexp = "^\\d{4}$")
        String ano) {
}
