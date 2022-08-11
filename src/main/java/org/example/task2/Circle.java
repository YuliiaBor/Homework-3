package org.example.task2;

public class Circle extends Round{

    public static double PI = 3.14159;

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return PI * Math.pow(radius, 2);
    }
}
