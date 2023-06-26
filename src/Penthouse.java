public class Penthouse extends Apartment{

    int stories;
    int m2Balcony;

    public Penthouse(int windows, int doors, int rooms, int floor, int stories, int m2Balcony) {
        super(windows, doors, rooms, floor);
        this.stories = stories;
        this.m2Balcony = m2Balcony;
    }
}
