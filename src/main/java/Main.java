
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String [] args) throws IOException {

        People dad = new People(UUID.randomUUID().toString(),"Anatoliy","Kalistratov");
        People mother = new People(UUID.randomUUID().toString(),"Elena","Kalistratova");
        People son = new People(UUID.randomUUID().toString(),"Andrey","Kalistratov");
        People daugther = new People(UUID.randomUUID().toString(),"Oxana","Kalistratova");

        List<People> relatives = new ArrayList<>();
        relatives.add(dad);
        relatives.add(mother);
        relatives.add(son);
        relatives.add(daugther);

            for(People person:relatives){
                Writepeople.writer(relatives);
                System.out.println(person);
            }

      }
}
