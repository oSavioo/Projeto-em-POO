package edu.br.iesb.poo2024.modelagem.arthursavio;

import java.util.Date;

public class Consulta {
    private Date data;
    private String sintomas;
    private String diagnostico;
    private Veterinario veterinario;
    private Animal animal;
        public Consulta(Date data, Animal animal, Veterinario veterinario) {
        this.data = data;
        this.animal = animal;
        this.veterinario = veterinario;
    }
    public void registrarSintomas(String sintomas) {
        this.sintomas = sintomas;
        System.out.println("Sintomas registrados: " + sintomas);
    }
    public void registrarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
        System.out.println("Diagnóstico registrado: " + diagnostico);
    }
    public void solicitarExame(Exame exame) {
        System.out.println("Exame solicitado: " + exame.getTipo());
    }
}

