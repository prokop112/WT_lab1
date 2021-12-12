package by.bsuir.classes_and_objects.task9;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(34, "Blue"));
        basket.addBall(new Ball(15, "Red"));
        basket.addBall(new Ball(10, "Blue"));
        basket.addBall(new Ball(53, "Yellow"));
        basket.addBall(new Ball(28, "Blue"));

        AtomicInteger summaryWeight = new AtomicInteger();
        AtomicInteger blueBallCount = new AtomicInteger();
        basket.getBallsList().forEach((Ball ball) -> {
            summaryWeight.addAndGet(ball.getWeight());
            if (Objects.equals(ball.getColor(), "Blue")) {
                blueBallCount.getAndIncrement();
            }
        });
        System.out.println("The summary weight of balls in the basket: " + summaryWeight);
        System.out.println("The quantity of blue balls in the basket: " + blueBallCount);
    }
}
