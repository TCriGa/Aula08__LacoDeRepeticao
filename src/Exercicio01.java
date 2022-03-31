public class Exercicio01 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);

            System.out.println("Outra forma de fazer");

            for (int n = 0; n <= 100; n++) {
                if (n % 2 == 0) {
                    System.out.println(i);

                }

            }

        }
    }
}
