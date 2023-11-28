package com.trabalhofinal.parte1.conserto;

import com.trabalhofinal.parte1.mecanico.DadosMecanico;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoConserto(
        @NotNull
        Long id,
        @Pattern(regexp = "^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([0-9]{4})$")
        String saida,
        DadosMecanico dadosMecanico
) {
}
