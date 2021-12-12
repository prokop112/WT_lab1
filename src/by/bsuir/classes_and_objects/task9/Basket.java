package by.bsuir.classes_and_objects.task9;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public ArrayList<Ball> getBallsList() {
        return balls;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }
}
