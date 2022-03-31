import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner tabuada2 = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n2 = tabuada2.nextInt();

        int resultado = 0;
        int z = 0;

        do {

            resultado = z * n2;
            System.out.println(n2 + " x " + z + " = " + resultado);

            z++;

        } while (z <= 10);

    }
}
