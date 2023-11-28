package com.trabalhofinal.parte1.conserto;

import com.trabalhofinal.parte1.mecanico.Mecanico;
import com.trabalhofinal.parte1.veiculo.Veiculo;

public record DadosDetalhamentoConserto(
        Long id,
        String entrada,
        String saida,
        Veiculo veiculo,
        Mecanico mecanico,
        Boolean ativo
) {

    public DadosDetalhamentoConserto(Conserto conserto){
        this(conserto.getId(), conserto.getEntrada(), conserto.getSaida(),
                conserto.getVeiculo(), conserto.getMecanico(), conserto.getAtivo());
    }

}
