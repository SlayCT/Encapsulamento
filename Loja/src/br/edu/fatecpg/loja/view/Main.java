package br.edu.fatecpg.loja.view;
import br.edu.fatecpg.loja.model.Produto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = sc.nextInt();

        Produto p = new Produto(nome, preco, quantidade);

        System.out.println("\n--- Dados do Produto ---");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidadeEstoque());

        // TESTANDO ERROS 
        System.out.println("\n--- Testando valores inválidos ---");

        p.setPreco(-50); 
        p.setQuantidadeEstoque(-10); 

        System.out.println("\n--- Valores após tentativa inválida ---");
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Quantidade: " + p.getQuantidadeEstoque());

        sc.close();
    }
}
