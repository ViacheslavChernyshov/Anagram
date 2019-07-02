package com.olpi.anagram;

public class Reverse {

    public String reverseText(String text) throws NullPointerException {
        if (text == null) {
            throw new NullPointerException("String is null");
        }
        return reverseWord(text);
    }

    private String reverseWord(String text) {

        StringBuilder word = new StringBuilder();
        StringBuilder finalText = new StringBuilder();

        for (int indexText = 0; indexText < text.length(); indexText++) {
            word.append(text.charAt(indexText));
            if (text.charAt(indexText) == ' ' || indexText == text.length() - 1) {
                finalText.append(reverseLetters(word));
                word.setLength(0);
            }
        }
        return finalText.toString();
    }

    private String reverseLetters(StringBuilder text) {
        for (int leftIndex = 0, rightIndex = text.length() - 1; leftIndex < rightIndex;) {
            if (Character.isLetter(text.charAt(leftIndex)) && Character.isLetter(text.charAt(rightIndex))) {
                char tempValue = text.charAt(leftIndex);
                text.setCharAt(leftIndex, text.charAt(rightIndex));
                text.setCharAt(rightIndex, tempValue);
                leftIndex++;
                rightIndex--;
            } else if (!Character.isLetter(text.charAt(leftIndex))) {
                leftIndex++;
            } else if (!Character.isLetter(text.charAt(rightIndex))) {
                rightIndex--;
            }
        }
        return text.toString();
    }
}
