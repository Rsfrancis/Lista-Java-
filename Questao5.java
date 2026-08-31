import java.util.Scanner;

public class Questao5 {

    public static double calcularVolumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double altura = sc.nextDouble();

        double volume = calcularVolumeCilindro(raio, altura);

        System.out.printf("Volume da lata de óleo: %.2f m³%n", volume);

        sc.close();
    }
}