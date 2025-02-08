package edu.br.iesb.poo2024.modelagem.arthursavio;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Arthur", "Rua 2, 123", "(61) 98244-9894");
        Animal animal = new Animal("Spook", "Cachorro", "Shih Tzu", 5);
        Veterinario veterinario = new Veterinario("Dr. Pablo Marçal", "(61) 98323-9252");
        Secretaria secretaria = new Secretaria();

        Date data = new Date(); // Data atual
        secretaria.agendarConsulta(cliente, animal, veterinario, data);

        try {
            Consulta consulta = new Consulta(data, animal, veterinario);
            consulta.registrarSintomas("Febre e perda de apetite");
            consulta.registrarDiagnostico("Gripe canina");

            Exame exame = new Exame("");
            consulta.solicitarExame(exame);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
