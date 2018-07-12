import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreekAndContinentTest {
    @Test
    public void updatesNormalItemsBeforeSellDate() {
        CreekAndContinent item = new CreekAndContinent("normal", 10,5);
        item.tick();
        assertEquals(9, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesNormalItemsOnTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("normal", 10,0);
        item.tick();
        assertEquals(8, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesNormalItemsAfterTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("normal", 10,-5);
        item.tick();
        assertEquals(8, item.quality);
        assertEquals(-6, item.sellIn);
    }

    @Test
    public void updatesNormalItemsWithQualityOf0() {
        CreekAndContinent item = new CreekAndContinent("normal", 0,5);
        item.tick();
        assertEquals(0, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsBeforeTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Japanese Demin", 10,5);
        item.tick();
        assertEquals(11, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsBeforeTheSellDateWithMaxQuality() {
        CreekAndContinent item = new CreekAndContinent("Japanese Demin", 50,5);
        item.tick();
        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsOnTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Japanese Demin", 10,0);
        item.tick();
        assertEquals(12, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsOnTheSellDateNearMaxQuality() {
        CreekAndContinent item = new CreekAndContinent("Japanese Demin", 49,0);
        item.tick();
        assertEquals(50, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsOnTheSellDateWithMaxQuality() {
        CreekAndContinent item = new CreekAndContinent("Japanese Demin", 50,0);
        item.tick();
        assertEquals(50, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsAfterTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Japanese Demin", 10,-10);
        item.tick();
        assertEquals(12, item.quality);
        assertEquals(-11, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsAfterTheSellDateWithMaxQuality() {
        CreekAndContinent item = new CreekAndContinent("Japanese Demin", 50,-10);
        item.tick();
        assertEquals(50, item.quality);
        assertEquals(-11, item.sellIn);
    }

    @Test
    public void updatesWhiteVestItemsBeforeTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("White Vest Top", 10,5);
        item.tick();
        assertEquals(10, item.quality);
        assertEquals(5, item.sellIn);
    }

    @Test
    public void updatesWhiteVestItemsOnTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("White Vest Top", 10,5);
        item.tick();
        assertEquals(10, item.quality);
        assertEquals(5, item.sellIn);
    }

    @Test
    public void updatesWhiteVestItemsAfterTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("White Vest Top", 10,-1);
        item.tick();
        assertEquals(10, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsBeforeTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 10,11);
        item.tick();
        assertEquals(11, item.quality);
        assertEquals(10, item.sellIn);
    }


    @Test
    public void updatesFashionShowTicketsCloseToTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 10,10);
        item.tick();
        assertEquals(12, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsBeforeTheSellDateAtMaxQuality() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 50,10);
        item.tick();
        assertEquals(50, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsVeryCloseToTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 10,5);
        item.tick();
        assertEquals(13, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsVeryCloseToTheSellDateAtMaxQuality() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 50,5);
        item.tick();
        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsWithOneDayLeftToSell() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 10,1);
        item.tick();
        assertEquals(13, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsWithOneDayLeftToSellAtMaxQuality() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 50,1);
        item.tick();
        assertEquals(50, item.quality);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsOnSellDate() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 10,0);
        item.tick();
        assertEquals(0, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsAfterTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Fashion Show Tickets", 10,-1);
        item.tick();
        assertEquals(0, item.quality);
        assertEquals(-2, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsBeforeTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Homeware Hand Towel", 10,10);
        item.tick();
        assertEquals(8, item.quality);
        assertEquals(9, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsAtZeroQuality() {
        CreekAndContinent item = new CreekAndContinent("Homeware Hand Towel", 0,10);
        item.tick();
        assertEquals(0, item.quality);
        assertEquals(9, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsOnTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Homeware Hand Towel", 10,0);
        item.tick();
        assertEquals(6, item.quality);
        assertEquals(-1, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsBeforeTheSellDateAtZeroQuality() {
        CreekAndContinent item = new CreekAndContinent("Homeware Hand Towel", 0,0);
        item.tick();
        assertEquals(0, item.quality);
        assertEquals(-1, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsAfterTheSellDate() {
        CreekAndContinent item = new CreekAndContinent("Homeware Hand Towel", 10,-10);
        item.tick();
        assertEquals(6, item.quality);
        assertEquals(-11, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsAfterTheSellDateAtZeroQuality() {
        CreekAndContinent item = new CreekAndContinent("Homeware Hand Towel", 0,10);
        item.tick();
        assertEquals(0, item.quality);
        assertEquals(-11, item.sellIn);
    }
}