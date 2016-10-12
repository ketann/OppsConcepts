package com.oppsconcepts.Encapsulation;

/**
 * Created by GURUKRUPA on 10/4/2016.
 */

public class FruitDetails {

    //Data members of class FruitDetails
    private String name;
    private String price;
    private String color;

    //declaration of constructor
    public FruitDetails(String name, String price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }


    //Declaring Setter for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
