package org.cal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Miles {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double milesToKilometers(double miles) {
        logger.info("[MILES TO KILOMETERS] - " + miles);
        double res = miles * 1.60934;
        logger.info("[RESULT - MILES TO KILOMETERS] - " + res);
        return res;
    }
}
