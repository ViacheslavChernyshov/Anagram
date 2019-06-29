package com.olpi.anagram;

public class Reverse {

	public String reverseText(String initialText) throws NullPointerException {
		if (initialText == null) {
			throw new NullPointerException("String is null");
		}
		String reverseText = reverseOnlyLetters(initialText);
		return reverseText;
	}

	private String reverseOnlyLetters(String initialText) {
		StringBuilder finalText = new StringBuilder(initialText);

		int firstIndex = 0;
		int secondIndex = initialText.length() - 1;

		while (secondIndex >= 0 && firstIndex <= initialText.length() - 1) {

			while (!Character.isLetter(initialText.charAt(firstIndex))) {
				firstIndex++;
			}
			while (!Character.isLetter(finalText.charAt(secondIndex))) {
				secondIndex--;
			}
			finalText.setCharAt(secondIndex, initialText.charAt(firstIndex));
			firstIndex++;
			secondIndex--;
		}
		return finalText.toString();
	}
}
