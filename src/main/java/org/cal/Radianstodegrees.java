package org.cal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Radianstodegrees {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double radiansToDegrees(double radians) {
        logger.info("[RADIANS TO DEGREES] - " + radians);
        double res = Math.toDegrees(radians);
        logger.info("[RESULT - RADIANS TO DEGREES] - " + res);
        return res;
    }
}
