import java.util.Scanner;

public class  menghitungDayaListrik {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Progam penghitung pemakaian listrik sederhana ");

    System.out.printf("Masukkan Nama %3s", ":");
    String nama = scan.nextLine();
    System.out.printf("Kelurahan %7s", ":");
    String kelurahan = scan.nextLine();
    System.out.printf("Masukkan posisi awal Kwh Meter %3s", ":");
    int awalKwhMeter = scan.nextInt();
    System.out.printf("Masukkan posisi akhir Khw Meter %2s", ":");
    int akhirKwhMeter = scan.nextInt();
    System.out.printf("Masukkan biaya beban saat ini %4s", ":");
    int biayaBeban = scan.nextInt();
    System.out.printf("Masukkan PPJ (dalam persen) %6s", ":");
    float ppj = scan.nextFloat();

    int hitungPemakaianListrik = akhirKwhMeter - awalKwhMeter;
    String hitungPemakaianListrik2 = hitungPemakaianListrik + " Kwh Meter";
    int tarifListrik = hitungPemakaianListrik * biayaBeban;
    String tarifListrik2 = "Rp " + tarifListrik + ",-";
    float hitungPPJ = tarifListrik * (ppj / 100);
    float totalBayar = tarifListrik + hitungPPJ;

    System.out.println("\n===================PLN " + kelurahan + "===================");
    System.out.printf("Nama %7s%s \n", ":", nama);
    System.out.printf("Kelurahan %2s%s \n", ":", kelurahan);
    System.out.printf("Pemakaian bulan ini \t %s%s \n", ":", hitungPemakaianListrik2);
    System.out.printf("Tarif Listrik %1s%s \n", ":", tarifListrik2);
    System.out.printf("PPJ %.0f%-8s%s%.0f%s \n", ppj, "%", ":Rp ", hitungPPJ, ",-");
    System.out.printf("Total Bayar %6s%.0f%s \n",  ":Rp ", totalBayar, ",-");
    System.out.println("==============================================");

    scan.close();
  }
}
