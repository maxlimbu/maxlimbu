package com.company;

import java.awt.event.KeyEvent;

public class Car {

    private String brand;
    private String color;
    private boolean engineState;
    private int horsepower;

    public Car(String brand, String color, int horsepower, boolean engineState) {
        this.brand = brand;
        this.color = color;
        this.horsepower = horsepower;
        this.engineState = engineState;
    }

    String brandName(){
        //System.out.println("\n" + "::::::::::::::::::" + brand +":::::::::::::::::::");
    return brand;
    }

    void startEngine(){
        if(engineState == true){
            System.out.println("\n" + "::::::::::::::::::" + "ALREADY ON!..." +":::::::::::::::::::");
        }
        else{
            engineState = true;
            System.out.println("\n" + "::::::::::::::::::" + "NOW ON!..." +":::::::::::::::::::::");
        }

    }


    void showAttr(){
        System.out.println("^^^^^^^^^^^^^^^^Car info^^^^^^^^^^^^^^^^^^");
        System.out.println(".....................................");
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Horsepower: " + horsepower);
        System.out.println(".....................................");
    }



}
