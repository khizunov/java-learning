package com.khizunov.binary;


import java.util.List;

public class Algorithms {

    public static int binarySearch(Integer valueToFind, List<Integer> sorted) {
        return search(valueToFind, sorted, 0, sorted.size());
    }

    private static int search(Integer valueToFind, List<Integer> sorted, int begin, int end) {
        int marker = end/2;

        Integer current = sorted.get(marker);

        if (current == valueToFind) {
            return marker;
        }

        if (current > valueToFind) {
            return search(valueToFind, sorted, marker + 1, end);
        } else {
            return search(valueToFind, sorted, begin, marker - 1);
        }
    }
}
