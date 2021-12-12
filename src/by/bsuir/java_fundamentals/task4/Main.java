package by.bsuir.java_fundamentals.task4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the quantity of numbers in array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
            System.out.printf("%d ", M[i]);
        }
        System.out.println("\nNumbers of prime numbers in array: ");
        boolean isPrimeNumbers = false;
        for (int i = 0; i < n; i++) {
            if (prime(M[i])) {
                System.out.printf("№%d ", i + 1);
                isPrimeNumbers = true;
            }
        }
        if (!isPrimeNumbers) {
            System.out.println("no prime numbers");
        }
    }

    static boolean prime(double element) {
        if (element <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(element); i++) {
            if (element % i == 0) {
                return false;
            }
        }
        return true;
    }
}
