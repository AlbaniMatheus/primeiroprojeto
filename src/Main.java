import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello World!");

        double nota =0;
        double notaMedia =0;

        for (int i = 0; i <3 ; i++) {

            System.out.println("Qual a sua nota para esse filme?");
            nota = scanner.nextDouble();

            notaMedia += nota;
        }
        System.out.println("A média da nota é " + notaMedia/3 );
    }
}
