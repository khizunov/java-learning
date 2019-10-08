package com.khizunov.binary;

import java.util.List;

public class Algorithms {

    public static int binarySearch(Integer key, List<Integer> sorted, boolean isRecursive) {
        if (isRecursive) {
            return recursiveBinarySearch(key, sorted, 0, sorted.size());
        }

        return search(key, sorted);
    }

    private static int recursiveBinarySearch(Integer key, List<Integer> sorted, int begin, int end) {
        if (end < begin) {
            return -1;
        }

        int middle = (begin + end)/2;
        Integer current = sorted.get(middle);

        if (current == key) {
            return middle;
        }

        if (key > current) {
            return recursiveBinarySearch(key, sorted, middle + 1, end);
        }

        return recursiveBinarySearch(key, sorted, begin, middle - 1);
    }

    private static int search(Integer key, List<Integer> sorted) {
        int begin = 0;
        int end = sorted.size();

        while (begin < end) {
            int middle = (begin + end)/2;
            Integer current = sorted.get(middle);

            if (current == key) {
                return middle;
            }

            if (key > current) {
                 begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}
