public class CreekAndContinent {

    public String name;
    public int sellIn;
    public int price;

    public CreekAndContinent(String name, int price, int sellIn) {
        this.name = name;
        this.sellIn = sellIn;
        this.price = price;
    }

    public static CreekAndContinent of(String name, int price, int sellIn) {
        return new CreekAndContinent(name, price, sellIn);
    }

    public void tick()
    {
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

        if (!this.name.equals("Japanese Denim") && !this.name.equals("Fashion Show Tickets")) {
            if (this.price > 0) {
                if (!this.name.equals("White Vest Top")) {
                    this.price = this.price - 1;
                }
            }
        } else {
            if (this.price < 50) {
                this.price = this.price + 1;

                if (this.name.equals("Fashion Show Tickets")) {
                    if (this.sellIn < 11) {
                        if (this.price < 50) {
                            this.price = this.price + 1;
                        }
                    }
                    if (this.sellIn < 6) {
                        if (this.price < 50) {
                            this.price = this.price + 1;
                        }
                    }
                }
            }
        }

        if (!this.name.equals("White Vest Top")) {
            this.sellIn = this.sellIn - 1;
        }

        if (this.sellIn < 0) {
            if (!this.name.equals("Japanese Denim")) {
                if (!this.name.equals("Fashion Show Tickets")) {
                    if (this.price > 0) {
                        if (!this.name.equals("White Vest Top")) {
                            this.price = this.price - 1;
                        }
                    }
                } else {
                    this.price = this.price - this.price;
                }
            } else {
                if (this.price < 50) {
                    this.price = this.price + 1;
                }
            }
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
