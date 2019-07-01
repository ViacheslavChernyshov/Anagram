package com.olpi.anagram;

public class Reverse {

	public String reverseText(String initialText) throws NullPointerException {
		if (initialText == null) {
			throw new NullPointerException("String is null");
		}
		return reverseOnlyLetters(initialText);
	}

	private String reverseOnlyLetters(String initialText) {
		StringBuilder finalText = new StringBuilder(initialText);

		int firstIndex = 0;
		int secondIndex = initialText.length() - 1;

		while (secondIndex >= 0 && firstIndex <= initialText.length() - 1) {

			while (!Character.isLetter(initialText.charAt(firstIndex)) && firstIndex < initialText.length() - 1) {
				firstIndex++;
			}
			while (!Character.isLetter(finalText.charAt(secondIndex)) && secondIndex > 0) {
				secondIndex--;
			}
			if (Character.isLetter(finalText.charAt(secondIndex))
					&& Character.isLetter(initialText.charAt(firstIndex))) {
				finalText.setCharAt(secondIndex, initialText.charAt(firstIndex));
			}
			firstIndex++;
			secondIndex--;

		}
		return finalText.toString();
	}
}
