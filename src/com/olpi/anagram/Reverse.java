package com.olpi.anagram;

public class Reverse {

    public String reverseText(String text) throws NullPointerException {
        if (text == null) {
            throw new NullPointerException("String is null");
        }
        return splitSentenceIntoWordsAndReverseIt(text);
    }

    private String splitSentenceIntoWordsAndReverseIt(String text) {

        StringBuilder word = new StringBuilder();
        StringBuilder finalText = new StringBuilder();

        for (int indexText = 0; indexText < text.length(); indexText++) {
            word.append(text.charAt(indexText));
            if (text.charAt(indexText) == ' ' || indexText == text.length() - 1) {
                finalText.append(reverseOnlyLetters(word.toString()));
                word.setLength(0);
            }
        }
        return finalText.toString();
    }

    private String reverseOnlyLetters(String text) {
        StringBuilder finalText = new StringBuilder(text);

        for (int firstIndex = 0, secondIndex = text.length() - 1; firstIndex <= text.length() - 1
                && secondIndex >= 0; firstIndex++, secondIndex--) {

            for (; !Character.isLetter(text.charAt(firstIndex)) && firstIndex < text.length() - 1; firstIndex++) {
            }

            for (; !Character.isLetter(finalText.charAt(secondIndex)) && secondIndex > 0; secondIndex--) {
            }

            if (Character.isLetter(text.charAt(firstIndex)) && Character.isLetter(finalText.charAt(secondIndex))) {
                finalText.setCharAt(secondIndex, text.charAt(firstIndex));
            }
        }
        return finalText.toString();
    }
    
}
