import java.util.Scanner;

public class Questao2 {

    public static double maiorAltura(double[] alturas) {
        double maior = alturas[0];
        for (double a : alturas) {
            if (a > maior) maior = a;
        }
        return maior;
    }

    public static double menorAltura(double[] alturas) {
        double menor = alturas[0];
        for (double a : alturas) {
            if (a < menor) menor = a;
        }
        return menor;
    }

    public static double mediaAlturaHomens(double[] alturas, int[] sexos) {
        double soma = 0;
        int quantidade = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (sexos[i] == 2) {
                soma += alturas[i];
                quantidade++;
            }
        }
        return quantidade > 0 ? soma / quantidade : 0;
    }

    public static int quantidadeMulheres(int[] sexos) {
        int quantidade = 0;
        for (int s : sexos) {
            if (s == 1) quantidade++;
        }
        return quantidade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_PESSOAS = 10;

        int[] sexos = new int[TOTAL_PESSOAS];
        double[] alturas = new double[TOTAL_PESSOAS];

        for (int i = 0; i < TOTAL_PESSOAS; i++) {
            sexos[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
        }

        System.out.printf("Maior altura: %.2f m%n", maiorAltura(alturas));
        System.out.printf("Menor altura: %.2f m%n", menorAltura(alturas));
        System.out.printf("Média de altura dos homens: %.2f m%n", mediaAlturaHomens(alturas, sexos));
        System.out.println("Número de mulheres: " + quantidadeMulheres(sexos));

        sc.close();
    }
}