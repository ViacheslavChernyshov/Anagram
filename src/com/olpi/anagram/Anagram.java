package com.olpi.anagram;

import java.util.StringJoiner;

public class Anagram {

    public String process(String text) {

        if (text == null) {
            throw new IllegalArgumentException("String is null");
        }
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : text.split(" ")) {
            joiner.add(reverse(word));
        }
        return joiner.toString();
    }

    private String reverse(String word) {

        char[] chars = word.toCharArray();
        
        for (int leftIndex = 0, rightIndex = chars.length - 1; leftIndex < rightIndex;) {
            if (Character.isLetter(chars[leftIndex]) && Character.isLetter(chars[rightIndex])) {
                char tempValue = chars[leftIndex];
                chars[leftIndex] = chars[rightIndex];
                chars[rightIndex] = tempValue;
                leftIndex++;
                rightIndex--;
            } else if (!Character.isLetter(chars[leftIndex])) {
                leftIndex++;
            } else if (!Character.isLetter(chars[rightIndex])) {
                rightIndex--;
            }
        }
        return new String(chars);
    }
}
