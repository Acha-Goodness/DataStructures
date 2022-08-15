package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    void testThatStackExist(){
        Stack stackx = new Stack();
        assertNotNull(stackx);
    }
    @Test
    void testThatStackIsBlank(){
        Stack stackz = new Stack();
        assertTrue(stackz.isEmpty());
    }
    @Test
    void testThatItemCanBeAddedToStack(){
        Stack stackz = new Stack();
        stackz.push("Mac-4");
        stackz.push("Kalachinkov");
        stackz.push("General Crack");
        assertFalse(stackz.isEmpty());
    }
    @Test
    void testStackSize(){
        Stack stackx = new Stack();
        stackx.push("Mac-4");
        stackx.push("Kalachinkov");
        stackx.push("General Crack");
        assertEquals(3,stackx.size());
    }
    @Test
    void getValueAtStackTopIndex(){
        Stack stackx = new Stack();
        stackx.push("Mac-4");
        stackx.push("Kalachinkov");
        stackx.push("General Crack");
        assertEquals("General Crack", stackx.peek());
    }
    @Test
    void testToSearchForAValueInStack(){
        Stack stackx = new Stack();
        stackx.push("Mac-4");
        stackx.push("Kalachinkov");
        stackx.push("General Crack");
        assertEquals(0, stackx.search("Mac-4"));
    }
    @Test
    void testToRemoveValueInStack(){
        Stack stackx = new Stack();
        stackx.push("Mac-4");
        stackx.push("Kalachinkov");
        stackx.push("General Crack");
        String victor = stackx.pop();
        assertEquals("General Crack",stackx.pop());
    }
}
