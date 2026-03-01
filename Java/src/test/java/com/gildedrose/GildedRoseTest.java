package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    @Test
    void SulfurasTest() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, -1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros, 10, -1", app.items[0].toString());
    }
    
    //quality <50 or > 50
    //sell in <0 or >0
    //quality <50 or > 50
    @Test
    void AgedBrie1() {
    	Item[] items = new Item[] { new Item("Aged Brie", -1, 49) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, -2, 50", app.items[0].toString());
    }
    
    @Test
    void AgedBrie2() {
    	Item[] items = new Item[] { new Item("Aged Brie", 1, 48) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 0, 49", app.items[0].toString());
    }
    
    @Test
    void AgedBrie3() {
    	Item[] items = new Item[] { new Item("Aged Brie", 0, 48) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, -1, 50", app.items[0].toString());
    }
    
    
    @Test
    void AgedBrie4() {
    	Item[] items = new Item[] { new Item("Aged Brie", -1, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, -2, 50", app.items[0].toString());
    }
    
    @Test
    void AgedBrie5() {
    	Item[] items = new Item[] { new Item("Aged Brie", 1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, 0, 1", app.items[0].toString());
    }
    
    @Test
    void AgedBrie6() {
    	Item[] items = new Item[] { new Item("Aged Brie", -1, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie, -2, 2", app.items[0].toString());
    }
    
    //quality > 0
    	//quality--
    //sellIn--
    //sellIn < 0 && quality > 0
    	//quality--
    
    @Test
    void DefaultName1() {
    	Item[] items = new Item[] { new Item("Default", 10, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Default, 9, 0", app.items[0].toString());
    }
    @Test
    void DefaultName2() {
    	Item[] items = new Item[] { new Item("Default", 10, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Default, 9, 1", app.items[0].toString());
    }
    @Test
    void DefaultName3() {
    	Item[] items = new Item[] { new Item("Default", 0, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Default, -1, 0", app.items[0].toString());
    }
    
    @Test
    void DefaultName4() {
    	Item[] items = new Item[] { new Item("Default", -1, -1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Default, -2, -1", app.items[0].toString());
    }
    
    
    //quality < 50
    	//quality++
    //quality < 50
    	//sellin < 6
    		//quality += 2
    	//elif sellin < 11
    		//quality ++
    //sellin--
    //sellin < 0 
    	//quality = 0
    
   @Test
   void BackstagePass1() {
	   Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 51) };
       GildedRose app = new GildedRose(items);
       app.updateQuality();
       assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", app.items[0].toString());
   }
   @Test
   void BackstagePass2() {
	   Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 51) };
       GildedRose app = new GildedRose(items);
       app.updateQuality();
       assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 51", app.items[0].toString());
   }
   @Test
   void BackstagePass3() {
	   Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 50, 49) };
       GildedRose app = new GildedRose(items);
       app.updateQuality();
       assertEquals("Backstage passes to a TAFKAL80ETC concert, 49, 50", app.items[0].toString());
   }
   @Test
   void BackstagePass4() {
	   Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 50, 48) };
       GildedRose app = new GildedRose(items);
       app.updateQuality();
       assertEquals("Backstage passes to a TAFKAL80ETC concert, 49, 49", app.items[0].toString());
   }
   @Test
   void BackstagePass5() {
	   Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 4) };
       GildedRose app = new GildedRose(items);
       app.updateQuality();
       assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 7", app.items[0].toString());
   }
   @Test
   void BackstagePass6() {
	   Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 8, 8) };
       GildedRose app = new GildedRose(items);
       app.updateQuality();
       assertEquals("Backstage passes to a TAFKAL80ETC concert, 7, 10", app.items[0].toString());
   }
}
