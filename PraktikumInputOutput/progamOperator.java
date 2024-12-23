import java.util.Scanner;

public class progamOperator {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.printf("Masukkan operator pertama: %s", " ");
    float bil1 = scan.nextFloat();
    System.out.printf("Masukkan operator kedua %2s%2s", ":", " ");
    float bil2 = scan.nextFloat();

    System.out.printf("\t %s%2s%.0f \n", "Hasil penjumlahan", ":", (bil1 + bil2));
    System.out.printf("\t %s%2s%.0f \n", "Hasil pengurangan", ":", (bil1 - bil2));
    System.out.printf("\t %s%4s%.0f \n", "Hasil perkalian", ":", (bil1 * bil2));
    System.out.printf("\t %s%4s%.1f \n", "Hasil pembagian", ":", (bil1 / bil2));

    scan.close();
  }
}