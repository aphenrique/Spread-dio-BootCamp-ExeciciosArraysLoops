import java.util.Scanner;

public class NomeIdade {
    Scanner scan = new Scanner(System.in);
    Print print = new Print();

    NomeIdade() {
        // Nome e Idade: Faça um programa que leia conjuntos de dois valores,
        // o primeiro representando a matrícula do aluno e o segundo representando
        // a sua altura em centímetros. (Pare inserindo o valor 0 no campo nome)

        App.limpaConsole();

        String nome;
        int idade;

        print.println("Insira o nome e a idade");
        print.println("Para sair, digite \"0\" no campo nome\n");

        while (true) {
            print.print("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) {
                break;
            }

            print.print("idade: ");
            idade = scan.nextInt();
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
            print.print("Valor inválido! \nPor favor, insira um valor válido: ");

        } while (true);

        return value;
    }
}
