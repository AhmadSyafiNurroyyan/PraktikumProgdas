import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int bayar = 0;
    boolean b = true;
    String label = "Jenis      Harga  Diskon  AC         Colokan";
    String dataKeretaApi[][] = {
        { "Ekonomi   ", "5000  ", "2 %    ", "Tidak ada ", "Tidak ada" },
        { "Bisnis    ", "100000", "5 %    ", "Ada       ", "Tidak ada" },
        { "Eksekutif ", "200000", "7 %    ", "Ada       ", "Tidak ada" },
        { "Pariwisata", "300000", "10 %   ", "Ada       ", "Ada      " }
    };
    String[] pesananTiket = new String[10];
    int pesananCount = 0;

    for (; b == true;) {
      System.out.println("1. Melihat Daftar Kereta Api");
      System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
      System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
      System.out.println("4. Memesan Tiket Kereta Api");
      System.out.println("5. Melihat Pesanan Tiket ");
      System.out.println("0. Keluar");

      System.out.print("Masukkan nilai: ");
      int nilai = scan.nextInt();

      switch (nilai) {
        case 0:
          b = false;
          System.out.println("Terima kasih telah menggunakan program");
          break;
        case 1:
          System.out.println(label);
          for (int i = 0; i < dataKeretaApi.length; i++) {
            for (int j = 0; j < dataKeretaApi[0].length; j++) {
              System.out.print(dataKeretaApi[i][j] + " ");
            }
            System.out.println("");
          }
          scan.nextLine();
          scan.nextLine();
          break;
        case 2:
          System.out.println(label);
          for (int i = 1; i < dataKeretaApi.length; i++) {
            for (int j = 0; j < dataKeretaApi[0].length; j++) {
              System.out.print(dataKeretaApi[i][j] + " ");
            }
            System.out.println("");
          }
          scan.nextLine();
          scan.nextLine();
          break;
        case 3:
          System.out.println(label);
          for (int j = 0; j < dataKeretaApi[3].length; j++) {
            System.out.print(dataKeretaApi[3][j] + " ");
          }   System.out.println("");
          scan.nextLine();
          scan.nextLine();
          break;
        case 4:
          System.out.print("Pilih jenis kereta api: ");
          String jenis = scan.next();
          int harga = 0;
          switch (jenis) {
            case "Ekonomi":
              harga = 49000;
              break;
            case "Bisnis":
              harga = 95000;
              break;
            case "Eksekutif":
              harga = 186000;
              break;
            case "Pariwisata":
              harga = 270000;
              break;
            default:
              System.out.println("Jenis kereta tidak valid.");
              continue;
          }

          System.out.print("Lakukan pembayaran sebesar Rp " + harga + ": ");
          bayar = scan.nextInt();
          if (bayar < harga) {
            System.out.println("Nominal pembayaran anda kurang");
          } else {
            System.out.println("Total kembali: " + (bayar - harga));
            System.out.println("Pemesanan selesai, terima kasih.");

            pesananTiket[pesananCount] = jenis + " - Rp " + harga;
            pesananCount++;
          }
          scan.nextLine();
          scan.nextLine();
          break;
        case 5:
          System.out.println("Daftar Pesanan Tiket:");
          if (pesananCount == 0) {
            System.out.println("Belum ada tiket yang dipesan.");
          } else {
            for (int i = 0; i < pesananCount; i++) {
              System.out.println((i + 1) + ". " + pesananTiket[i]);
            }
          }
          scan.nextLine();
          scan.nextLine();
          break;
        default:
          b = false;
          System.out.println("Masukkan input yang valid!");
          break;
      }
    }

    scan.close();
  }
}
