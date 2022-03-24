package com.einarr.maximus.helloworld;

import static java.lang.System.out;

public class HelloWorldApplication {

    public static void main(String[] args) {
        out.println("Hello, " + System.getProperty("user.name") + "!");
    }
}
