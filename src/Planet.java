public class Planet extends OrbitalObject{

    int moonNumber = 0;

    public int getMoonNumber() {
        return moonNumber;
    }

    public int hasMoon(){
        moonNumber++;
        return moonNumber;
    }
}
