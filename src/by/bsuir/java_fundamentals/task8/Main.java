package by.bsuir.java_fundamentals.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the quantity of elements in the first sequence: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the first sequence a(n): ");
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextDouble();
        }

        System.out.println("Enter the quantity of elements in the second sequence: ");
        int m = in.nextInt();
        System.out.println("Enter the second sequence b(m): ");
        double[] b = new double[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextDouble();
        }

        findPlaceToInsert(n, a, m, b);
    }

    private static void findPlaceToInsert(int n, double[] a, int m, double[] b) {
        int i = 0;
        for (int j = 0; j < m; j++) {
            if ((i == 0) && (b[j] <= a[i])) {
                System.out.printf("Element b%d should be insert before a0 \n", j + 1);
            } else {
                while ((i + 1 < n) && !((a[i] <= b[j]) && (b[j] <= a[i + 1]))) {
                    i++;
                }
                System.out.printf("Element b%d should be insert after a%d \n", j + 1, i + 1);
            }
        }
    }
}