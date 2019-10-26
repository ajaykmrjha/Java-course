package com.ajaykmrjha;

public class Main {

    public static void main(String[] args) {
//        Math.round
        int result = Math.round(1.1F);
        int result1 = (int) Math.ceil(1.1F);
        int result2 = (int)Math.floor(1.1F);
        int maxValue = Math.max(1, 2);
        int minValue = Math.min(1, 2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}
