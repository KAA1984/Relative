
public class People {

    private String id;
    private String name;
    private String surname;


    public People(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "People{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
