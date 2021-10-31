package com.duallab.lessons;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Coins {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Coins/";

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        int count = scanner.nextInt();
        int reshka = 0;
        int orel = 1;
        int countReshka = 0;
        int countOrel = 0;

        for (int i = 0; i < count; i++) {
            if (scanner.nextInt() == 0) {
                countReshka++;
            }
            else {
                countOrel++;
            }
        }

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");

        if (countReshka > countOrel) {
            writer.print(countOrel);
        } else {
            writer.print(countReshka);
        }

        writer.close();
    }
}
