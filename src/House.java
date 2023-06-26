public class House extends Building{

    int stories;

    public House(int windows, int doors, int rooms, int stories) {
        super(windows, doors, rooms);
        this.stories = stories;
    }
}
