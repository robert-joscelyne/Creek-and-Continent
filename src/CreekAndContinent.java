public class CreekAndContinent {

    public String name;
    public int sellIn;
    public int quality;

    public CreekAndContinent(String name, int quality, int sellIn) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static CreekAndContinent of(String name, int quality, int sellIn) {
        return new CreekAndContinent(name, quality, sellIn);
    }

    public void tick()
    {
        if (this.name.equals("normal")) {
            this.normalTick();
            return;
        }

        if (!this.name.equals("Japanese Demin") && !this.name.equals("Fashion Show Tickets")) {
        if (this.quality > 0) {
            if (!this.name.equals("White Vest Top")) {
                this.quality = this.quality - 1;
            }
        }
    } else {
        if (this.quality < 50) {
            this.quality = this.quality + 1;

            if (this.name.equals("Fashion Show Tickets")) {
                if (this.sellIn < 11) {
                    if (this.quality < 50) {
                        this.quality = this.quality + 1;
                    }
                }
                if (this.sellIn < 6) {
                    if (this.quality < 50) {
                        this.quality = this.quality + 1;
                    }
                }
            }
        }
    }

        if (!this.name.equals("White Vest Top")) {
            this.sellIn = this.sellIn - 1;
        }

        if (this.sellIn < 0) {
            if (!this.name.equals("Japanese Demin")) {
                if (!this.name.equals("Fashion Show Tickets")) {
                    if (this.quality > 0) {
                        if (!this.name.equals("White Vest Top")) {
                            this.quality = this.quality - 1;
                        }
                    }
                } else {
                    this.quality = this.quality - this.quality;
                }
            } else {
                if (this.quality < 50) {
                    this.quality = this.quality + 1;
                }
            }
        }
    }

    private void normalTick()
    {
        this.sellIn -= 1;
        this.quality -= 1;

        if (this.sellIn <= 0) {
            this.quality -= 1;
        }

        if (this.quality < 0) {
            this.quality = 0;
        }
    }
}
