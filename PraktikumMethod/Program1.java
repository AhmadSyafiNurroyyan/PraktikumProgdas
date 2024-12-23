import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int pilihan = 0, n = 0, r = 0, hasil;

    do {
      System.out.println("Program Penghitung Kombinasi dan Permutasi");
      System.out.println("1. Menghitung Permutasi");
      System.out.println("2. Menghitung Kombinasi");
      System.out.println("3. Keluar");
      System.out.print("Masukkan pilihan anda : ");
      pilihan = scan.nextInt();

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan nilai n : ");
          n = scan.nextInt();
          System.out.print("Masukkan nilai r : ");
          r = scan.nextInt();
          hasil = hitungPermutasi(n, r);
          System.out.println("\tn\nnPr = ====== = " + hasil + "\n      (n-r) !");
          System.out.println("Maka Hasil Permutasinya adalah : " + hasil + "\n");
          break;
        case 2:
          System.out.print("Masukkan nilai n : ");
          n = scan.nextInt();
          System.out.print("Masukkan nilai r : ");
          r = scan.nextInt();
          hasil = hitungKombinasi(n, r);
          System.out.println("\t  n\nnCr = =========== = " + hasil + "\n      (n-r) ! x r !");
          System.out.println("Maka hasil Kombinasinya adalah : " + hasil + "\n");
          break;
        case 3:
          break;
        default:
          System.out.println("Masukkan input yang valid!");
          System.out.println();
          break;
      }
    } while (pilihan != 3);

    scan.close();
  }

  public static int hitungPermutasi(int n, int r) {
    if (r == 0) {
      return 1;
    }
    return n * hitungPermutasi(n - 1, r - 1);
  }

  public static int hitungKombinasi(int n, int r) {
    if (r == 0 || r == n) {
      return 1;
    }
    return hitungKombinasi(n - 1, r - 1) + hitungKombinasi(n - 1, r);
  }
}
