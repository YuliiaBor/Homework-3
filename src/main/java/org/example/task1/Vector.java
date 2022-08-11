package org.example.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static List<Vector> randomVectorList(int numberOfVectors){
        Random rand = new Random();
        List<Vector> vectorList = new ArrayList<>();

        for(int i = 0; i < numberOfVectors; i++){
         int x = rand.nextInt(50);
         int y = rand.nextInt(100);
         int z = rand.nextInt(200);
         Vector v = new Vector(x, y, z);
         vectorList.add(v);
        }

        return vectorList;
    }

    public double length(){
        return Math.sqrt(multipleX2(x) + multipleX2(y) + multipleX2(z));
    }



    public int scalarMultiple(Vector vector){
        return this.x * vector.getX() + this.y * vector.getY() + this.z * vector.getZ();
    }

    public int scalarMultiple(Vector v1, Vector v2){
        return v2.x * v1.getX() + v2.y * v1.getY() + v2.z * v1.getZ();
    }

    private double multipleX2(int a){
        return Math.pow(a, 2);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
