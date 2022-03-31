import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner par = new Scanner(System.in);
        System.out.print("Digite a um numero: ");
        int n1 = par.nextInt();
        int i = 0;

        // Feito com For
        for (i = 0; i <= n1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

            // Feito com do/while

            do {
                if (i % 2 == 0) {
                    System.out.println(i);

                    i++;
                }

            } while (i >= n1);

        }
    }
}
