package com.epam.algorithms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {


    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public  String[] seasonsArray() {
        System.out.println("I think, you have mistake in order or name of season");
        return new String[]{"winter", "spring", "summer", "autumn"};

    }

    // Task 2: generateNumbers
    public  int[] generateNumbers(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        System.out.println("I think, something went wrong with number generation implementation");
        return result;
    }

    // Task 3: totalSum
    public  int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Task 4: findIndexOfNumber
    public  int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // Task 5: reverseArray
    public  String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }

    // Task 6: getOnlyPositiveNumbers
    public  int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    // [OPTIONAL] Task 7: sortRaggedArray
    public  int[][] sortRaggedArray(int[][] arr) {
        // Sorting one-dimensional arrays by length in ascending order
        Arrays.sort(arr, Comparator.comparingInt(a -> a.length));

        // Sorting numbers in each one-dimensional array in ascending order
        for (int[] subArray : arr) {
            Arrays.sort(subArray);
        }

        return arr;
    }

}
