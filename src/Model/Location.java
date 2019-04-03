package Model;

public class Location {
    private int id;
    private String name;
    private City city;

    public Location(int id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }
}
