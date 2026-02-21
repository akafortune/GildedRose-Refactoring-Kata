package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        //loop through all items
        for (int i = 0; i < items.length; i++) {

            //if the item is not named aged brie and is not named backstage passes
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                //and if it's quality is greater than 0
                if (items[i].quality > 0) {
                    //AND if its name isn't sulfuras, hand of ragnaros
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        //decrease it's quality
                        items[i].quality = items[i].quality - 1;
                    }
                }
            //else if the item is named either aged brie or backstage passes
            } else {
                //and if it's quality is less than 50
                if (items[i].quality < 50) {
                    //increase the item's quality by one
                    items[i].quality = items[i].quality + 1;

                    //and if the item's name is backstage
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        //and the sellIn value is less than 11
                        if (items[i].sellIn < 11) {
                            //AND the quality is less than 50
                            if (items[i].quality < 50) {
                                //increase the quality by 1 again
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                        //and the sell in value is less than 6
                        if (items[i].sellIn < 6) {
                            //AND the quality is less than 50
                            if (items[i].quality < 50) {
                                //increase quality by 1
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            //if the name isnt sulfuras
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                //decrease sell in by 1
                items[i].sellIn = items[i].sellIn - 1;
            }

            //this whole statement is if sellin < 0 and name is not special and quality > 0 then quality--
            //if the item's sell in is less than 0
            if (items[i].sellIn < 0) {
                //and if the name is not aged brie
                if (!items[i].name.equals("Aged Brie")) {
                    // AND its name isnt backstage passes
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        //AND it's quality is less than 0
                        if (items[i].quality > 0) {
                            //AND its name isn't sulfuras hand of ragnaros
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                //decrease quality by 1
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    //if the name IS backstage passes
                    } else {
                        //set quality to 0 (WTF)
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                // if its name is aged brie and sellin  < 0
                } else {
                    //and the quality is less than 50
                    if (items[i].quality < 50) {
                        //increase quality by 1
                        items[i].quality = items[i].quality + 1;
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
