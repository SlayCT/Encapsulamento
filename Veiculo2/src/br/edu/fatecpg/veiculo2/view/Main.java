package br.edu.fatecpg.veiculo2.view;
import java.util.Scanner;
import br.edu.fatecpg.veiculo2.model.Carro;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Marca do carro: ");
        String marca = sc.nextLine();

        System.out.print("Consumo (km/l): ");
        double consumo = sc.nextDouble();

        System.out.print("Combustível atual (litros): ");
        double combustivel = sc.nextDouble();

        System.out.print("Capacidade do tanque (litros): ");
        double capacidade = sc.nextDouble();

        Carro carro = new Carro(marca, consumo, combustivel, capacidade);

        System.out.println("\nAutonomia: " + carro.calcularAutonomia() + " km");

        System.out.print("Preço da gasolina: ");
        double preco = sc.nextDouble();

        System.out.println("Valor para encher o tanque: R$ " + carro.calcularValorEncherTanque(preco));

        sc.close();
    }
}