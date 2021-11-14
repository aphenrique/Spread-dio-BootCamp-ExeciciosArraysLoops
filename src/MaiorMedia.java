import java.util.Scanner;

public class MaiorMedia {

    // Maior e Média: Faça um programa que leia 5 números e informe o maior número e
    // a média desses números.
    MaiorMedia() {
        Print print = new Print();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        do {
            print.println("Insira 5 valores e receba a média");

            float[] valores = new float[5];

            for (int i = 0; i < 5; i++) {
                print.print("valor " + (i + 1) + ": ");
                valores[i] = scan.nextFloat();
            }

            print.print("Média: ");
            print.println(Float.toString(calculaMedia(valores)));
            print.print("Deseja repetir o exercício? [s] sim [N] Não");
            
            if (scan.next().contains("s"))
                exit = true;

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