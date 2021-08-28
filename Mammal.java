package com.company;

public class Mammal implements Animal {

    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }

    @Override
    public void travel() {
        System.out.println("Mammal travels");
    }
    public int numleg(){
        return 4;
    }
}
