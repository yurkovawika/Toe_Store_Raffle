
import java.io.IOException;
public class Program {
    public static void main(String[] args) throws IOException {

        ListToys toys = new ListToys();
        toys.addToy(new Toy(1, "Sega", 50, 5));
        toys.addToy(new Toy(2, "Kids_camera", 100, 30));
        toys.addToy(new Toy(3, "Dandy", 50, 5));
        toys.addToy(new Toy(4, "Dinosaur", 200, 90));
        Menu.MenuStoreToy(toys);
    }

}
