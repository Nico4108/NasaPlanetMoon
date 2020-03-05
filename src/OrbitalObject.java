public abstract class OrbitalObject {

    private float distanceFromSun;
    private OrbitalObject oo;

    public void setOo(OrbitalObject oo) {
        this.oo = oo;
    }

    public OrbitalObject getOo() {
        return oo;
    }

    public void setDistanceFromSun(float distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }
}
