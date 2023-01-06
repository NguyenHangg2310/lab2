

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS;
        int[] items;
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];
        if (items.length > 0) {
            System.out.print("Enter te value of all items (separated by space) : ");
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }
        sc.close();
        System.out.print("The value are: ");
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print("[" + items[i] + ", ");
            } else if (i == items.length - 1) {
                System.out.print(items[i] + "]");
            } else {
                System.out.print(items[i] + ", ");
            }
        }
    }
}
