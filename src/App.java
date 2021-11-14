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
                new MaiorMedia();
                break;
            case 0:
                exit = true;
                break;

            default:
                print.println("");
                print.println("Esta opção não é válida");
                print.print("Insira o número do exercício para realizar: ");
                break;
            }

        } while (!exit);

        scan.close();

    }

    static void printOptions() {

        print.println("Exercícios das aulas de estrutura de repetição e arrays em java");
        print.println("===============================================================");
        print.println("1 - Nome e idade");
        print.println("2 - Maior e média");
        print.println("0 - Sair");
        print.println("");
        print.print("Insira o número do exercício para realizar: ");

    }

    private static void limpaConsole() {
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