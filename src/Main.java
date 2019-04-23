import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So luong SNT can in ra la: ");
        int n = scanner.nextInt();
        showSNT(n);
    }

    static void showSNT(int n) {
        int count = 0;
        int i = 2;
        while (count < n) {
            if (checkSNT(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }


    static boolean checkSNT(int number) {
        if (number < 2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
        }
        return true;
    }
}
