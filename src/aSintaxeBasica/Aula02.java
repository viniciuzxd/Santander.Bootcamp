package aSintaxeBasica;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do lado do quadrado: ");
        int lado = scanner.nextInt();

        int area = lado * lado;

        System.out.printf("O valor da area é de " + area);
    }
}
