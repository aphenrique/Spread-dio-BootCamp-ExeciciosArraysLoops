import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class ParImpar {
    // Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a
    // quantidade de números pares e a quantidade de números impares.

    Print print = new Print();
    Scanner scan = new Scanner(System.in);
    Console console = System.console();
    boolean exit = false;

    ParImpar() {
        App.limpaConsole();

        print.println("Coloque uma quantidade de números para descobrirmos a quantidade de pares e ímpares\n");
        print.print("Especifique a quantidade de números que deseja inserir: ");
        int[] inteiros = new int[receberInteiro()];

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < inteiros.length; i++) {
            print.print(i + 1 + " inteiro: ");
            inteiros[i] = receberInteiro();
            if ((inteiros[i] % 2) == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        print.println("");
        print.println("Estes são os valores: " + Arrays.toString(inteiros));

        print.println("Total de pares: " + pares);
        print.println("Total de Ímpares: " + impares);

        print.println("\nPressione [Enter] para sair");
        console.readLine();
    }

    int receberInteiro() {
        int value = 0;
        do {
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                break;
            }
            scan.next();
            print.print("Valor inválido! \nPor favor, insira um valor válido: ");

        } while (true);

        return value;
    }
}
