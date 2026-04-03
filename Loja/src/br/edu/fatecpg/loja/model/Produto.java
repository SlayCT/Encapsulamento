package br.edu.fatecpg.loja.model;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco); // usa validação
        setQuantidadeEstoque(quantidadeEstoque); // usa validação
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo!");
        }
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Quantidade não pode ser negativa!");
        }
    }
}