package com.epam.conditions;

public class BitwiseValuesSwap {

    public static void swap(int first, int second) {

        if (true) {
            first = first ^ second;
            second = first ^ second;
            first = first ^ second;

            System.out.println(first + " ");
            System.out.println(second);

        }
    }
}
