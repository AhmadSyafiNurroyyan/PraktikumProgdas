import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a, b, r;

    System.out.println("Menu:");
    System.out.println("1. menghitung luas dan keliling persegi panjang");
    System.out.println("2. menghitung luas dan keliling lingkaran");
    System.out.println("3. menghitung luas dan keliling segitiga\n");

    System.out.print("Pilihan anda: ");
    int pilihanUser = scan.nextInt();

    switch (pilihanUser) {
      case 1:
        System.out.print("Masukkan a: ");
        a = scan.nextInt();
        System.out.print("Masukkan b: ");
        b = scan.nextInt();
        int keliling1 = 2 * (a + b);
        int luas1 = a * b;
        System.out.println("\nKeliling persegi panjang: " + keliling1 + " cm");
        System.out.println("Luas persegi panjang: " + luas1 + " cm2");
        break;
      case 2:
        System.out.print("Masukkan r: ");
        r = scan.nextInt();
        double keliling2 = 2 * r * Math.PI;
        double luas2 = Math.PI * (r * r);
        System.out.printf("\nKeliling lingkaran: %.2f%s" , keliling2 , " cm");
        System.out.printf("Luas lingkaran: %.2f%s" , luas2 , " cm2");
        break;
      case 3:
        System.out.print("Masukkan a: ");
        a = scan.nextInt();
        System.out.print("Masukkan b: ");
        b = scan.nextInt();
        System.out.print("Masukkan r: ");
        r = scan.nextInt();
        int keliling3 = a + b + r;
        int luas3 = (a * b) / 2;
        System.out.println("\nKeliling segitiga: " + keliling3 + " cm");
        System.out.println("Luas segitiga    : " + luas3 + " cm2");
        break;
      default:
        System.out.println("Data tak ditemukan, program dihentikan ...");
        break;
    }
    scan.close();

  }
}