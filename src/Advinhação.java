import java.util.Random;
import java.util.Scanner;

public class Advinhação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um numero entre 0 e 100: ");
            int numeroDigitado = scanner.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabens voce acertou o numero em" + tentativas + "tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Número digitado menor que o número gerado.");
            } else {
                System.out.println("Numero digitado maior que o número gerado.");
            }
        }
        if (tentativas == 5){
            System.out.println("Voce nao conseguiu adivinhar o numero. o número gerado era "+ numeroGerado);
        }
    }
}