package Aulas;

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite a idade do seu amigo: ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.printf("A diferença de idade é de %s anos", diferenca);
    }
}
