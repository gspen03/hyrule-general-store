package inventory.meats;

public abstract class Meat
{
    private final int price;

    public Meat(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return this.price;
    }
}