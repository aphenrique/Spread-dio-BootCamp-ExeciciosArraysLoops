import java.io.Console;
import java.util.Scanner;

public class MaiorMedia {

    // Maior e Média: Faça um programa que leia 5 números e informe o maior número e
    // a média desses números.
    MaiorMedia() {
        Print print = new Print();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        do {
            App.limpaConsole();
            print.println("Insira 5 valores e receba a média");

            float[] valores = new float[5];

            for (int i = 0; i < 5; i++) {
                print.print("valor " + (i + 1) + ": ");
                valores[i] = scan.nextFloat();
            }

            print.print("Média: ");
            print.println(Float.toString(calculaMedia(valores)));

            do {
                print.print("Deseja repetir o exercício? [s] sim [n] Não: ");

                // A classe console foi preferida neste contexto por permitir que a entrada seja
                // recebida, mesmo que vazia. Na prática, permite que o usuário veja a resposta
                // antes de realizar uma ação
                Console console = System.console();
                String entrada = console.readLine();

                if (entrada.equals("s"))
                    break;

                if (entrada.equals("n")) {
                    exit = true;
                    break;
                }

            } while (true);
        } while (!exit);
    }

    public float calculaMedia(float valores[]) {
        float media = 0.0f;

        for (float valor : valores) {
            media += valor;
        }
        media = media / valores.length;
        return media;
    }
}