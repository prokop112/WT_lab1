package by.bsuir.java_fundamentals.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the quantity of elements in array: ");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        double[] a = new double[quantity];
        System.out.println("Enter element of array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextDouble();
        }

        double[][] matrix = generateMatrix(quantity, a);

        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < quantity; j++) {
                System.out.printf("%f ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    static double[][] generateMatrix(int quantity, double[] a) {
        double[][] matrix = new double[quantity][quantity];
        for (int i = 0; i < quantity; i++) {
            for (int j = 0; j < quantity; j++) {
                matrix[i][j] = a[(j + i) % quantity];
            }
        }
        return matrix;
    }
}
