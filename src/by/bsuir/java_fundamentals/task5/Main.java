package by.bsuir.java_fundamentals.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the quantity of numbers: ");
        Scanner in = new Scanner(System.in);
        int quantity = in.nextInt();
        int[] A = new int[quantity];
        System.out.println("Enter the sequence of numbers: ");
        for (int i = 0; i < quantity; i++) {
            A[i] = in.nextInt();
        }
        int K = getK(quantity, A);
        System.out.printf("The minimum of elements should be deleted: %d", K);
    }

    private static int getK(int quantity, int[] A) {
        int maxLength = 1;
        int currLength = 1;
        int prevEl = A[0];
        for (int i = 1; i < quantity; i++) {
            if (A[i] > prevEl) {
                currLength++;
            } else {
                if (currLength > maxLength) {
                    maxLength = currLength;
                }
                currLength = 1;
            }
            if (currLength > maxLength) {
                maxLength = currLength;
            }
            prevEl = A[i];
        }
        return A.length - maxLength;
    }
}
