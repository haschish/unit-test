import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmthTest {
    private Smth smth = new Smth();

    @Test
    void addition() {
        assertEquals(2, smth.add(1, 1));
    }

}