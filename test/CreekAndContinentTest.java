import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreekAndContinentTest {
    @Test
    public void updatesNormalItemsBeforeSellDate() {
        Item item = CreekAndContinent.of("normal", 10,5);
        item.tick();
        assertEquals(9, item.price);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesNormalItemsOnTheSellDate() {
        Item item = CreekAndContinent.of("normal", 10,0);
        item.tick();
        assertEquals(8, item.price);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesNormalItemsAfterTheSellDate() {
        Item item = CreekAndContinent.of("normal", 10,-5);
        item.tick();
        assertEquals(8, item.price);
        assertEquals(-6, item.sellIn);
    }

    @Test
    public void updatesNormalItemsWithPriceOf0() {
        Item item = CreekAndContinent.of("normal", 0,5);
        item.tick();
        assertEquals(0, item.price);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsBeforeTheSellDate() {
        Item item = CreekAndContinent.of("Japanese Denim", 10,5);
        item.tick();
        assertEquals(11, item.price);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsBeforeTheSellDateWithMaxPrice() {
        Item item = CreekAndContinent.of("Japanese Denim", 50,5);
        item.tick();
        assertEquals(50, item.price);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsOnTheSellDate() {
        Item item = CreekAndContinent.of("Japanese Denim", 10,0);
        item.tick();
        assertEquals(12, item.price);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsOnTheSellDateNearMaxPrice() {
        Item item = CreekAndContinent.of("Japanese Denim", 49,0);
        item.tick();
        assertEquals(50, item.price);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsOnTheSellDateWithMaxPrice() {
        Item item = CreekAndContinent.of("Japanese Denim", 50,0);
        item.tick();
        assertEquals(50, item.price);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsAfterTheSellDate() {
        Item item = CreekAndContinent.of("Japanese Denim", 10,-10);
        item.tick();
        assertEquals(12, item.price);
        assertEquals(-11, item.sellIn);
    }

    @Test
    public void updatesJapaneseDenimItemsAfterTheSellDateWithMaxPrice() {
        Item item = CreekAndContinent.of("Japanese Denim", 50,-10);
        item.tick();
        assertEquals(50, item.price);
        assertEquals(-11, item.sellIn);
    }

    @Test
    public void updatesWhiteVestItemsBeforeTheSellDate() {
        Item item = CreekAndContinent.of("White Vest Top", 10,5);
        item.tick();
        assertEquals(10, item.price);
        assertEquals(5, item.sellIn);
    }

    @Test
    public void updatesWhiteVestItemsOnTheSellDate() {
        Item item = CreekAndContinent.of("White Vest Top", 10,5);
        item.tick();
        assertEquals(10, item.price);
        assertEquals(5, item.sellIn);
    }

    @Test
    public void updatesWhiteVestItemsAfterTheSellDate() {
        Item item = CreekAndContinent.of("White Vest Top", 10,-1);
        item.tick();
        assertEquals(10, item.price);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsBeforeTheSellDate() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 10,11);
        item.tick();
        assertEquals(11, item.price);
        assertEquals(10, item.sellIn);
    }


    @Test
    public void updatesFashionShowTicketsCloseToTheSellDate() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 10,10);
        item.tick();
        assertEquals(12, item.price);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsBeforeTheSellDateAtMaxPrice() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 50,10);
        item.tick();
        assertEquals(50, item.price);
        assertEquals(9, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsVeryCloseToTheSellDate() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 10,5);
        item.tick();
        assertEquals(13, item.price);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsVeryCloseToTheSellDateAtMaxPrice() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 50,5);
        item.tick();
        assertEquals(50, item.price);
        assertEquals(4, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsWithOneDayLeftToSell() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 10,1);
        item.tick();
        assertEquals(13, item.price);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsWithOneDayLeftToSellAtMaxPrice() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 50,1);
        item.tick();
        assertEquals(50, item.price);
        assertEquals(0, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsOnSellDate() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 10,0);
        item.tick();
        assertEquals(0, item.price);
        assertEquals(-1, item.sellIn);
    }

    @Test
    public void updatesFashionShowTicketsAfterTheSellDate() {
        Item item = CreekAndContinent.of("Fashion Show Tickets", 10,-1);
        item.tick();
        assertEquals(0, item.price);
        assertEquals(-2, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsBeforeTheSellDate() {
        Item item = CreekAndContinent.of("Homeware Hand Towel", 10,10);
        item.tick();
        assertEquals(8, item.price);
        assertEquals(9, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsAtZeroPrice() {
        Item item = CreekAndContinent.of("Homeware Hand Towel", 0,10);
        item.tick();
        assertEquals(0, item.price);
        assertEquals(9, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsOnTheSellDate() {
        Item item = CreekAndContinent.of("Homeware Hand Towel", 10,0);
        item.tick();
        assertEquals(6, item.price);
        assertEquals(-1, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsBeforeTheSellDateAtZeroPrice() {
        Item item = CreekAndContinent.of("Homeware Hand Towel", 0,0);
        item.tick();
        assertEquals(0, item.price);
        assertEquals(-1, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsAfterTheSellDate() {
        Item item = CreekAndContinent.of("Homeware Hand Towel", 10,-10);
        item.tick();
        assertEquals(6, item.price);
        assertEquals(-11, item.sellIn);
    }

//    @Test
    public void updatesHomewareItemsAfterTheSellDateAtZeroPrice() {
        Item item = CreekAndContinent.of("Homeware Hand Towel", 0,10);
        item.tick();
        assertEquals(0, item.price);
        assertEquals(-11, item.sellIn);
    }
}