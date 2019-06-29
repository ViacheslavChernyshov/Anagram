package test.com.olpi.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

import com.olpi.anagram.Reverse;

public class testReverse {
	Reverse reverse = new Reverse();

	@Test(expected = NullPointerException.class)
	public final void ShouldThrowExceptionWhenTextNull() {
		String actual = null;
		String expected = "";
		assertEquals(expected, reverse.reverseText(actual));
	}

	@Test
	public final void ShouldReverseLeavingNonLettersInTheirPlaceWhenTextHasNonletters() {
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
	public final void ShouldReverseTextLeavingNonLettersInTheirPlaceWhenTextHasNonletters() {
		String actual = "abcdef yhuj#2uf";
		String expected = "fujuhy fedc#2ba";
		assertEquals(expected, reverse.reverseText(actual));
	}
}
