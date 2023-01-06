import java.util.Scanner;

public class Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of items: ");
        int numItems = sc.nextInt();
        int[] array = inputArray(numItems);
        print(array);
    }

    public static int[] inputArray(int numItems) {
        int[] array = new int[numItems];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length == 0) {
                System.out.print("Null");
            } else if (array.length == 1) {
                System.out.print("[" + array[i] + "]");
            } else {
                if (i == 0) {
                    System.out.print("[" + array[i] + ", ");
                } else if (i == array.length - 1) {
                    System.out.print(array[i] + "]");
                } else {
                    System.out.print(array[i] + ", ");
                }
            }
        }
    }
}
