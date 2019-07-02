package com.olpi.anagram;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter \"exit\" to close the program. \nWrite a text:");

        while (scan.hasNext()) {
            String initialText = scan.nextLine();
            if (initialText.equalsIgnoreCase("exit")) {
                break;
            }
            Reverse reverse = new Reverse();
            String finishText = reverse.reverseText(initialText);
            System.out.println(finishText);
        }
        scan.close();
    }
}
