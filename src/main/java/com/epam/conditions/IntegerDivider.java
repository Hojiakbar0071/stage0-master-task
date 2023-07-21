package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {

        if (divider != 0) {
            int quotient = dividend / divider;
            int remainder = dividend % divider;

            if (remainder == 0) {
                System.out.println("can be divided completely");
            } else if (quotient != 0) {
                System.out.println("cannot be divided completely");
            }else {
                System.out.println("division by zero");
            }
        }
    }
}

