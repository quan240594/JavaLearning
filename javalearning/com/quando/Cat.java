package com.quando;

public class Cat extends Pet implements Furry {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {

        System.out.println("The Cat " + getName() + " is demanding to be fed");
    }

    @Override
    public void groom() {
        System.out.println("The Cat " + getName() + " grooms");
    }
}
