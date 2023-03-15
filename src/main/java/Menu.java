import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void MenuStoreToy(ListToys toys) throws IOException, InputMismatchException {
        Scanner scan = new Scanner(System.in);
        choosingPrizeToy choosingPrizeToy = new choosingPrizeToy();
        while (true) {
            System.out.println();
            System.out.print("Menu:\n" +
                    "\t1. Show a list of all toys in the store;\n" +
                    "\t2. Add a new toy;\n" +
                    "\t3. Remove the toy;\n" +
                    "\t4. Raffle\n" +
                    "\t0. Exit\n" +
                    "\n***Enter your choice ----->> ");

            try {
                int choice = scan.nextInt();
                switch (choice) {
                    case 1://Посмотреть информацию о всех игрушках
                        Print.PrintSize(toys);
                        Print.PrintInfoToys(toys);
                        break;
                    case 2://Добавить новую игрушку
                        int id = toys.getSize() + 1;
                        System.out.println("Enter the name of the toy: ");
                        String name = scan.next();
                        System.out.println("Enter the probability of the toy falling out (from 0 to 100%): ");
                        int weight = scan.nextInt();
                        System.out.println("Enter the number of toys of this model: ");
                        int quantity = scan.nextInt();
                        toys.addToy(new Toy(id, name, quantity, weight));
                        System.out.println("Toy added!");
                        break;
                    case 3: //Удалить игрушку
                        if (toys.getSize() == 0) {
                            System.out.println("The operation has not been performed. There are no toys on the list.");
                        } else {
                            System.out.print("Enter the toy number to delete -->> ");
                            int idx = scan.nextInt();
                            toys.removeToys(idx);
                            System.out.println("Toy deleted!");
                        }
                        break;
                    case 4://Разыграть игрушки
                        System.out.println("Enter the number of participants: ");
                        int count = scan.nextInt();
                        choosingPrizeToy.prizeToy(count, toys);
                        break;
                    case 0:
                        scan.close();
                        return;
                    default:
                        System.out.println("Error. Try again.");
                }
            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                MenuStoreToy(toys);
            }
        }
    }
}