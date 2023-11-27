package org.cal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Inches {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double inchesToCentimeters(double inches) {
        logger.info("[INCHES TO CENTIMETERS] - " + inches);
        double res = inches * 2.54;
        logger.info("[RESULT - INCHES TO CENTIMETERS] - " + res);
        return res;
    }
}
