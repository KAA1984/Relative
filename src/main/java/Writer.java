
import java.io.FileWriter;
import java.io.IOException;

public class Writer  {

    public static void writer(People person) throws IOException {
        String test = "\\C:\\Users\\Андрей\\Desktop\\test.csv";
        FileWriter writer = new FileWriter(test);
        writer.write(String.valueOf(person));
        writer.close();
    }
}
