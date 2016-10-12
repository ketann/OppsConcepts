package com.oppsconcepts.Polymorphism;

/**
 * Created by GURUKRUPA on 10/4/2016.
 */

//Method Overloading
public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, double b) {
        return a + (int) b;
    }
}
