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
    void TestHelloBoyandGirl() {
        assertEquals("Hello World", App.helloBoyandGirl(null),("null name"));
        assertEquals("Hello World", App.helloBoyandGirl("Aurélie"),("blank name"));

    }
}
