package org.cal;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Power {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double power(double n, double p) {
    logger.info("[POWER - " + n + " RAISED TO] " + p);
    double res = Math.pow(n, p);
    logger.info("[RESULT - POWER] - " + res);
    return res;
    }
}
