package com.shenjies88.jdkfeature.jdk9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shenjies88
 * @since 2020/10/16/14:13
 */
public class ProcessExample {
    public static void main(String[] args) {
        processFun();
    }

    static void processFun() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        // 在Windows上运行这个命令，cmd， /c 参数是在运行后终止
        processBuilder.command("cmd.exe", "/c", "ping -n 3 baidu.com");
        // 在Linux上运行
        //processBuilder.command("bash", "-c", "ping  baidu.com");
        try {
            Process process = processBuilder.start();
            // blocked :(
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.err.println(line);
            }
            int exitCode = process.waitFor();
            System.err.println("\nExited with error code : " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
