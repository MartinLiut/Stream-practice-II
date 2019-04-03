package Model;

public class Event {
    private int id;
    private String name;
    private Location location;

    public String getName() {
        return name;
    }

    public Event(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return  id + ". Name: " + name + " -  Location: " + location.getName();
    }
}
