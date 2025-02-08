package edu.br.iesb.poo2024.modelagem.arthursavio;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private int idade;

    public Animal(String nome, String especie, String raca, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
    }

    public void atualizarCadastro(String nome, String especie, String raca, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        System.out.println("Cadastro do animal atualizado.");
    }

    public String getNome() {
        return nome;
    }
}
