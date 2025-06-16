package bEstruturasDeControle;

import java.util.Scanner;

public class Aula01 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        var idade = scanner.nextInt();
        System.out.println("É emancipado: (s/n)");
        var emancipado = scanner.next().equalsIgnoreCase("S");

        var canDrive = idade >= 18 || (idade >= 16 && emancipado);
        var menssage = canDrive ?
                nome + ", você poe dirigir.":
                nome + ", você não pode dirigir.";
        System.out.println(menssage);

        if ((idade >=18) || (idade >= 16 && emancipado))
            System.out.printf("%s, você pode dirigir.", nome);
        else
            System.out.printf("%s, você não pode dirigir.", nome);

        if (idade >= 18)
            System.out.println("Você pode dirigir!");
        else if (idade >= 16 && emancipado) {
            System.out.println("Você pode dirigir.");
        } else
            System.out.printf("%s, você não pode dirigir.", nome);
    }
}
