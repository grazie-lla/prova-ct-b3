import java.util.Scanner;

public class QuestaoTres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        for (int item = 1; item <= numero; item+=2) {

            for (int espaco = 1; espaco <= (numero - item) / 2; espaco++) {
                System.out.print(" ");
            }

            for (int astericos = 1; astericos <= item; astericos++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int item = numero - 2; item >= 1; item -= 2) {

            for (int espaco = 1; espaco <= (numero - item) / 2; espaco++) {
                System.out.print(" ");
            }

            for (int astericos = 1; astericos <= item; astericos++) {
                System.out.print("*");
            }

            System.out.println();
        }




        scanner.close();
    }

}

