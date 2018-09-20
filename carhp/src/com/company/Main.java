package com.company;

public class Main{

    public static void main(String[] args){
	Car m = new Car("Mercedes-Benz C43 AMG", "Black", 302, false);
    System.out.println("................Car..................");
    m.showAttr();
    System.out.println("\n" + "::::::::::::::::::" + m.brandName() +":::::::::::::::::::");
    m.startEngine();

    }
}
