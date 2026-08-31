import java.util.Scanner;

public class Questao7 {

    public static long calcularFatorial(int numero) {
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        System.out.println("Fatorial: " + calcularFatorial(numero));

        sc.close();
    }
}