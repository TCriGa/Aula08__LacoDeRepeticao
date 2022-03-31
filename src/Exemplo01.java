import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner repeticao = new Scanner(System.in);
        System.out.print("Digite a quantidade de repetições: ");
        int qtdRepeticao = repeticao.nextInt();

        for (int i = 1; i < qtdRepeticao; i++) {
            System.out.println(i);

        }
    }
}
