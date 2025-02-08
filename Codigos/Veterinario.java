package edu.br.iesb.poo2024.modelagem.arthursavio;

public class Veterinario {
    private String nome;
    private String crm;

    public Veterinario(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public String diagnosticar(Consulta consulta, String diagnostico) {
        consulta.registrarDiagnostico(diagnostico);
        return diagnostico;
    }
}
