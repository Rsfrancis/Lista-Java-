import java.util.Scanner;

public class Questao10 {

    public static double calcularTotalCompra(double[] precos, int quantidade) {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += precos[i];
        }
        return total;
    }

    public static double determinarDesconto(double total) {
        if (total > 500) {
            return total * 0.15;
        } else if (total > 200) {
            return total * 0.10;
        } else {
            return 0;
        }
    }

    public static double calcularValorFinal(double total, double desconto) {
        return total - desconto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[1000];
        int quantidade = 0;
        double preco;

        while ((preco = sc.nextDouble()) != 0) {
            precos[quantidade] = preco;
            quantidade++;
        }

        double total = calcularTotalCompra(precos, quantidade);
        double desconto = determinarDesconto(total);
        double valorFinal = calcularValorFinal(total, desconto);

        System.out.printf("Total da compra: %.2f%n", total);
        System.out.printf("Desconto: %.2f%n", desconto);
        System.out.printf("Valor final: %.2f%n", valorFinal);

        sc.close();
    }
}