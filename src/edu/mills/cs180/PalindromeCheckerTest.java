package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class PalindromeCheckerTest {

    @Test
    public void isPalindrome_True_EmptyString() {
        String s = "";
        assertEquals(s, PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @CsvSource({"AMA", "racecar", "x"})
    void TestAcceptedStrings(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @CsvSource({"Java", "abc", "spatula"})
    void TestRejedctedStrings(String s) {
        assertFalse(PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ama", "Wow", "reddER"})
    void isPalindrome_True_DifferingCase(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"my gym", "top spot", "step on no pets"})
    void isPalindrome_True_HavingSpaces(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"WOW!!!", "I did, did I?", "?!"})
    void isPalindrome_True_HavingPunctuationAndSpaces(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s));
    }


}
