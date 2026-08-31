import java.util.Scanner;

public class Questao1 {

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusParaReaumur(double celsius) {
        return celsius * 0.8;
    }

    public static double celsiusParaRankine(double celsius) {
        return celsius * 1.8 + 491.67;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();

        System.out.printf("Fahrenheit: %.3f%n", celsiusParaFahrenheit(celsius));
        System.out.printf("Kelvin: %.2f%n", celsiusParaKelvin(celsius));
        System.out.printf("Réaumur: %.3f%n", celsiusParaReaumur(celsius));
        System.out.printf("Rankine: %.3f%n", celsiusParaRankine(celsius));

        sc.close();
    }
}