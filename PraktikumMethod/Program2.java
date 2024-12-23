import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1-100: ");
        int bil = scan.nextInt();

        if (cekPrima(bil)) {
            System.out.println(bil + " adalah bilangan prima.");
        } else {
            System.out.println(bil + " bukan bilangan prima.");
        }
        System.out.println();
        System.out.println("Bilangan prima dari 1 sampai 100:");
        bilanganPrima();

        scan.close();
    }

    public static boolean cekPrima(int bil) {
        if (bil <= 1) return false;
        if (bil == 2 || bil == 3) return true;
        if (bil % 2 == 0 || bil % 3 == 0) return false;

        for (int i = 5; i * i <= bil; i += 6) {
            if (bil % i == 0 || bil % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void bilanganPrima() {
        for (int i = 2; i <= 100; i++) {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }
}