package com.einarr.maximus.helloworld.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SystemMessageUtil {
    /**
     * Получить имя операционной системы:
     *
     * @return The name of the operating system, where application is running
     */
    private static String getOSName() {
        return System.getProperty("os.name").toLowerCase();
    }

    /**
     * Получить локальный IP-адрес;
     *
     * @return The local IP Address of the hardware, where application in running
     */
    private String getLocalIpAddress() {
        String ipAddress = null;
        try {
            ipAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ipAddress;
    }

    /**
     * Получить MAC-адрес этой машины;
     *
     * @return The MAC address
     */
    public static String getLocalWindosMacAddress() {
        String mac = null;
        BufferedReader bufferReader = null;
        Process process = null;
        try {
            // Отображение информации об адресе сетевой карты Mac под windows;
            process = Runtime.getRuntime().exec("ipconfig /all");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        bufferReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line = null;
        int index = -1;
        try {
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
                index = line.indexOf("Physical Address");

                if (index >= 0) {
                    index = line.indexOf(":");
                    if (index >= 0) {
                        mac = line.substring(index + 1).trim();
                    }
                }
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (bufferReader != null) {
                    bufferReader.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return mac;
    }

    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        SystemMessageUtil messageUtil = new SystemMessageUtil();
        System.out.println(messageUtil.getLocalIpAddress());

    }
}
