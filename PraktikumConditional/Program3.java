import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int totalUpah, upah, lembur, denda;

    System.out.print("Jam Kerja: ");
    int jamKerja = scan.nextInt();

    upah = jamKerja * 5000;

    if (jamKerja > 60) {
      lembur = (jamKerja - 60) * 6000;
      denda = 0;
    } else if (jamKerja < 50) {
      lembur = 0;
      denda = (50 - jamKerja) * 1000;
    } else {
      lembur = 0;
      denda = 0;
    }

    if (jamKerja >= 50 && jamKerja <= 60) {
      totalUpah = upah;
    } else if (jamKerja > 60) {
      totalUpah = upah + lembur;
    } else {
      totalUpah = upah - denda;
    }

    System.out.println("Upah   = Rp. " + upah);
    System.out.println("Lembur = Rp. " + lembur);
    System.out.println("Denda  = Rp. " + denda);
    System.out.println("---------------------");
    System.out.println("Total  = Rp. " + totalUpah);

    scan.close();
  }
}
