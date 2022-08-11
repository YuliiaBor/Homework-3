package org.example.task2;

public class Square extends Rectangular{

    private int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public double getSquare() {
        return Math.pow(x,2);
    }
}
