package Week5_4.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {
    @Test
    void testPalindromeCheck(){
        PalindromeChecker pc = new PalindromeChecker();
        assertTrue(pc.isPalindrome("racecar"), "racecar palindrome failed");
        assertTrue(pc.isPalindrome("kayak"), "kayak palindrome failed");
        assertTrue(pc.isPalindrome("mom"), "mom palindrome failed");
        assertFalse(pc.isPalindrome("hello"), "PalindromeChecker failed recognizing non-palindrome");
    }

}