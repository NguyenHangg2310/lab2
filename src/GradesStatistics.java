

import java.util.Scanner;

public class GradesStatistics {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] grades = inputArray(numStudents);
        computeArray(grades);
    }

    public static int[] inputArray(int numStudents) {
        int[] grades = new int[numStudents];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade for students  " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        return grades;
    }

    public static void computeArray(int[] grades) {
        int sum = 0;
        int min = grades[0];
        int max = grades[0];
        double avg;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
            if (min > grades[i]) {
                min = grades[i];
            } else if (max < grades[i]) {
                max = grades[i];
            }
        }
        avg = (double) sum / grades.length;
        System.out.printf("The average is: %.2f%n", avg);
        System.out.println("The minimum is: " + min);
        System.out.print("The maximum is: " + max);
    }
}

