import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics2 {
    static Scanner sc = new Scanner(System.in);
    public static int[] grades;
    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println();
        System.out.printf("The grades is: %.2f%n ",average(grades));
        System.out.printf("The median is: %.2f%n",median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f ",stdDev(grades));
    }

    public static void readGrades() {
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        grades = new int[num];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade for student " + (i+1) +": ");
            grades[i] = sc.nextInt();
        }
    }

    public static void print(int[] array) {
        System.out.print(Arrays.toString(array));
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = (double) sum / array.length;
        return avg;
    }

    public static double median(int[] array) {
        int count = 0;
        double median = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            count ++;
        }
        if (count % 2 == 0) {
           median = (double) (array[array.length /2] + array[array.length/2 - 1]) / 2;
        } else {
            median = array[array.length / 2];
        }
        return median;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double sum = 0;
        double squareAvg = average(array) * average(array);
        for (int i = 0; i < array.length ; i++) {
            sum = sum + ((array[i]*array[i]) - (average(array)*average(array)));
        }
        double stdDev = Math.pow(sum * (double) 1/array.length, 0.5);
        return stdDev;
    }
}
