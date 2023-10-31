import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoBancario = 1000.00;
        System.out.println("***************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome:                Matheus Albani");
        System.out.println("Tipo de conta:       Conta Corrente");
        System.out.println("Saldo inicial:       R$ "+ saldoBancario);
        System.out.println("***************************************");

        int botao = 0;

        while (botao != 4) {
            System.out.println("Operações");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            botao = scanner.nextInt();






        }
    }
}
