package com.duallab.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Reversal {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Reversal/";

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        short length = scanner.nextShort();
        short[] numbers = new short[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextShort();
        }

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");

        for (int i = length - 1; i >= 0; i--) {
            writer.print(numbers[i] + " ");
        }
        writer.close();
    }
}
