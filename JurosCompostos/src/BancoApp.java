import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        // TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os
        // juros.

        double total = 1 + taxaJuros;
        double x = Math.pow(total, periodo);
        double saida = valorInicial * x;

        System.out.println("Valor final do investimento: R$ " + df.format(saida));

        scanner.close();
    }
}

// M = C ( 1+i)t.
