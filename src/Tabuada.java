import java.io.Console;
import java.util.Scanner;

public class Tabuada {
    // Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
    // qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero
    // ele deseja ver a tabuada.

    Print print = new Print();
    Scanner scan = new Scanner(System.in);
    Console console = System.console();

    Tabuada() {

        App.limpaConsole();
        boolean exit = false;
        do {
            print.print("Insira um número entre 0 e 10: ");
            int numero = receberInteiro();

            if (numero >= 0 && numero <= 10) {
                exit = true;

                print.println("Tabuada do " + numero + "\n");
                printTabuada(numero);

                print.println("Pressione [Enter] para sair");
                console.readLine();
            } else {
                print.println("Valor inválido, pressione [Enter] para inserir um novo valor");
                console.readLine();
            }
        } while (!exit);

    }

    void printTabuada(int valor) {
        for (int i = 1; i <= 20; i++) {

            print.print(valor + " X " + i + " = " + valor * i);
            print.print("\t");
            print.print(valor + " X " + (i + 20) + " = " + valor * (i + 20));
            print.print("\t");
            print.print(valor + " X " + (i + 40) + " = " + valor * (i + 40));
            print.print("\t");
            print.print(valor + " X " + (i + 60) + " = " + valor * (i + 60));
            print.print("\t");
            print.print(valor + " X " + (i + 80) + " = " + valor * (i + 80));
            print.print("\t");
            print.println("");
        }
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
