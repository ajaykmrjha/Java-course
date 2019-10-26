package com.ajaykmrjha;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
//        NumberFormat for percent

        String result = NumberFormat.getPercentInstance().format(0.1); // Method chaining
        System.out.println(result);
    }
}
