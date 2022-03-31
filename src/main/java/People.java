import java.util.UUID;

public class People {

    private UUID id;

    private String name;
    private String surname;
    private UUID motherId;
    private UUID fatherId;


    public People(UUID id, String name, String surname,UUID motherId,UUID fatherId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.motherId = motherId;
        this.fatherId = fatherId;
    }


    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", motherId=" + motherId +
                ", fatherId=" + fatherId +
                '}';
    }
}
