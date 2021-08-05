package com.duallab.lessons;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sum {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Sum/";

    public static void main(String[] args) throws IOException {
        String fileName = "INPUT.TXT";
        FileReader reader = new FileReader(filePath + fileName);
        Scanner scanner = new Scanner(reader);
        int firstLine = scanner.nextInt();
        int secondLine = scanner.nextInt();
        int sum = firstLine + secondLine;
        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.TXT");
        writer.print(sum);
        writer.close();
    }
}
