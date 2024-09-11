import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();
        long hasil = hitungFaktorial(n);

        System.out.println("Faktorial dari " + n + " adalah " + hasil);
    }

    public static long hitungFaktorial(int n) {
        long faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        return faktorial;
    }
}
