import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;

public class ExportData {
    public ActionListener save(List win, String type) throws IOException {


        FileOutputStream file = new FileOutputStream("toy_store." + type, false);
        try {
            for (Object o : win) {
                if (type.equalsIgnoreCase("html")) {
                    file.write(String.format("%s<br />", o).getBytes());
                } else
                    file.write(String.format("%s", o).getBytes());
            }
            System.out.println("Export completed (file toy_store)!");
            file.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}