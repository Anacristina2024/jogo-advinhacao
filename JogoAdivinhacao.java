import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Scanner para leitura do teclado
        Scanner scanner = new Scanner(System.in);
        // Random para gerar números aleatórios
        Random random = new Random();

        // Gera um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100.");
        System.out.println("Tente adivinhar!");

        int palpite = 0;
        int tentativas = 0;

        // Enquanto o jogador não acertar
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("É maior! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("É menor! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }

        // Fecha o Scanner
        scanner.close();
    }
}
