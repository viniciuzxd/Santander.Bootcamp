package bEstruturasDeControle;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        var altura = scanner.nextFloat();
        System.out.println("Informe seu peso: ");
        var peso = scanner.nextFloat();

        var imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc <= 24.9) {
            System.out.println("Peso normal");
        }
        else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        }
        else if (imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        }
        else if (imc <= 39.9) {
            System.out.println("Obesidade grau 2 (Severa)");
        }
        else {
            System.out.println("Obesidade grau 3(Mórbida)");
        }
    }
}
