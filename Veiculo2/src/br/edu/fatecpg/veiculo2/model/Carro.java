package br.edu.fatecpg.veiculo2.model;

public class Carro {

    private String marca;
    private double consumo;
    private double combustivel;
    private double capacidadeTanque;

    // Construtor
    public Carro(String marca, double consumo, double combustivel, double capacidadeTanque) {
        this.marca = marca;
        this.consumo = consumo;
        this.combustivel = combustivel;
        this.capacidadeTanque = capacidadeTanque;
    }

    // GETTERS
    public String getMarca() {
        return marca;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    // SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    // AUTONOMIA
    public double calcularAutonomia() {
        return consumo * combustivel;
    }

    // NOVO MÉTODO (PEDIDO)
    public double calcularValorEncherTanque(double precoGasolina) {
        double litrosFaltando = capacidadeTanque - combustivel;
        return litrosFaltando * precoGasolina;
    }
}