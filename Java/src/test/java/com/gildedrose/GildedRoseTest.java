package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    @Test
    void UncheckedName1(){
        //with a name not checked for in any of the string checks, quality > 0 and sell in >= 0
        // the sell in and quality should decrease by 1
        Item[] items = new Item[] { new Item("New Item", 10, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("New Item, 9, 4", app.items[0].toString());
    }

    @Test
    void UncheckedName2(){
        //with a name not checked for in any of the string checks, quality <= 0 and sell in >= 0
        // the sell in should decrease by 1
        Item[] items = new Item[] { new Item("New Item", 10, -1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("New Item, 9, -1", app.items[0].toString());
    }

    @Test
    void UncheckedName3(){
        //with a name not checked for in any of the string checks and a quality <= 0 and sell in < 0
        // sell in should decrease by 1
        Item[] items = new Item[] { new Item("New Item", -1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("New Item, -2, 0", app.items[0].toString());
    }

    @Test
    void UncheckedName4(){
        //with a name not checked for in any of the string checks and a quality > 0 and sell in < 0
        // quality decrese by 1, sell in decreases by 1
        Item[] items = new Item[] { new Item("New Item", -1, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("New Item, -2, 0", app.items[0].toString());
    }

}
