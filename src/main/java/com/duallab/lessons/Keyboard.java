package com.duallab.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Keyboard {

    private static final String filePath = "./src/main/resources/com/duallab/lessons/Keyboard/";

    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader(filePath + "INPUT.txt");
        Scanner scanner = new Scanner(reader);
        char letter = scanner.nextLine().charAt(0);
        String keyboard = "qwertyuiopasdfghjklzxcvbnmq";
        char[] keyboardToChar = keyboard.toCharArray();

        PrintWriter writer = new PrintWriter(filePath + "OUTPUT.txt");

        for (int i = 0; i < keyboardToChar.length - 1; i++) {
            if (letter == keyboardToChar[i]) {
                writer.print(keyboardToChar[i + 1]);
            }
        }
        writer.close();
    }
}
