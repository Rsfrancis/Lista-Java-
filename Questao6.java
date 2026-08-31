import java.util.Scanner;

public class Questao6 {

    static final double GRAVIDADE = 9.81;
    static final double FATOR_CONVERSAO_HP = 745.6999;

    public static double calcularPotenciaEmHP(double massa, double altura, double tempo) {
        double potenciaWatts = (massa * GRAVIDADE * altura) / tempo;
        return potenciaWatts / FATOR_CONVERSAO_HP;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double massa = sc.nextDouble();
        double altura = sc.nextDouble();
        double tempo = sc.nextDouble();

        double potenciaHP = calcularPotenciaEmHP(massa, altura, tempo);

        System.out.printf("Potência necessária: %.3f hp%n", potenciaHP);

        sc.close();
    }
}