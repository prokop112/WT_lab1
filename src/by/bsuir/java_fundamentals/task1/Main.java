package by.bsuir.java_fundamentals.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter x: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println("Enter y: ");
        double y = in.nextDouble();
        double result = expression(x, y);
        System.out.println("The result of executing: ");
        System.out.println(result);
    }

    static double expression(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
        double expr = numerator / denominator + x;
        return expr;
    }
}
