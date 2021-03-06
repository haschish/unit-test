import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SmthTest extends ConsoleTest {
    @Test
    void printArray4() {
        final String testString = "4\n";
        provideInput(testString);

        String waitingString = "[0, 1, 2, 3, 4]\n";

        Smth.main(new String[0]);

        assertEquals(waitingString, getOutput());
    }

    @Test
    void printArray5() {
        final String testString = "5\n";
        provideInput(testString);

        String waitingString = "[0, 1, 2, 3, 4]\n";

        Smth.main(new String[0]);

        assertEquals(waitingString, getOutput());
    }


}