package Aulas;

import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        var anoat = 2025;
        var scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        var nome = scanner.nextLine();

        System.out.println("Qual seu ano de nascimento? ");
        var ano = scanner.nextInt();

        var idade = anoat - ano;

        System.out.printf("Olá, %s, Você tem %s anos", nome, idade);
    }
}

