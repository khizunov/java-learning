package com.khizunov;

import java.util.Arrays;
import java.util.List;

import com.khizunov.binary.Algorithms;


public class App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 34, 54, 100);
        list.forEach(i -> System.out.println(i));
        int index = Algorithms.binarySearch(100, list, false);
        System.out.println("Found index: " + index);
    }
}
