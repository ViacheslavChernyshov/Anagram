package com.olpi.anagram;

import java.util.Scanner;

public class AnagramApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter \"exit\" to close the program. \nWrite a text:");
        Anagram reverse = new Anagram();

        while (scan.hasNext()) {
            String initialText = scan.nextLine();
            if (initialText.equalsIgnoreCase("exit")) {
                break;
            }
            String finishText = reverse.process(initialText);
            System.out.println(finishText);
        }
        scan.close();
    }
}
