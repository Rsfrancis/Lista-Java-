import java.util.Scanner;

public class Questao4 {

    public static int calcularQuantidadeAzulejos(double alturaParede, double larguraParede,
                                                   double alturaAzulejo, double larguraAzulejo) {
        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;
        double quantidadeExata = areaParede / areaAzulejo;
        return (int) Math.ceil(quantidadeExata);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double alturaParede = sc.nextDouble();
        double larguraParede = sc.nextDouble();
        double alturaAzulejo = sc.nextDouble();
        double larguraAzulejo = sc.nextDouble();

        int quantidade = calcularQuantidadeAzulejos(alturaParede, larguraParede, alturaAzulejo, larguraAzulejo);

        System.out.println("Quantidade de azulejos necessários: " + quantidade);

        sc.close();
    }
}