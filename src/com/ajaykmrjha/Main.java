package com.ajaykmrjha;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//    Multi-dimensional Array
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
//        Tip: To print multi-dimensional use deepToString
//        deepToString is another method in Array class
        System.out.println(Arrays.deepToString(numbers));
    }
}
