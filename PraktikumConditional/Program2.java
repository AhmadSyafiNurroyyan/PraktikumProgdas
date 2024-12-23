import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Berat badan (kg): ");
    int beratBadan = scan.nextInt();
    System.out.print("Tinggi badan (m): ");
    float tinggiBadan = scan.nextFloat();

    double hitungIMT = beratBadan / (tinggiBadan * tinggiBadan);
    if (hitungIMT <= 18.5) {
      System.out.printf("IMT = %.2f%s", hitungIMT, "  Termasuk kurus");
    } else if (hitungIMT > 18.5 && hitungIMT <= 25) {
      System.out.printf("IMT = %.2f%s", hitungIMT, "  Termasuk normal");
    } else if (hitungIMT > 25 && hitungIMT <= 30) {
      System.out.printf("IMT = %.2f%s", hitungIMT, "  Termasuk gemuk");
    } else {
      System.out.printf("IMT = %.2f%s", hitungIMT, "  Termasuk kegemukan");
    }

    scan.close();
  }
}