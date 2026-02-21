package com.gildedrose;

class GildedRoseRefactor {
    Item[] items;

    public GildedRoseRefactor(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        //loop through all items
        for (int i = 0; i < items.length; i++) {


            String itemName = items[i].name;
            int itemQuality = items[i].quality;
            int itemSellIn = items[i].sellIn;

            if(!this.IsASpecialName(itemName)){
                items[i].sellIn--;

                if(itemQuality > 0){
                    items[i].quality--;

                    if(itemSellIn < 0){
                        items[i].quality--;
                    }
                }
            } else if (itemName.equals("Aged Brie")){
                items[i].sellIn--;

                if (itemQuality < 50){
                    items[i].quality++;

                    if(itemSellIn < 0){
                        items[i].quality++;
                    }
                }
            } else if (itemName.equals("Backstage passes to a TAFKAL80ETC concert")) {
                items[i].sellIn--;

                if (itemSellIn < 0) {
                    items[i].quality = 0;
                } else {
                    if (itemQuality < 50) {
                        items[i].quality++;
                    }

                    if (itemSellIn < 6 && itemQuality < 50) {
                        items[i].quality += 2;
                    } else if (itemSellIn < 11 && itemQuality < 50) {
                        items[i].quality++;
                    }
                }
            }
        }
    }

    public boolean IsASpecialName(String itemName){
        if(itemName.equals("Aged Brie") || itemName.equals("Backstage passes to a TAFKAL80ETC concert") || itemName.equals("Sulfuras, Hand of Ragnaros")){
            return true;
        } else {
            return false;
        }
    }
}
