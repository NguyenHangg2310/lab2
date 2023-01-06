import java.util.Arrays;
import java.util.Scanner;

public class InteractiveWithArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numItems = sc.nextInt();
        int numItems1 = sc.nextInt();
        int numItems2 = sc.nextInt();
        int[] array = inputArray(numItems);
        System.out.println(arrayToString(array));
        System.out.println(contains(array, 4));
        System.out.println(search(array, 1));
        int[] array1 = inputArray(numItems1);
        int[] array2 = inputArray(numItems2);
        System.out.print(equals(array1,array2));
        System.out.println(arrayToString(copyOf(array)));
        System.out.println(arrayToString(copyOf(copyOf(array,7))));
        swap(array1,array2);
        reserve(array1);
    }

    public static int[] inputArray(int numItems) {
        int[] array = new int[numItems];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static String arrayToString(int[] array) {
        return Arrays.toString(array);
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copyArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            if (i < array.length) {
                copyArray[i] = array[i];
            } else {
                copyArray[i] = 0;
            }
        }
        return copyArray;
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                for (int j = array2.length - 1; j >= 0; j--) {
                    int temp = array1[i];
                    array1[i] = array2[j];
                    array2[j] = temp;
                }
            }
        }
        return true;
    }

    //2.10
    public static void reserve(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
        System.out.print(arrayToString(array));
    }
}
