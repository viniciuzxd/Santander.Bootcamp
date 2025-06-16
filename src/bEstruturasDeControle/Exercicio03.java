package bEstruturasDeControle;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var numero1 = scanner.nextInt();
        System.out.println("Digite um segundo número maior que o anterior: ");
        var numero2 = scanner.nextInt();
        System.out.println("Digite se quer 'par' ou 'impar': ");
        var escolha = scanner.next().toLowerCase();

        for (int i = numero2; i >= numero1; i--) {
            if (escolha.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
