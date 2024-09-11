import java.util.Scanner;

public class SegitigaChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan panjang sisi kedua: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan panjang sisi ketiga: ");
        int c = scanner.nextInt();


        if (isSegitiga(a, b, c)) {
            System.out.println("Angka-angka tersebut dapat membentuk segitiga.");
        } else {
            System.out.println("Angka-angka tersebut tidak dapat membentuk segitiga.");
        }
    }

    // Metode untuk memeriksa apakah angka bisa membentuk segitiga
    public static boolean isSegitiga(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
