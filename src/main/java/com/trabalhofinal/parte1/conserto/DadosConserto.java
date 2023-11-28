package com.trabalhofinal.parte1.conserto;

import com.trabalhofinal.parte1.mecanico.DadosMecanico;
import com.trabalhofinal.parte1.veiculo.DadosVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosConserto (
        @NotBlank
        @Pattern(regexp = "^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([0-9]{4})$")
        String entrada,
        @NotBlank
        @Pattern(regexp = "^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([0-9]{4})$")
        String saida,
        @NotNull
        @Valid
        DadosVeiculo veiculo,
        @NotNull
        @Valid
        DadosMecanico mecanico){
}
