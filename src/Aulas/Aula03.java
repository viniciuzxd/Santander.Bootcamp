package Aulas;

import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.printf("O valor da area é de: ", area);


    }
}
