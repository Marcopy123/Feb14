package org.example;

final public class FinalDemo1 { // this class can't be extended
    final int speedLimit = 100;
    final void run() { // cannot be overriden by another child class
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        FinalDemo1 f = new FinalDemo1();

        f.run();
    }
}
