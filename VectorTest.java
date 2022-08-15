package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {
    @Test
    void testThatListIsBlank(){
        Vector gamers = new Vector();
        assertTrue(gamers.isEmpty());
    }
    @Test
    void testThatAnItemCanBeAdded(){
        Vector gamers = new Vector();
        gamers.add("Rainbow Six");
        assertFalse(gamers.isEmpty());
    }
    @Test
    void testThatMultipleItemsCanBeAdded(){
        Vector gamers = new Vector();
        gamers.add("BasketBall 20k");
        gamers.add("25 To Life");
        gamers.add("Mortal Kombat");
        gamers.add("Tom Clancy");
        assertFalse(gamers.isEmpty());
    }
    @Test
    void testGetMultipleItemByIndex() {
        Vector gamers = new Vector();
        gamers.add("BasketBall 20k");
        gamers.add("25 To Life");
        gamers.add("Mortal Kombat");
        gamers.add("Tom Clancy");
        assertEquals("BasketBall 20k", gamers.get(0));
        assertEquals("25 To Life", gamers.get(1));
        assertEquals("Mortal Kombat", gamers.get(2));
        assertEquals("Tom Clancy", gamers.get(3));
    }
    @Test
    void testThatItemCanBeRemoved(){
         Vector gamers = new Vector();
         gamers.add("BasketBall 20k");
         gamers.add("25 To Life");
         gamers.add("Mortal Kombat");
         gamers.add("Tom Clancy");
         gamers.remove(0);
         assertEquals(null, gamers.get(0));
    }
}
