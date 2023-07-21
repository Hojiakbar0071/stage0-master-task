package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
//    private String name;
//    private int age;

//    public Animal() {
//        super();
//        this.name="Resk";
//        this.age=6;
//    }


    // Constructor with full parameters
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    // Method to get the description of the animal
    public String getDescription() {
        String furDescription = hasFur ? "a" : "no";
        String pawDescription = (numberOfPaws == 1) ? "paw" : "paws";

        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawDescription + " and " + furDescription + " fur.";
    }
}
