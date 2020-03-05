public class Moon extends OrbitalObject {

    public void moons(){
        Moon moon = new Moon();
        Planet earth = new Planet();
        moon.setOo(earth);

        if (moon.getOo().equals(earth)) {
            earth.hasMoon();
            System.out.println("Planet has: "+earth.moonNumber+" moons!");
        }
    }
}
