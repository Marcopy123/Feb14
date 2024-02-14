package org.example;

public class Rectangle extends ShapeAbstract{
    @Override
    void draw() {
        System.out.println("Here I write my logic to print the rectangle area.");
    }

    public static void main(String[] args) {
        Rectangle rectagle1 = new Rectangle();
        rectagle1.draw();
    }
}
