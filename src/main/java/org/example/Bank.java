package org.example;

abstract public class Bank {
    abstract int getInterestRate();
    String name = "Central";
    Bank() {
        System.out.println("hi");
    }
    public static void main(String[] args) {
        Bank b;
        b = new RBC();
        System.out.println(b.getInterestRate());


    }
}

class RBC extends Bank {
    @Override
    int getInterestRate() {
        return 7;
    }
    RBC() {

    }
}

class TD extends Bank {
    @Override
    int getInterestRate() {
        return 6;
    }
}

