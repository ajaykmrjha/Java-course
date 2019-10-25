package com.ajaykmrjha;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Array example
//        Tip: In Java Array is of fix size
        int[] numbers = { 1, 4,2,6,7};
//        methods in array class
        Arrays.sort(numbers);

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}
