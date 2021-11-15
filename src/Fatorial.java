import java.io.Console;
import java.util.Scanner;

public class Fatorial {
    // Fatorial: Faça um programa que calcule o fatorial de um número inteiro
    // fornecido pelo usuário.
    Print print = new Print();
    Scanner scan = new Scanner(System.in);
    Console console = System.console();

    int total;

    Fatorial() {
        App.limpaConsole();

        total = 0;

        print.print("Insira um número para que seja cauculado seu fatorial: ");
        int valor = receberInteiro();

        print.print(valor + "! = ");

        calcularFatorial(valor);

        print.print(" = " + total);

        print.println("\n\nPressione [Enter] para sair");
        System.console().readLine();

    }

    void calcularFatorial(int valor) {
        print.print(Integer.toString(valor));
        if (valor < 1)
            return;
        print.print(".");
        total += valor;
        calcularFatorial(valor - 1);
    }

    int receberInteiro() {
        int value = 0;
        do {
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                break;
            }
            scan.next();
            print.print("Por favor, insira um inteiro: ");

        } while (true);

        return value;
    }
}
