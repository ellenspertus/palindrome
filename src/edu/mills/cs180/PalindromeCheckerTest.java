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

}
