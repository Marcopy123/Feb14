package org.example;

class Animal {
    String color = "white";

    Animal() {
        System.out.println("Animal object is instantiated");
    }

    void eat() {
        System.out.println("Animal is eating Meat");
    }
}

class Bat extends Animal {
    String color = "black";

    Bat() {
        super();
        System.out.println("Bat object is instantiated");
    }

    void eat() {
        System.out.println("Bat is eating Fruits");
        super.eat();
    }
    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class DemoSuper {

}
