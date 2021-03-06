import java.io.Console;
import java.util.Scanner;

public class App {
    static Print print = new Print();

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int option;
        boolean exit = false;

        do {
            limpaConsole();
            printOptions();
            option = scan.nextInt();

            switch (option) {
            case 1:
                new NomeIdade();
                break;
            case 2:
                new Nota();
                break;
            case 3:
                new MaiorMedia();
                break;
            case 4:
                new ParImpar();
                break;
            case 5:
                new Tabuada();
                break;
            case 6:
                new Fatorial();
                break;
            case 0:
                limpaConsole();
                exit = true;
                break;

            default:
                print.println("\nEsta opção não é válida");
                print.print("Pressione [Enter] para continuar e selecionar uma opção válida ");
                Console console = System.console();
                console.readLine();
                break;
            }

        } while (!exit);

        scan.close();

    }

    static void printOptions() {

        print.println("Exercícios das aulas de estrutura de repetição e arrays em java");
        print.println("===============================================================\n");
        print.println("1 - Nome e idade");
        print.println("2 - Nota");
        print.println("3 - Maior e média");
        print.println("4 - Par e ímpar");
        print.println("5 - Tabuada");
        print.println("6 - Fatorial");
        print.println("0 - Sair");
        print.println("");
        print.print("Insira o número do exercício para realizar: ");

    }

    public static void limpaConsole() {
        try {
            // Limpa a tela no windows, no linux e no MacOS
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else

                Runtime.getRuntime().exec("clear");

        } catch (Exception e) {
            print.println(e.toString());
        }

    }

}