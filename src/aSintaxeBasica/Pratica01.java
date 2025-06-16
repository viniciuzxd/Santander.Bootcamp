package aSintaxeBasica;

import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 5 + 5: ");
        var resultado = scanner.nextInt();
        var isRight = resultado == 10;
        System.out.printf("O rsultado é 10, você acertou? (%s)", isRight);
    }
}
