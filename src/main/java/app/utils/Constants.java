package app.utils;

import app.exceptions.TemperatureException;

public class Constants {

        public static final int MIN_TEMPERATURE = -10;
        public static final int MAX_TEMPERATURE = 35;

        public static boolean validateTemperature(int temperature) throws TemperatureException {
            if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
                throw new TemperatureException("Temperature is out of range.");
            }
            return true;
        }
    }


