package com.einarr.maximus.helloworld.service;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Test {

    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ipconfig /all");
            InputStreamReader ir = new InputStreamReader(process.getInputStream());
            LineNumberReader input = new LineNumberReader(ir);
            String line;
            while ((line = input.readLine()) != null)
                if (line.indexOf("Physical Address") >= 0) {
                    String macAddr = line.substring(line.indexOf("-") - 2);
                    System.out.println("MAC address = [" + macAddr);
                }
        } catch (java.io.IOException e) {
            System.err.println("IOException " + e.getMessage());
        }
    }
}
