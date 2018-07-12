public class CreekAndContinent {
    public static Item of(String name, int price, int sellIn) {

        if (name.equals("Japanese Denim")) {
            return new Japaneese(price, sellIn);
        }

        if (name.equals("White Vest Top")) {
            return new Vest(price, sellIn);
        }

        if (name.equals("Fashion Show Tickets")) {
            return new Ticket(price, sellIn);
        }

        return new NormalItem(price, sellIn);
    }
}
