package org.example.task1;

public class Task1 {
    public static void main(String[] args) {
        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(4,5,6);

        System.out.println(v1.length());
        int resultScalar = v1.scalarMultiple(v2);
        System.out.println(resultScalar);

        Vector.randomVectorList(4);
        System.out.println(Vector.randomVectorList(4));

    }
}
