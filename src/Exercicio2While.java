import java.util.Scanner;
import java.util.jar.Manifest;

public class Exercicio2While {
    public static void main(String[] args) {
        Scanner tabuada2 = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = tabuada2.nextInt();

        int resultado = 0;
        int y = 0;

        while (y <= 10) {
            resultado = y * n1;
            System.out.println(n1 + " x " + y + " = " + resultado);

            y++;
        }
    }
}
