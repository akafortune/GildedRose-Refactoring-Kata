package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
    	int upperQualityThreshold = 50;
    	int lowerQualityThreshold = 0;
    	int lowerSellInThreshold = 0;
    	
    	
    	
        //loop through all items
        for (int i = 0; i < items.length; i++) {
        	
        	int quality = items[i].quality;
        	int sellIn = items[i].sellIn;
        	
        	
        	if(items[i].name.equals("Aged Brie")){
        		
        		if (quality < upperQualityThreshold) {
        			quality++;
        		}
        		
        		sellIn--;
        		
        		if(sellIn < lowerSellInThreshold && quality < upperQualityThreshold) {
                    quality++;
        		}
        	} else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {

        		if (quality < upperQualityThreshold) {
                    quality++;
                    
                    if(sellIn < 11 && sellIn >= 6) {
                    	quality++;
                    } else if(sellIn < 6) {
                    	quality += 2;
                    }
                    
                    if(quality > upperQualityThreshold) {
                    	quality = upperQualityThreshold;
                    }
        		}
        		
                sellIn--;
                
                if(sellIn < lowerSellInThreshold) {
                	quality = 0;
                }
        		
        	} else if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        		
        		String[] itemNameArr = items[i].name.split(" ");
        		int itemDegradeFactor = 1;
        		
        		if(itemNameArr[0].toLowerCase().equals("conjured")) {
        			itemDegradeFactor = 2;
        		}
        		
        		if (quality > lowerQualityThreshold) {
                    quality -= 1 * itemDegradeFactor;
                }
        		
        		sellIn--;
        		
        		if(sellIn < lowerSellInThreshold && quality > lowerQualityThreshold) {
        			quality -= 1 * itemDegradeFactor;
        		}
        	} 
        	
        	items[i].quality = quality;
        	items[i].sellIn = sellIn;
        }
    }
}
