package org.example;

public class Circle extends ShapeAbstract{

    @Override
    void draw () {
        System.out.println("Here I write my logic to print the circle perimeter");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
