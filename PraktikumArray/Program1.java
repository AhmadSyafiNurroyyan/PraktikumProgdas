import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int data = 0;
    boolean b = true;
    int input[] = null;
    int jumlah = 0;
    int nilaiMin = 0;
    int nilaiMax = 0;

    for (; b == true;) {
      System.out.println("1. Input Data");
      System.out.println("2. Lihat Data");
      System.out.println("3. Average");
      System.out.println("4. Sum");
      System.out.println("5. Max");
      System.out.println("6. Min");
      System.out.println("7. Keluar");

      System.out.print("Masukkan nilai: ");
      int nilai = scan.nextInt();

      switch (nilai) {
        case 1:
          System.out.print("Masukkan panjang data: ");
          data = scan.nextInt();
          input = new int[data];
          for (int y = 0; y < input.length; y++) {
            System.out.print("Masukkan data ke-" + (y + 1) + ": ");
            input[y] = scan.nextInt();
            jumlah += input[y];

            if (jumlah == input[0]) {
              nilaiMin = nilaiMax = jumlah;
            }
            if (input[y] < nilaiMin) {
              nilaiMin = input[y];
            } else if (input[y] > nilaiMax) {
              nilaiMax = input[y];
            }
          }
          break;
        case 2:
          if (input == null) {
            System.out.println("Lakukan input data terlebih dahulu");
            scan.nextLine();
            scan.nextLine();
          } else {
            for (int i : input) {
              System.out.println(i);
            }
            scan.nextLine();
            scan.nextLine();
          }
          break;
        case 3:
          if (input == null) {
            System.out.println("Lakukan input data terlebih dahulu");
            scan.nextLine();
            scan.nextLine();
          } else {
            System.out.println("Average = " + (jumlah / data));
            scan.nextLine();
            scan.nextLine();
          }
          break;
        case 4:
          if (input == null) {
            System.out.println("Lakukan input data terlebih dahulu");
            scan.nextLine();
            scan.nextLine();
          } else {
            System.out.println("Sum = " + jumlah);
            scan.nextLine();
            scan.nextLine();
          }
          break;
        case 5:
          if (input == null) {
            System.out.println("Lakukan input data terlebih dahulu");
            scan.nextLine();
            scan.nextLine();
          } else {
            System.out.println("Max = " + nilaiMax);
            scan.nextLine();
            scan.nextLine();
          }
          break;
        case 6:
          if (input == null) {
            System.out.println("Lakukan input data terlebih dahulu");
            scan.nextLine();
            scan.nextLine();
          } else {
            System.out.println("Min = " + nilaiMin);
            scan.nextLine();
            scan.nextLine();
          }
          break;
        case 7:
          b = false;
          System.out.println("Anda telah keluar dari program");
          break;
        default:
          System.out.println("Masukkan input yang valid!");
          scan.nextLine();
          scan.nextLine();
          break;
      }
    }

    scan.close();
  }
}