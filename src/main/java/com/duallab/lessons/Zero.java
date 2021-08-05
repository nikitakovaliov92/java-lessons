package com.duallab.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zero {
    private static final String filePath = "./src/main/resources/com/duallab/lessons/Zero/";

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "INPUT.txt";
        FileReader reader = new FileReader(filePath + fileName);
        Scanner scanner = new Scanner(reader);
        String string = scanner.nextLine();
        System.out.println(string);
        char[] myArray1 = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            myArray1[i] = string.charAt(i);
        }
        int sequenceOfZero = 0;
        int count = 0;
        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] == '0') {
                sequenceOfZero++;
                if (sequenceOfZero > count) {
                    count = sequenceOfZero;
                }
            }
            if (myArray1[i] == '1') {
                sequenceOfZero = 0;
            }
        }
        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");
        writer.println(count);
        writer.close();
    }
}
