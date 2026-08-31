import java.util.Scanner;

public class Questao9 {

    public static double calcularMediaAluno(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static String determinarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static double calcularMediaGeralTurma(double[] medias) {
        double soma = 0;
        for (double m : medias) {
            soma += m;
        }
        return soma / medias.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeAlunos = sc.nextInt();
        double[] medias = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = calcularMediaAluno(n1, n2, n3);
            medias[i] = media;

            System.out.println("Aluno " + (i + 1) + " - Média: " + media + " - " + determinarSituacao(media));
        }

        System.out.println("Média geral da turma: " + calcularMediaGeralTurma(medias));

        sc.close();
    }
}