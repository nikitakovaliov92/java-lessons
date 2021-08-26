package com.duallab.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Watermelon {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Watermelon/";

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        int countWatermelon = scanner.nextInt();
        int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;
        for (int i = 0; i < countWatermelon; i++) {
            int weight = scanner.nextInt();
            if (weight < min) {
                min = weight;
            }
            if (weight > max) {
                max = weight;
            }
        }
        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");
        writer.println(min + " " + max);
        writer.close();
    }
}
