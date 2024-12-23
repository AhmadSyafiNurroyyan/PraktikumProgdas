import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final double phi = 3.14;
    double panjang, lebar, tinggi, jariJari;
    boolean b = true;
    String y;

    for (; b;) {
      System.out.println("MENU\n0. KELUAR \n1. HITUNG VOLUME BALOK \n2. HITUNG VOLUME BOLA \n3. HITUNG VOLUME KERUCUT \n4. HITUNG VOLUME SILINDER \n5. HITUNG VOLUME LIMAS SEGITIGA\n");
      System.out.print("MASUKKAN PILIHAN ANDA: ");
      int pilihan = scan.nextInt();

      switch (pilihan) {
        case 0:
          System.out.println("ANDA TELAH KELUAR DARI PROGRAM");
          b = !true;
          break;
        case 1:
          System.out.print("Masukkan panjang (cm): ");
          panjang = scan.nextDouble();
          System.out.print("Masukkan lebar (cm): ");
          lebar = scan.nextDouble();
          System.out.print("Masukkan tinggi (cm): ");
          tinggi = scan.nextDouble();
          double volumeBalok = panjang * tinggi * lebar;
          System.out.printf("VOLUME BALOK = %.1f%s", volumeBalok, " cm3\n");
          y = scan.nextLine();
          y = scan.nextLine();
          break;
        case 2:
          System.out.print("Masukkan jari-jari bola (cm): ");
          jariJari = scan.nextDouble();
          double volumeBola = (4 / 3.0) * phi * (jariJari * jariJari * jariJari);
          System.out.printf("VOLUME BOLA = %.2f%s", volumeBola, " cm3\n");
          y = scan.nextLine();
          y = scan.nextLine();
          break;
        case 3:
          System.out.print("Masukkan jari-jari alas kerucut (cm): ");
          jariJari = scan.nextDouble();
          System.out.print("Masukkan tinggi kerucut (cm): ");
          tinggi = scan.nextDouble();
          double volumeKerucut = (1 / 3.0) * phi * (jariJari * jariJari) * tinggi;
          System.out.printf("VOLUME KERUCUT = %.2f%s", volumeKerucut, " cm3\n");
          y = scan.nextLine();
          y = scan.nextLine();
          break;
        case 4:
          System.out.print("Masukkan tinggi (cm): ");
          tinggi = scan.nextDouble();
          System.out.print("Masukkan jari-jari alas (cm): ");
          jariJari = scan.nextDouble();
          double volumeSilinder = tinggi * phi * (jariJari * jariJari);
          System.out.printf("VOLUME SILINDER = %.1f%s", volumeSilinder, " cm3\n");
          y = scan.nextLine();
          y = scan.nextLine();
          break;
        case 5:
          System.out.print("Masukkan alas segitiga (cm): ");
          panjang = scan.nextDouble();
          System.out.print("Masukkan tinggi segitiga alas (cm): ");
          tinggi = scan.nextDouble();
          System.out.print("Masukkan tinggi limas (cm): ");
          double tinggiLimas = scan.nextDouble();
          double volumeLimas = (double) (1 / 3.0 * tinggiLimas) * (0.5 * panjang * tinggi);
          System.out.printf("VOLUME LIMAS SEGITIGA = %.2f%s", volumeLimas, " cm3\n");
          y = scan.nextLine();
          y = scan.nextLine();
          break;
        default:
          System.out.println("Masukkan input yang valid!\n");
          y = scan.nextLine();
          y = scan.nextLine();
          break;
      }
    }
    scan.close();
  }
}
