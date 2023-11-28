package com.trabalhofinal.parte1.mecanico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {
    private String nome;
    private String anos_experiencia;

    public Mecanico(DadosMecanico dados) {
        this.nome = dados.nome();
        this.anos_experiencia = dados.anos_experiencia();
    }

    public void atualizarInformacoes(DadosMecanico dados) {
        if (dados.nome() != null)
            this.nome = dados.nome();
        if (dados.anos_experiencia() != null)
            this.nome = dados.anos_experiencia();
    }
}
