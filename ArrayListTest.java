package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    @Test
    void newListIsEmptyTest() {
        List list = new ArrayList();
        assertTrue(list.isEmpty());
    }

    @Test
    void addItemListIsNotEmptyTest() {
        List list = new ArrayList();
        list.add("G-String");
        assertFalse(list.isEmpty());
    }

    @Test
    void addItemListIsNotEmpty_SizeIsOneTest() {
        List list = new ArrayList();
        list.add("G-String");
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
    }

    @Test
    void addItemGetItemByIndexTest() {
        List list = new ArrayList();
        list.add("A-String");
        String savedItem = list.get(0);
        assertEquals("A-String", savedItem);
    }

    @Test
    void addXYGetXYTest() {
        List list = new ArrayList();
        list.add("G-String");
        list.add("A-String");
        assertEquals("G-String", list.get(0));
        assertEquals("A-String", list.get(1));
    }

    @Test
    void addXYremoveYSizeIsOneTest() {
        List list = new ArrayList();
        list.add("G-String");
        list.add("A-String");
        list.remove(1);
        assertEquals(1, list.size());
    }

    @Test
    void addXYremoveYFindByIndexIsNullTest() {
        List list = new ArrayList();
        list.add("G-String");
        list.add("A-String");
        list.remove(1);
        assertEquals(1, list.size());
        String deletedItem = list.get(1);
        assertNull(deletedItem);
    }
}