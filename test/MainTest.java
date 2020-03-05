import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Planet earth = new Planet();
        earth.hasMoon();
        assertEquals(1, earth.moonNumber);

    }

    @Test
    void mainMoon() {
        Moon moon = new Moon();
        Planet earth = new Planet();
        moon.setOo(earth);

        if (moon.getOo().equals(earth)){
            earth.hasMoon();
        }

        assertEquals(1, earth.moonNumber);

    }
}