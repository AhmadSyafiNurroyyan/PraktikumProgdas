public class Program2 {
    public static void main(String[] args) {
        int x = 5;
        int j, i;

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                if (i == 1 || i == 3 || j == 1 || (i == 2 && j == x) || (i == 4 && j == 4) || (i == 5 && j == x)) {
                    System.out.print("R");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                if ((i <= 3 && (j == i || j == x - i + 1)) || (i > 3 && j == x / 2 + 1)) {
                    System.out.print("Y");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                if ((i == 1 && j == 3) || (i == 2 && j == 2) || (i == 2 && j == 4) || (i == 3 && j == 1)
                        || (i == 3 && j == 5) || i == 4 || (i == 5 && j == 1) || (i == 5 && j == 5)) {
                    if ((i == 1 && j == 1) || (i == 1 && j == 5)) {
                        continue;
                    }
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (i = 1; i <= x; i++) {
            for (j = 1; j <= x; j++) {
                if (j == 1 || j == x || j == i) {
                    System.out.print("N");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
