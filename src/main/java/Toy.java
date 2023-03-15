
public class Toy {
    protected int id;
    protected String name;
    protected int weight;
    protected int quantity;

    public Toy(int id, String name, int quantity, int weight) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;

    }

    public int getId() {
        return this.id;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }


    @Override
    public String toString() {
        return String.format("%d. name toy:  %s, weight: %d %%; quantity: %d;\n", id, name, weight, quantity);
    }
}
