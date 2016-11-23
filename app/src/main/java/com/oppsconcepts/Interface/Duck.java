package com.oppsconcepts.Interface;

/**
 * Created by GURUKRUPA on 10/24/2016.
 */

public class Duck implements Fly {
    @Override
    public void goFroword() {
        System.out.println("Duck going forward ");
    }

    @Override
    public void goDown() {
        System.out.println("Duck going down ");
    }
}
