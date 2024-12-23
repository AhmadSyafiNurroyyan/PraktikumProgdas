import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan nilai = ");
    int a = scan.nextInt();

    for (int x = 1; x <= a; x++) {
      for (int z = a; z > x; z--) {
        System.out.print("  ");
      }
      for (int k = 1; k <= x; k++) {
        System.out.print("* ");
      }
      System.out.println("");
    }

    scan.close();
  }
}