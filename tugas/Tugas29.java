import java.util.Scanner;

public class Tugas29 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

    while (n < 3) {
    System.out.print("Nilai n minimal 3! Masukkan lagi = ");
    n = sc.nextInt();
        }

    int total = 0;
    int x = 0; 
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
        x = i * j;
        System.out.printf("%4d", x);
        total = total + x;
        }
        System.out.println();
    }

    System.out.println("Jumlah seluruh angka: " + total);
    sc.close();
    }

}
