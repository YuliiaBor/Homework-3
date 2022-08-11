package org.example.task2;


/*
2.	You need to implement at least four basic shapes and calculate squares for each shape:
a.	In a separate package create an interface Shape, which should be implemented by two abstract classes – Round and Rectangular.
b.	Abstract classes should implement the method from the interface – getSquare().
c.	Each abstract class should have two child classes - Circle, Oval, Square, Rectangle.
d.	Override getSquare() method for some classes if needed.
e.	Create class instances and calculate their squares.

 */


public class Task2 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getSquare());

        Oval oval = new Oval();
        System.out.println(oval.getSquare());

        Square square = new Square(4);
        System.out.println(square.getSquare());

        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle.getSquare());
    }
}
