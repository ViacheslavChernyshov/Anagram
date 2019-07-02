package com.olpi.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class testReverse {
    private Reverse reverse = new Reverse();

    @Test(expected = NullPointerException.class)
    public final void ShouldThrowExceptionWhenTextNull() {
        String actual = null;
        String expected = "";
        assertEquals(expected, reverse.reverseText(actual));
    }

    @Test
    public final void ShouldReverseLeavingNonLettersInTheirPlaceWhenTextHasNonLetters() {
        String actual = "yhuj#2uf";
        String expected = "fuju#2hy";
        assertEquals(expected, reverse.reverseText(actual));
    }

    @Test
    public final void ShouldReverseWhenTextHasNotNonLetters() {
        String actual = "abcdef";
        String expected = "fedcba";
        assertEquals(expected, reverse.reverseText(actual));
    }

    @Test
    public final void ShouldEmptyWhenTextIsEmpty() {
        String actual = "";
        String expected = "";
        assertEquals(expected, reverse.reverseText(actual));
    }

    @Test
    public final void ShouldReverseTextLeavingNonLettersInTheirPlaceWhenTextHasNonLetters() {
        String actual = "abcdef yhuj#2uf";
        String expected = "fedcba fuju#2hy";
        assertEquals(expected, reverse.reverseText(actual));
    }

    @Test
    public final void ShouldReturnTextWhenTextHasOnlyNonLetters() {
        String actual = "12345";
        String expected = "12345";
        assertEquals(expected, reverse.reverseText(actual));
    }
}
