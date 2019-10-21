package com.ajaykmrjha;

public class Main {

    public static void main(String[] args) {
        String message = "Hello \"Ajay\""; // to escape double quotes
        System.out.println(message);
        String windowPath = "c:\\Windows\\..."; // to escape back slash
        System.out.println(windowPath);
        String windowPath1 = "c:\nWindows\\..."; // to add new line
        System.out.println(windowPath1);
        String windowPath2 = "c:\tWindows\\..."; // to add TAB space
        System.out.println(windowPath2);
    }
}
