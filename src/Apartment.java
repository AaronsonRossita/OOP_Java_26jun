public class Apartment extends Building {

    int floor;

    public Apartment(int windows, int doors, int rooms, int floor) {
        super(windows, doors, rooms);
        this.floor = floor;
    }
}
