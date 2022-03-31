import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Writepeople {

    public static void writer(List<People> relatives) throws IOException {

            String test = "\\C:\\Users\\Андрей\\Desktop\\test.csv";
            FileWriter writer = new FileWriter(test);
            writer.write(String.valueOf(relatives));
            writer.close();

    }
}


