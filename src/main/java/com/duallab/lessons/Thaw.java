package com.duallab.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Thaw {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Thaw/";

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        int count = scanner.nextInt();
        int[] temperature = new int[count];
        int maxSequence = 0;
        int sequence = 0;

        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = scanner.nextInt();
            if (temperature[i] > 0) {
                sequence++;
            } else  {
                if (maxSequence < sequence) {
                    maxSequence = sequence;
                }
                sequence = 0;
            }
        }

        if (maxSequence < sequence) {
            maxSequence = sequence;
        }

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");
        writer.print(maxSequence);
        writer.close();
    }
}
