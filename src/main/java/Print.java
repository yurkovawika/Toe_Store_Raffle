
import java.util.Scanner;

public class Print {




    static void PrintInfoToys(ListToys toys) {
        StringBuffer sb = new StringBuffer();
        for (Toy toy : toys.getToys()) {
            sb.append(toy.toString());
        }
        System.out.println(sb);
    }


    static void PrintSize(ListToys toys) {
        System.out.printf("At the moment, toys are in the list: %d (%d)\n", toys.getSize(), toys.getSum());
    }
}
