package co.testgit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals("Hello Aurélie", App.("Aurélie"));
    }

    @Test
    void TestHelloBoyandGirl() {
        assertEquals("Hello World", Series1.helloWorld(null), "null name");
    }
}
