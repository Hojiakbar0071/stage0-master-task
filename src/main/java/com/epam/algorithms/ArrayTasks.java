package com.epam.algorithms;

import java.util.Arrays;

public class ArrayTasks {

    // Task: seasonsArray
    public static String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    // Task: generateNumbers
    public static int[] generateNumbers(int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    // Task: totalSum
    public static int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Task: findIndexOfNumber
    public static int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // Task: reverseArray
    public static String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - i - 1] = arr[i];
        }
        return reversed;
    }

    // Task: getOnlyPositiveNumbers
    public static int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        int[] positiveNumbers = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers[index++] = num;
            }
        }
        return positiveNumbers;
    }

    // Optional Task: sortRaggedArray
    public static int[][] sortRaggedArray(int[][] arr) {
        // Sort the one-dimensional arrays based on their length
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length > arr[j].length) {
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Sort the numbers in each one-dimensional array
        for (int[] innerArray : arr) {
            Arrays.sort(innerArray);
        }
        return arr;
    }

    // Example usage
    public static void main(String[] args) {
        // Testing the tasks
        String[] seasons = seasonsArray();
        System.out.println("Seasons: " + Arrays.toString(seasons));

        int[] generatedNumbers = generateNumbers(5);
        System.out.println("Generated numbers: " + Arrays.toString(generatedNumbers));

        int[] numbers = {1, 3, 5};
        int sum = totalSum(numbers);
        System.out.println("Sum of numbers: " + sum);

        int[] numbersToSearch = {99, -7, 102};
        int index = findIndexOfNumber(numbersToSearch, -7);
        System.out.println("Index of -7: " + index);

        String[] words = {"Bob", "Nick"};
        String[] reversedWords = reverseArray(words);
        System.out.println("Reversed words: " + Arrays.toString(reversedWords));

        int[] mixedNumbers = {1, -2, 3};
        int[] positiveNumbers = getOnlyPositiveNumbers(mixedNumbers);
        System.out.println("Positive numbers: " + Arrays.toString(positiveNumbers));

        // Optional Task: sortRaggedArray
        int[][] raggedArray = {{3, 1, 2}, {3, 2}};
        int[][] sortedRaggedArray = sortRaggedArray(raggedArray);
        System.out.println("Sorted ragged array: " + Arrays.deepToString(sortedRaggedArray));
    }
}
