public class Item {

    public String name;
    public int sellIn;
    public int price;

    public Item(String name, int price, int sellIn) {
        this.name = name;
        this.sellIn = sellIn;
        this.price = price;
    }

    public static Item of(String name, int price, int sellIn) {
        return new Item(name, price, sellIn);
    }

    public void tick() {
        if (this.name.equals("normal")) {
            this.normalTick();
            return;
        }

        if (this.name.equals("Japanese Denim")) {
            this.japaneseDenimTick();
            return;
        }

        if (this.name.equals("White Vest Top")) {
            this.whiteVestTopTick();
            return;
        }

        if (this.name.equals("Fashion Show Tickets")) {
            this.fashionShowTick();
            return;
        }
    }

    private void normalTick()
    {
        this.sellIn -= 1;
        this.price -= 1;

        if (this.sellIn <= 0) {
            this.price -= 1;
        }

        if (this.price < 0) {
            this.price = 0;
        }
    }

    private void japaneseDenimTick()
    {
        this.sellIn -= 1;
        this.price += 1;

        if (this.sellIn <= 0) {
            this.price += 1;
        }

        if (this.price > 50) {
            this.price = 50;
        }
    }

    private void whiteVestTopTick()
    {
        return;
    }

    private void fashionShowTick()
    {
        this.sellIn -= 1;
        if (this.sellIn < 0) {
            this.price = 0;
            return;
        }
        this.price += 1;
        if (this.sellIn < 10) {
            this.price += 1;
        }
        if (this.sellIn < 5) {
            this.price += 1;
        }
        if (this.price > 50) {
            this.price = 50;
        }
    }

}
