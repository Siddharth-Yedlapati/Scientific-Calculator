package org.cal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Usdtoinr {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double usdToInr(double usd) {
        logger.info("[USD TO INR] - " + usd);
        // Assuming a conversion rate, you may update this with real-time rates
        double conversionRate = 83.31;
        double res = usd * conversionRate;
        logger.info("[RESULT - USD TO INR] - " + res);
        return res;
    }
}
