package by.bsuir.java_fundamentals.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the lower value of range: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Enter the highest value of range: ");
        double b = in.nextDouble();
        System.out.println("Enter the step: ");
        double h = in.nextDouble();
        tgWithOutput(a, b, h);
    }

    private static void tgWithOutput(double a, double b, double h) {
        double x = a;
        while (x <= b) {
            double f = Math.tan(x);
            System.out.printf("x: %f, f: %f \n", x, f);
            x += h;
        }
    }
}
