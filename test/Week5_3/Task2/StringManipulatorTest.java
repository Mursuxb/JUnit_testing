package Week5_3.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    @Test
    void canConcatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("Hello, world!", sm.concatenate("Hello, ", "world!"));
        assertEquals("Booboo", sm.concatenate("Boo", "boo"));
        assertEquals("JavaSux", sm.concatenate("Java", "Sux"));
        assertNotEquals("Hello, world!", sm.concatenate("Hello,", "world!!"));
    }

    @Test
    void canFindLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(5, sm.findLength("Hello"));
        assertEquals(0, sm.findLength(""));
        assertEquals(1, sm.findLength("a"));
        assertNotEquals(69, sm.findLength("Nice"));
    }

    @Test
    void canConvertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HELLO", sm.convertToUpperCase("hello"));
        assertEquals("HELLO", sm.convertToUpperCase("Hello"));
        assertEquals("HELLO", sm.convertToUpperCase("HELLO"));
        assertEquals("HELLO", sm.convertToUpperCase("hElLo"));
        assertEquals("THIS IS A TEST", sm.convertToUpperCase("this is a test"));
        assertNotEquals("hello", sm.convertToUpperCase("HELLo"));
    }

    @Test
    void canConvertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("hello", sm.convertToLowerCase("HELLO"));
        assertEquals("hello", sm.convertToLowerCase("Hello"));
        assertEquals("hello", sm.convertToLowerCase("hello"));
        assertEquals("hello", sm.convertToLowerCase("hElLo"));
        assertEquals("this is a test", sm.convertToLowerCase("THIS IS A TEST"));
        assertNotEquals("Hello", sm.convertToLowerCase("HELLO"));
    }

    @Test
    void canContainsSubstring() {
        StringManipulator sm = new StringManipulator();
        assertTrue(sm.containsSubstring("Hello, world!", "world"));
        assertTrue(sm.containsSubstring("Hello, world!", "Hello"));
        assertTrue(sm.containsSubstring("Hello, world!", "Hello, world!"));
        assertFalse(sm.containsSubstring("Hello, world!", "hello"));
        assertFalse(sm.containsSubstring("wurld", "Hello, world"));
        assertFalse(sm.containsSubstring("Hello, world!", "Hello, world!!"));
    }
}
