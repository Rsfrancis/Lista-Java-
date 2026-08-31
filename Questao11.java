import java.util.Scanner;

public class Questao11 {

    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        for (int n : numeros) {
            if (n > maior) maior = n;
        }
        return maior;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int n : numeros) {
            if (n < menor) menor = n;
        }
        return menor;
    }

    public static int contarPares(int[] numeros) {
        int quantidade = 0;
        for (int n : numeros) {
            if (n % 2 == 0) quantidade++;
        }
        return quantidade;
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return (double) soma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_NUMEROS = 10;

        int[] numeros = new int[TOTAL_NUMEROS];
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Maior número: " + encontrarMaior(numeros));
        System.out.println("Menor número: " + encontrarMenor(numeros));
        System.out.println("Quantidade de pares: " + contarPares(numeros));
        System.out.println("Média: " + calcularMedia(numeros));

        sc.close();
    }
}