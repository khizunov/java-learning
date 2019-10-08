package com.khizunov;

import java.util.Arrays;
import java.util.List;

import com.khizunov.binary.Algorithms;

/**
 * Hello world!
 */
public class App {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 34, 54, 100);
        list.forEach(i -> System.out.println(i));
        int index = Algorithms.binarySearch(10, list);
        System.out.println("Found index: " + index);
    }
}
