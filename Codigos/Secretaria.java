package edu.br.iesb.poo2024.modelagem.arthursavio;

import java.util.Date;

public class Secretaria {

    public void agendarConsulta(Cliente cliente, Animal animal, Veterinario veterinario, Date data) {
        try {
            if (cliente == null || animal == null || veterinario == null || data == null) {
                throw new IllegalArgumentException("Parâmetros inválidos para o agendamento da consulta.");
            }
            System.out.println("Consulta agendada para o cliente " + cliente.getNome() + " e o animal " + animal.getNome());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao agendar consulta: " + e.getMessage());
        }
    }

    public void atualizarCadastro(Cliente cliente, Animal animal) {
        try {
            if (cliente == null || animal == null) {
                throw new NullPointerException("Cliente ou animal inválido.");
            }
            System.out.println("Cadastro atualizado com sucesso!");
        } catch (NullPointerException e) {
            System.out.println("Erro ao atualizar cadastro: " + e.getMessage());
        }
    }
}
