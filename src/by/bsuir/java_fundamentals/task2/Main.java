package by.bsuir.java_fundamentals.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter x of your point: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println("Enter y of your point: ");;
        double y = in.nextDouble();
        boolean isBelongToArea = checkPoint(x, y);
        String result = isBelongToArea ? "Your point belong to the area" : "You point doesn't belong to the area";
        System.out.println(result);
    }

    static boolean checkPoint(double x, double y) {
        return ((x >= -4) && (x <= 4) && (y >= 0) && (y <= 5)) || ((x >= -6) && (x <= 6) && (y >= -3) && (y <= 0));
    }
}
