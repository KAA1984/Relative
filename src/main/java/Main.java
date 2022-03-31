import com.fasterxml.uuid.Generators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String [] args) throws IOException {

        String fatherIdAsString ="father_ID";
        String motherIdAsString ="mother_ID";
        UUID fatherID = UUID.nameUUIDFromBytes(fatherIdAsString.getBytes());
        UUID motherID = UUID.nameUUIDFromBytes(motherIdAsString.getBytes());


        People dad = new People(fatherID,"Anatoliy","Kalistratov",null,null);
        People mother = new People(motherID,"Elena","Kalistratova",null,null);
        People son = new People(UUID.randomUUID(),"Andrey","Kalistratov",fatherID,motherID);
        People daugther = new People(UUID.randomUUID(),"Oxana","Kalistratova",fatherID,motherID);


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
