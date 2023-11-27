package org.cal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Centimeters {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double centimetersToMeters(double centimeters) {
        logger.info("[CENTIMETERS TO METERS] - " + centimeters);
        double res = centimeters / 100;
        logger.info("[RESULT - CENTIMETERS TO METERS] - " + res);
        return res;
    }
}
