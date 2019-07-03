package com.olpi.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {
    private Anagram reverse = new Anagram();

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenTextNull() {
        String text = null;
        reverse.process(text);
    }

    @Test
    public void shouldReturnStringWhenTextHasOnlySpaces() {
        String actual = reverse.process("     ");
        String expected = "     ";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnStringWhenTextHasOneSpaces() {
        String actual = reverse.process(" ");
        String expected = " ";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseLeavingNonLettersInTheirPlaceWhenTextHasNonLetters() {
        String actual = reverse.process("yhuj#2uf");
        String expected = "fuju#2hy";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseWhenTextHasNotNonLetters() {
        String actual = reverse.process("abcdef");
        String expected = "fedcba";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEmptyWhenTextIsEmpty() {
        String actual = reverse.process("");
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseTextLeavingNonLettersInTheirPlaceWhenTextHasNonLetters() {
        String actual = reverse.process("abcdef yhuj#2uf");
        String expected = "fedcba fuju#2hy";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTextWhenTextHasOnlyNonLetters() {
        String actual = reverse.process("12345");
        String expected = "12345";
        assertEquals(expected, actual);
    }
}
