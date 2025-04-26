package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    private static void promptUserForStory(){

        System.out.println("Enter the name of a story: ");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("goldilocks.txt");

            Scanner scanner = new Scanner(fis);

            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                System.out.println(input);

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}