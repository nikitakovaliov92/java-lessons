package com.duallab.lessons;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Schedule {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Schedule/";

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        String firstLine = scanner.nextLine();
        String firstLineWithoutColon = firstLine.replaceAll(":\\s*", " ");
        String secondLine = scanner.nextLine();
        int minuteLimit = 60;
        int hourLimit = 24;
        int minute;
        int hour;
        System.out.println(firstLineWithoutColon);
        System.out.println(secondLine);

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");
        //writer.print();
        writer.close();
    }
}
