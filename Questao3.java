import java.util.Scanner;

public class Questao3 {

    public static double calcularMediaSalarial(double[] salarios) {
        double soma = 0;
        for (double s : salarios) {
            soma += s;
        }
        return soma / salarios.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeFuncionarios = sc.nextInt();
        double[] salarios = new double[quantidadeFuncionarios];

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            salarios[i] = sc.nextDouble();
        }

        System.out.printf("Média salarial: %.2f%n", calcularMediaSalarial(salarios));

        sc.close();
    }
}