package com.epam.conditions;

public class TriangleSidesValidator {

    public static  void validate(int firstSide, int secondSide, int thirdSide) {
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    public static void main(String[] args) {
       validate(1,4,4);
    }

}
