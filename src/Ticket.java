public class Ticket extends Item {

    public Ticket(int price, int sellIn) {
        super(price, sellIn);
    }

    @Override
    public void tick()   {
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
