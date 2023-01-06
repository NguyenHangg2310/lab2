

import java.util.Scanner;

public class PrintArrayInStars {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int NUM_ITEMS;
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");
        int[] items = inputArray(NUM_ITEMS);
        printArray(items);
        sc.close();
    }

    public static int[] inputArray(int NUM_ITEMS) {
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i < items.length; i++) {
            items[i] = sc.nextInt();
        }
        return items;
    }

    public static void printArray(int[] items) {
        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            for (int starNo = 1; starNo <= items[idx]; starNo++) {
                System.out.print("*");
            }
            System.out.print("(" + items[idx] + ")");
            System.out.println();
        }
    }
}
