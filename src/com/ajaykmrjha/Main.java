package com.ajaykmrjha;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World" + "!!";
//      Some useful methods defined in String class
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("!!")); // returns the index of char and word in the given string or return -1 in case not found
        System.out.println(message.indexOf("lo W"));  // searches for word in the given string
    }
}
