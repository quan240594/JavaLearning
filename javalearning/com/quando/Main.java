package com.quando;

public class Main {
    private void run() {
        Pet p = Pet.make("Jerry");
        Cat c = new Cat("Tom");
        p.feed("Cheese");
        c.feed();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}
