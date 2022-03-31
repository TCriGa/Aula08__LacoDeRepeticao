import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = tabuada.nextInt();

        int total = 0;

        for (int x = 0; x <= 9; x++) {
            total = n * x;
            System.out.println(n + " x " + x + " = " + total);

        }
    }
}
