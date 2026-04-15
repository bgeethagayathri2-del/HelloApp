//HELLOAPP UC2
package com.example.helloapp;
import java.util.*;
public class App {
    public static void main(String[] args) {
        
        // Display Hello World to console
        System.out.println("Hello World");
        
        if (args.length > 0) {
            System.out.println("Helloo " + args[0]);
        } else {
            System.out.println("Helllooo User");
        }
    }
}