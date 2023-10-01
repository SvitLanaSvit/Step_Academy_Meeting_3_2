package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        //Завдання 1:
//        //Напишіть шаблонний метод, що повертає максимум із трьох переданих параметрів
//        Integer int1 = 10;
//        Integer int2 = 5;
//        Integer int3 = 15;
//
//        Integer maxInt = TemplateFinder.findMax(int1, int2, int3);
//        System.out.println("Maximum Integer: " + maxInt);
//
//        Double double1 = 7.5;
//        Double double2 = 9.2;
//        Double double3 = 6.8;
//
//        Double maxDouble = TemplateFinder.findMax(double1, double2, double3);
//        System.out.println("Maximum Double: " + maxDouble);
//
//        //Завдання 2:
//        //Напишіть шаблонний метод, що повертає мінімум із п’яти переданих параметрів.
//        Integer int1_2 = 10;
//        Integer int2_2 = 5;
//        Integer int3_2 = 15;
//        Integer int4_2 = 2;
//        Integer int5_2 = 8;
//
//        Integer minInt = TemplateFinder.findMin(int1_2, int2_2, int3_2, int4_2, int5_2);
//        System.out.println("Minimum Integer: " + minInt);
//
//        Double double1_2 = 7.5;
//        Double double2_2 = 9.2;
//        Double double3_2 = 6.8;
//        Double double4_2 = 5.0;
//        Double double5_2 = 9.8;
//
//        Double minDouble = TemplateFinder.findMin(double1_2, double2_2, double3_2, double4_2, double5_2);
//        System.out.println("Minimum Double: " + minDouble);
//
//        //Завдання 3:
//        //Напишіть шаблонний метод для пошуку середньо арифметичного значення в масиві.
//        Integer[] intArray = { 10, 20, 30, 40, 50 };
//        double intMean = TemplateFinder.calculateArithmeticMean(intArray);
//        System.out.println("Arithmetic Mean of Integers: " + intMean);
//
//        Double[] doubleArray = { 2.5, 3.5, 4.5, 5.5 };
//        double doubleMean = TemplateFinder.calculateArithmeticMean(doubleArray);
//        System.out.println("Arithmetic Mean of Doubles: " + doubleMean);
//
//        //Завдання 4:
//        //Реалізуйте шаблонний метод для пошуку максимуму в масиві
//        Integer[] intArray = { 10, 20, 5, 30, 15 };
//        Integer maxInt = TemplateFinder.findMaxInArray(intArray);
//        System.out.println("Maximum Integer: " + maxInt);
//
//        Double[] doubleArray = { 3.5, 1.0, 2.8, 5.2, 4.6 };
//        Double maxDouble = TemplateFinder.findMaxInArray(doubleArray);
//        System.out.println("Maximum Double: " + maxDouble);
//
//        // Example usage with an array of strings
//        String[] stringArray = { "apple", "banana", "cherry", "date" };
//        String maxString = TemplateFinder.findMaxInArray(stringArray);
//        System.out.println("Maximum String: " + maxString);
//
//        //Завдання 5:
//        //Реалізуйте шаблонний метод для пошуку мінімуму в масиві
//        Integer[] intArray = { 10, 20, 5, 30, 15 };
//        Integer maxInt = TemplateFinder.findMinInArray(intArray);
//        System.out.println("Minimum Integer: " + maxInt);
//
//        Double[] doubleArray = { 3.5, 1.0, 2.8, 5.2, 4.6 };
//        Double maxDouble = TemplateFinder.findMinInArray(doubleArray);
//        System.out.println("Minimum Double: " + maxDouble);
//
//        // Example usage with an array of strings
//        String[] stringArray = { "apple", "banana", "cherry", "date" };
//        String maxString = TemplateFinder.findMinInArray(stringArray);
//        System.out.println("Minimum String: " + maxString);
//
//        //Завдання 6:
//        //Реалізуйте шаблонний метод для сортування масиву
//        Integer[] intArray = {10, 5, 30, 20, 15};
//        TemplateFinder.sortArray(intArray);
//        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));
//
//        String[] stringArray = {"apple", "cherry", "date", "banana"};
//        TemplateFinder.sortArray(stringArray);
//        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));

        //Завдання 7:
        //Реалізуйте шаблонний метод для двійкового пошуку в масиві
        Integer[] intArray = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        Integer searchKey = 30;
        int result = TemplateFinder.binarySearch(intArray, searchKey);
        if (result != -1) {
            System.out.println("Integer " + searchKey + " found at index " + result);
        } else {
            System.out.println("Integer " + searchKey + " not found in the array.");
        }
    }
}