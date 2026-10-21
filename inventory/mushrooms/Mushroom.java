package inventory.mushrooms;

public abstract class Mushroom 
{
    private final int price;

    public Mushroom(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return this.price;
    }
}