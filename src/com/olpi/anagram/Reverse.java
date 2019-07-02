package com.olpi.anagram;

public class Reverse {

    public String reverseText(String initialText) throws NullPointerException {
        if (initialText == null) {
            throw new NullPointerException("String is null");
        }
        return reverseOnlyLetters(initialText);
    }

    private String reverseOnlyLetters(String text) {

        StringBuilder finalText = new StringBuilder();
        StringBuilder endText = new StringBuilder();

        for (int x = 0; x < text.length(); x++) {
            finalText.append(text.charAt(x));

            if (text.charAt(x) == ' ' || x == text.length() - 1) {
                String initialText = finalText.toString();

                for (int firstIndex = 0, secondIndex = initialText.length() - 1; firstIndex <= initialText.length() - 1
                        && secondIndex >= 0; firstIndex++, secondIndex--) {

                    for (; !Character.isLetter(initialText.charAt(firstIndex))
                            && firstIndex < initialText.length() - 1; firstIndex++) {
                    }

                    for (; !Character.isLetter(finalText.charAt(secondIndex)) && secondIndex > 0; secondIndex--) {
                    }

                    if (Character.isLetter(initialText.charAt(firstIndex))
                            && Character.isLetter(finalText.charAt(secondIndex))) {
                        finalText.setCharAt(secondIndex, initialText.charAt(firstIndex));
                    }
                }
                endText.append(finalText.toString());
                finalText.setLength(0);
            }
        }
        return endText.toString();
    }

}
