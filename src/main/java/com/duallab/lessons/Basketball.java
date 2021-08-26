package com.duallab.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Basketball {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Basketball/";

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);

        int team1 = 0;
        int team2 = 0;

        while (scanner.hasNextLine() && scanner.hasNextInt()) {
            team1 += scanner.nextInt();
            team2 += scanner.nextInt();
        }

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");
        if (team1 > team2) {
            writer.println(1);
        } else if (team1 < team2) {
            writer.println(2);
        } else {
            writer.println("DRAW");
        }
        writer.close();
    }
}
