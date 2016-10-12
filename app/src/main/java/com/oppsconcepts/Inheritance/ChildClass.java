package com.oppsconcepts.Inheritance;

/**
 * Created by GURUKRUPA on 10/7/2016.
 */

public class ChildClass extends BaseClass {

    int z;

    public void substract() {
        z = addition() - x;
        System.out.println(z);
    }

}
