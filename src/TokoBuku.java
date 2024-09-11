/**
 * Aplikasi TokoBuku oleh ....
 */
import java.util.Scanner;

public class TokoBuku {
    public static void main(String[] args) {
        Scanner deteksi = new Scanner(System.in);

        System.out.print("Masukan jenis buku yang ingin dipilih (Fiksi/Non-fiksi/Pelajaran): ");
        String jenisBuku = deteksi.nextLine();

        System.out.print("Masukan jumlah buku yang ingin dibeli: ");
        int jumlahBuku = deteksi.nextInt();

        System.out.print("Masukan total harga buku: ");
        double hargaBuku = deteksi.nextDouble();

        double diskon = 0;

        if (jenisBuku.equalsIgnoreCase("Fiksi")) {
            if (jumlahBuku > 1) {
                diskon = 0.10;
            } else {
                diskon = 0.05;
            }
        } else if (jenisBuku.equalsIgnoreCase("Non-fiksi")) {
            if (jumlahBuku > 1) {
                diskon = 0.05;
            } else {
                diskon = 0.03;
            }
        } else if (jenisBuku.equalsIgnoreCase("Pelajaran")) {
            diskon = 0;
        }

        double hasilDiskon = hargaBuku - (hargaBuku * diskon);
        System.out.printf("diskon: %.0f%%\n", diskon * 100);
        System.out.printf("harga setelah di diskon: Rp%.2f", hasilDiskon);
    }
    
}