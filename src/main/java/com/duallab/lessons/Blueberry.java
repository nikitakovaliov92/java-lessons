package com.duallab.lessons;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Blueberry {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Blueberry/";

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        int numberOfBushes = scanner.nextInt();
        int[] blueberries = new int[numberOfBushes + 2];
        int max = 0;
        int leftMax = 0;
        int rightMax = 0;
        int result;

        for (int i = 0; i < blueberries.length; i++) {
            blueberries[i] = scanner.nextInt();
            if (blueberries[i] + blueberries[i+1] + blueberries[i+2] > max) {
                max = blueberries[i];
            }
        }

        System.out.println(max);

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");
        //writer.print();
        writer.close();
    }
}
