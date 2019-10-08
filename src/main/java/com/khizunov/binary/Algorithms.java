package com.khizunov.binary;


import java.util.List;

public class Algorithms {

    public static int binarySearch(Integer key, List<Integer> sorted) {
        return search(key, sorted, 0, sorted.size());
    }

    private static int search(Integer key, List<Integer> sorted, int begin, int end) {
        if (end < begin) {
            return -1;
        }

        int middle = (begin + end)/2;

        Integer current = sorted.get(middle);

        if (current == key) {
            return middle;
        }

        if (key > current) {
            return search(key, sorted, middle + 1, end);
        }

        return search(key, sorted, begin, middle - 1);
    }
}
