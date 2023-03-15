import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class choosingPrizeToy {

    public void prizeToy(int count, ListToys toys) throws IOException {
        List<String> listres = new ArrayList<>();
        String upper_field = "id;status;prize;\n";
        listres.add(upper_field);
        List<Integer> ints = new ArrayList<>();
        for (Toy i : toys.getToys()) {
            for (int j = i.weight; j > 0; j--) {
                ints.add(i.getId());
            }
        }
        int rnd;
        while (count > 0) {
            rnd = ThreadLocalRandom.current().nextInt(0, ints.size());
            int idToy = ints.get(rnd);
            //
            if ((toys.getSize()) > 0 && (toys.getToy(idToy).quantity > 0)) {
                String res = String.format("%d;win;%s;\n", count, toys.getToy(idToy).getName());
                listres.add(res);
                toys.getToy(idToy).quantity--;
                count--;
            } else if (toys.getSum()==0) {
                String res = String.format("%d;fail;0;\n", count);
                listres.add(res);
                count--;
            }
        }
        System.out.println(listres);
        ExportData exportData = new ExportData();
        exportData.save(listres, "csv");

    }
}