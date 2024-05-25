package org.example;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private List<Item> items(Item... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    @Test
    void checkEveryBranch() {
        RuntimeException exception;
        //1
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 2000));
        assertTrue(exception.getMessage().contains("allItems list can't be null!"));
        //2
        assertTrue(SILab2.checkCart(items(new Item("", "0567", 500, 0.1f)), 3000));
        //3
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items(new Item("kiwi", null, 0, 0f)), 1));
        assertTrue(exception.getMessage().contains("No barcode!"));
        //4
        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items(new Item("apple", "-19292", 0, 0f)), 1));
        assertTrue(exception.getMessage().contains("Invalid character in item barcode!"));
        //5
        assertFalse(SILab2.checkCart(items(new Item("cherry", "5362", 500, 0.1f)), 3));

    }
    @Test
    void checkMultipleConditions(){
        assertTrue(SILab2.checkCart(items(new Item("", "0251", 400, 0.2f)),300));
        assertFalse(SILab2.checkCart(items(new Item("", "1251", 400, 0.2f)),5));
        assertFalse(SILab2.checkCart(items(new Item("", "1251", 350, 0)),300));
        assertFalse(SILab2.checkCart(items(new Item("", "0251", 250, 0.5f)),1));
    }
}