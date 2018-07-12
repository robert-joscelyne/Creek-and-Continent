public class Japaneese extends Item {

    public Japaneese(int price, int sellIn) {
        super(price, sellIn);
    }

    @Override
    public void tick()     {
        this.sellIn -= 1;
        this.price += 1;

        if (this.sellIn <= 0) {
            this.price += 1;
        }

        if (this.price > 50) {
            this.price = 50;
        }
    }
}
