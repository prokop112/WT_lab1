package by.bsuir.java_fundamentals.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the quantity of numbers: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the array: ");
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextDouble();
        }

        shellSort(arr);

        System.out.println("The sorted array: ");
        for (int ind = 0; ind < arr.length; ind++) {
            System.out.printf("%f ", arr[ind]);
        }
    }

    private static void shellSort(double[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] <= arr[i + 1]) {
                i++;
            } else {
                double tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                if (i > 0) {
                    i--;
                }
            }
        }
    }
}
