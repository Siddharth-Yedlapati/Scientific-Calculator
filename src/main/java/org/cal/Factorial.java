package org.cal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Factorial {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double factorial(double n) {
        logger.info("[FACTORIAL] - " + n);
        if(n < 0){
            return Double.NaN;
        } else if (n == 0) {
            return 1.0;
        }
        else {
            double res = 1L;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            logger.info("[RESULT - FACTORIAL] - " + res);
            return res;
        }
    }
}
