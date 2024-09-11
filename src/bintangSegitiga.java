import java.util.Scanner;

public class bintangSegitiga {
    public static void main(String[] args) {
        Scanner deteksi = new Scanner(System.in);

        System.out.println("masukan tinggi segitiga: ");
        int tinggi = deteksi.nextInt();

        for (int plus = 1; plus <= tinggi; plus++) {
            for (int spasi = 1; spasi <= tinggi - plus ; spasi++) {
                System.out.print(" ");
            }
            for (int bintang = 1; bintang <= 2 * plus - 1; bintang++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
