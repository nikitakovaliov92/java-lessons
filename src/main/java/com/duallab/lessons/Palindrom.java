package com.duallab.lessons;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Palindrom {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Palindrom/";

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        String data = scanner.nextLine();
        char[] digit = data.toCharArray();
        char a = digit[0];
        char b = digit[1];
        char c = digit[2];
        char d = digit[3];

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");

        if (a == d & b == c) {
            writer.print("YES");
        } else {
            writer.print("NO");
        }
        writer.close();
    }
}
