package edu.br.iesb.poo2024.modelagem.arthursavio;

public class Exame {
    private String tipo;
    private String resultado;

    public Exame(String tipo) throws IllegalArgumentException {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("O tipo de exame não pode ser nulo ou vazio.");
        }
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void registrarResultado(String resultado) throws IllegalStateException {
        if (this.tipo == null) {
            throw new IllegalStateException("Exame não configurado corretamente.");
        }
        this.resultado = resultado;
        System.out.println("Resultado do exame: " + resultado);
    }
}
