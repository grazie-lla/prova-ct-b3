import java.util.Scanner;

public class QuestaoDois {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do carro a ser parcelado em reais:");
        double precoDoCarro = scanner.nextDouble();

        double valorMinimoParcela = 1000;

        int maximoParcelas = (int) (precoDoCarro / valorMinimoParcela);

        if (precoDoCarro / maximoParcelas < valorMinimoParcela){
            maximoParcelas--;
        }

        double valorParcela = precoDoCarro / maximoParcelas;


        System.out.println("Você pode parcelar o carro em no máximo " + maximoParcelas + " parcelas de R$" + String.format("%.2f", valorParcela) + " cada.");

        scanner.close();
    }
}
