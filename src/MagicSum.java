
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = sc.nextInt();
        int sum = 0;
        if (hasEight(number)) {
            sum += number;
        }
        while (number != SENTINEL) {
            System.out.print("Enter a postive integer (or -1 to end): ");
            number = sc.nextInt();
            if (hasEight(number)) {
                sum += number;
            }
        }
        System.out.print("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
