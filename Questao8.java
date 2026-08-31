import java.util.Scanner;

public class Questao8 {

    public static int calcularHoras(int totalSegundos) {
        return totalSegundos / 3600;
    }

    public static int calcularMinutosRestantes(int totalSegundos) {
        return (totalSegundos % 3600) / 60;
    }

    public static int calcularSegundosRestantes(int totalSegundos) {
        return totalSegundos % 60;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSegundos = sc.nextInt();

        int horas = calcularHoras(totalSegundos);
        int minutos = calcularMinutosRestantes(totalSegundos);
        int segundos = calcularSegundosRestantes(totalSegundos);

        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();
    }
}