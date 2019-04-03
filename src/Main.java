import Model.City;
import Model.Event;
import Model.Location;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List cities = Arrays.asList(
                new City(1, "Mar del Plata"),
                new City(2, "Miramar"),
                new City(3, "Mar Chiquita"),
                new City(4, "Buenos Aires"),
                new City(5, "Dolores")
        );

        List locations = Arrays.asList(
                new Location(1, "Bruto", (City)cities.get(0)),
                new Location(2, "V8", (City)cities.get(1)),
                new Location(3, "Congo-Bongo", (City)cities.get(2)),
                new Location(4, "Antares", (City)cities.get(3)),
                new Location(5, "Cocoliche", (City)cities.get(4))
        );

        List events = Arrays.asList(
            new Event(1, "Fiesta 1", (Location)locations.get(0)),
            new Event(2, "Fiesta 2", (Location)locations.get(1)),
            new Event(3, "Fiesta 3", (Location)locations.get(2)),
            new Event(4, "Fiesta 4", (Location)locations.get(3)),
            new Event(5, "Fiesta 5", (Location)locations.get(4)),
            new Event(6, "Fiesta 6", (Location)locations.get(1)),
            new Event(7, "Fiesta 7", (Location)locations.get(2)),
            new Event(8, "Fiesta 8", (Location)locations.get(3))
        );

        System.out.println("First 5 events sorted by name: \n");
        events.stream()
                  .limit(5)
                  .sorted(Comparator.comparing(Event::getName))
                  .forEach(e -> System.out.println(e.toString()));
    }
}
