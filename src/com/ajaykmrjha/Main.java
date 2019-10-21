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
        System.out.println(message.replace("!", "*")); // replace strings and returns new string
        System.out.println(message.toLowerCase()); // make string to all lowercase and returns new string
        System.out.println(message.toUpperCase()); // make string to all uppercase and returns new string
        System.out.println(message.trim()); // remove white space from beginning and end  and returns new strings
        System.out.println(message);
    }
}
