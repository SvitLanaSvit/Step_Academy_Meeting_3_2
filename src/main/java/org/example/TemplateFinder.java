package org.example;

import java.util.Arrays;

public class TemplateFinder {
    public static <T extends Comparable<T>> T findMax(T param1, T param2, T param3) {
        T max = param1;

        if (param2.compareTo(max) > 0) {
            max = param2;
        }

        if (param3.compareTo(max) > 0) {
            max = param3;
        }

        return max;
    }

    public static <T extends Comparable<T>> T findMin(T param1, T param2, T param3, T param4, T param5) {
        T min = param1;

        if (param2.compareTo(min) < 0) {
            min = param2;
        }

        if (param3.compareTo(min) < 0) {
            min = param3;
        }

        if (param4.compareTo(min) < 0) {
            min = param4;
        }

        if (param5.compareTo(min) < 0) {
            min = param5;
        }

        return min;
    }

    public static <T extends Number> double calculateArithmeticMean(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }
        double sum = 0.0;
        for (T num : array) {
            sum += num.doubleValue();
        }
        return sum / array.length;
    }

    public static <T extends Comparable<T>> T findMaxInArray(T[] array) {
        T max = array[0];
        for (T num : array) {
            if (num.compareTo(max) > 0) {
                max = num;
            }
        }

        return max;
    }

    public static <T extends Comparable<T>> T findMinInArray(T[] array) {
        T min = array[0];
        for (T num : array) {
            if (num.compareTo(min) < 0) {
                min = num;
            }
        }

        return min;
    }

    public static <T extends Comparable<T>> void sortArray(T[] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }

        performSort(array);
    }

    private static <T extends Comparable<T>> void performSort(T[] array){
        Arrays.sort(array);
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array is empty or null.");
        }

        return performBinarySearch(array, key, 0, array.length - 1);
    }

    private static <T extends  Comparable<T>> int performBinarySearch(T[] array, T key, int left, int right) {
        // Subclasses should implement their specific binary search algorithm here
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparison = key.compareTo(array[mid]);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
