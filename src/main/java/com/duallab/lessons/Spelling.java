package com.duallab.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Spelling {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Spelling/";

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        int extraLetterNumber = scanner.nextInt();
        String wordWithSpaces = scanner.nextLine();
        String wordWithoutSpaces = wordWithSpaces.replaceAll("\\s", "");
        StringBuilder sb = new StringBuilder(wordWithoutSpaces);
        sb.deleteCharAt(extraLetterNumber - 1);

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");
        writer.print(sb);
        writer.close();
    }
}
