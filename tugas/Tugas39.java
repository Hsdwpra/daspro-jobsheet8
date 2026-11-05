import java.util.Scanner;

public class Tugas39 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah toko = ");
    int jumlahToko = sc.nextInt();
    while (jumlahToko < 1) {
        System.out.print("Jumlah toko minimal 1! Masukkan lagi = ");
        jumlahToko = sc.nextInt();
        }

    int totalSemua = 0;
    int tokoTerbanyak = 1;
    int barangTerbanyak = -1;

    for (int toko = 1; toko <= jumlahToko; toko++) {
        System.out.print("Jumlah pelanggan toko " + toko + " = ");
        int pelanggan = sc.nextInt();
        while (pelanggan < 0) {
            System.out.print("Tidak boleh negatif! Masukkan lagi = ");
            pelanggan = sc.nextInt();
        }

        int totalBarangToko = 0;
        for (int p = 1; p <= pelanggan; p++) {
        System.out.print("Jumlah barang pelanggan " + p + " = ");
        int barang = sc.nextInt();
        while (barang < 0) {
                System.out.print("Tidak boleh negatif! Masukkan lagi = ");
                barang = sc.nextInt();
        }
        totalBarangToko += barang;
        }

        System.out.println("Toko " + toko + " - pelanggan: " + pelanggan + ", total barang: " + totalBarangToko);
        totalSemua += totalBarangToko;

        if (totalBarangToko > barangTerbanyak) {
        barangTerbanyak = totalBarangToko;
        tokoTerbanyak = toko;
        }
    }

    System.out.println("Total barang seluruh toko: " + totalSemua);
    System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
    sc.close();
    }

}
