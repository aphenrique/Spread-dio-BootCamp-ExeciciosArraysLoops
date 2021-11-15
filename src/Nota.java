import java.io.Console;
import java.util.Scanner;

public class Nota {
    // Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma
    // mensagem caso o valor seja inválido e continue pedindo até que o usuário
    // informe um valor válido.

    Print print = new Print();
    Scanner scan = new Scanner(System.in);
    Console console = System.console();
    boolean exit = false;

    Nota() {
        do {
            App.limpaConsole();
            print.print("Insira uma nota entre 0 e 10: ");
            int nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) {
                exit = true;

                print.println("Nota válida\n");
                print.println("Pressione [Enter] para sair");
                console.readLine();
            } else {
                print.println("Valor inválido, pressione [Enter] para inserir um novo valor");
                console.readLine();
            }
        } while (!exit);
    }

}
