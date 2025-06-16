package bEstruturasDeControle;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número base: ");
        int base = scanner.nextInt();

        while (true) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();

            if (num < base) {
                System.out.println("Número ignorado (menor que o número base).");
                continue;
            }

            if (num % base != 0) {
                System.out.println("Encerrando, pois o número não é divisível por " + base);
                break;
            }

            System.out.println("Número válido: " + num);
        }

        scanner.close();
    }
}
