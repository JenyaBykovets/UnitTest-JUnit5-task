import app.exceptions.TemperatureException;
import app.utils.Constants;
import org.testng.annotations.Test;


import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertTrue;


public class TemperatureValidatorTest {

    @Test
    void testValidTemperature() throws TemperatureException {
        assertTrue(Constants.validateTemperature(0));
    }

    @Test
    void testLowerBoundTemperature() {
        assertThrows(TemperatureException.class, () -> Constants.validateTemperature(-11));
    }

    @Test
    void testUpperBoundTemperature() {
        assertThrows(TemperatureException.class, () -> Constants.validateTemperature(36));
    }
}

