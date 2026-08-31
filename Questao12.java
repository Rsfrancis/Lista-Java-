import java.util.Scanner;

public class Questao12 {

    public static int calcularSoma(int[] numeros, int quantidade) {
        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += numeros[i];
        }
        return soma;
    }

    public static double calcularMedia(int soma, int quantidade) {
        return quantidade > 0 ? (double) soma / quantidade : 0;
    }

    public static int encontrarMaior(int[] numeros, int quantidade) {
        int maior = numeros[0];
        for (int i = 1; i < quantidade; i++) {
            if (numeros[i] > maior) maior = numeros[i];
        }
        return maior;
    }

    public static int encontrarMenor(int[] numeros, int quantidade) {
        int menor = numeros[0];
        for (int i = 1; i < quantidade; i++) {
            if (numeros[i] < menor) menor = numeros[i];
        }
        return menor;
    }

    public static int contarPares(int[] numeros, int quantidade) {
        int qtd = 0;
        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] % 2 == 0) qtd++;
        }
        return qtd;
    }

    public static int contarImpares(int[] numeros, int quantidade) {
        int qtd = 0;
        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] % 2 != 0) qtd++;
        }
        return qtd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[1000];
        int quantidade = 0;
        int valor;

        while ((valor = sc.nextInt()) != -1) {
            numeros[quantidade] = valor;
            quantidade++;
        }

        int soma = calcularSoma(numeros, quantidade);

        System.out.println("Quantidade de números: " + quantidade);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + calcularMedia(soma, quantidade));
        System.out.println("Maior número: " + encontrarMaior(numeros, quantidade));
        System.out.println("Menor número: " + encontrarMenor(numeros, quantidade));
        System.out.println("Quantidade de pares: " + contarPares(numeros, quantidade));
        System.out.println("Quantidade de ímpares: " + contarImpares(numeros, quantidade));

        sc.close();
    }
}