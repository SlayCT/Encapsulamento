package br.edu.fatecpg.banco.view;
import br.edu.fatecpg.banco.model.ContaBancaria;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, saldo);

        System.out.println("\nSaldo atual: " + conta.getSaldo());

        System.out.print("Valor para depósito: ");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);

        System.out.println("Saldo após depósito: " + conta.getSaldo());

        System.out.print("Valor para saque: ");
        double saque = sc.nextDouble();
        conta.sacar(saque);

        System.out.println("Saldo final: " + conta.getSaldo());

        sc.close();
    }
}