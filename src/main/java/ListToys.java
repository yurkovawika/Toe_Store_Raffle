import java.util.ArrayList;
import java.util.List;

public class ListToys {


    protected List<Toy> toys;


    public ListToys() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);

    }

    public int getSum() {
        int sum = 0;
        for (Toy t : toys) {
            sum = sum + t.getQuantity();
        }
        return sum;
    }

    public Toy getToy(int idx) {
        return toys.get(idx - 1);

    }

    public List<Toy> getToys() {
        return this.toys;
    }

    public int getSize() {
        return toys.size();
    }


    public void removeToys(int idx) {
        toys.remove(idx - 1);
    }


    @Override
    public String toString() {
        return toys.toString();
    }
}