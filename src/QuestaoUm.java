import java.util.Scanner;
public class QuestaoUm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do empréstimo:");
        double valorTotalDevido = scanner.nextDouble();

        System.out.println("Insira a taxa de juros convertida para decimal (ex: 10% = 0.1):");
        double taxaDejuros = scanner.nextDouble();

        System.out.println("Insira a quantidade de meses para pagamento:");
        int totalDeMeses = scanner.nextInt();

        double amortizacao = valorTotalDevido / totalDeMeses;

        double valorDevido = valorTotalDevido;

        System.out.println("Valor fixo da amortização R$ " + String.format("%.2f", amortizacao) + ", Saldo devedor total R$ " + String.format("%.2f", valorTotalDevido) + " com uma taxa de juros de " + (taxaDejuros * 100) + "% ao mês");

        double totalParcelas = 0;
        double totalAmortizado = 0;
        double totalJuros = 0;

        for (int item = 1; item <= totalDeMeses; item++) {

            double jurosMensal = valorDevido * taxaDejuros;

            double parcela = jurosMensal + amortizacao;

            valorDevido -= amortizacao;

            totalParcelas += parcela;
            totalAmortizado += amortizacao;
            totalJuros += jurosMensal;


            System.out.println("Parcela " + item + " | Juros: R$ " + String.format("%.2f", jurosMensal) + " | Prestação: R$ " + String.format("%.2f", parcela) + " | Saldo devedor: R$ " + String.format("%.2f", valorDevido));
        }

        System.out.println("Total: Prestação R$ " + String.format("%.2f", totalParcelas) + ", Juros R$ " + String.format("%.2f", totalJuros) + ", Amortização R$ " + String.format("%.2f", totalAmortizado));

    }
}
