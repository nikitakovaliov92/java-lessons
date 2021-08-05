package com.duallab.lessons;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Salary {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Salary/";

    public static void main(String[] args) throws IOException {
        String fileName = "INPUT.txt";
        FileReader reader = new FileReader(filePath + fileName);
        Scanner scanner = new Scanner(reader);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int result = max - min;

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");
        writer.println(result);
        writer.close();
    }
}