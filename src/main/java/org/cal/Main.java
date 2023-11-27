package org.cal;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    static boolean switch_flag = false;
    public static void main(String[] args) {
        System.out.print("Enter a number to start the program\n");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while (true) {
            System.out.print("***********************************CALCULATOR***********************************\n");
            System.out.print("What do you want to do ?\n");
            System.out.print("1. Square root \n2. Factorial  \n3. Natural Log \n4. Base 10 Log \n5. Exponential \n6. Power \n7. Sine \n8. Cosine \n9. Tangent \n10. Arcsine \n11. Arccosine \n12. Arctangent \n13. Sinh \n14. Cosh \n15. Tanh \n16. Round to Decimal Places \n17. Round to Nearest Integer \n18. Degrees to Radians \n19. Radians to Degrees \n20. Celsius to Fahrenheit \n21. Fahrenheit to Celsius \n22. Inches to Centimeters \n23. Centimeters to Meters \n24. Miles to Kilometers \n25. USD to INR \n26. INR to USD \n27. Centimeters to Millimeters \n28. Meters to Centimeters \n29. Mean \n30. Median \n31. Standard Deviation \n32. Variance \n33. Solve Simple Equation \n34. Solve Quadratic Equation \n35. Solve Derivative \nAny other integer to Quit\n");
            System.out.print("\n Enter your choice : ");
            int ch = sc.nextInt();
            double res = 0;
            double num, pow;
            switch (ch) {
                case (1): // SquareRoot
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = Squareroot.squareroot(num);
                    break;
                case (2): // Factorial
                    do {
                        System.out.print("Enter no : ");
                        num = (int) sc.nextDouble();
                        if (num < 0)
                            System.out.print("Please enter a positive no. !!!\n");
                    } while (num < 0);
                    res = Factorial.factorial(num);
                    break;
                case (3): // Natural Log
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = Log.log(num);
                    break;
                case (4): // Base 10 Log
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = LogBase10.logBase10(num);
                    break;
                case (5): // Exponential
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = Exponential.exponential(num);
                    break;
                case (6): // Power
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    System.out.print("Enter power : ");
                    pow = sc.nextDouble();
                    res = Power.power(num, pow);
                    break;
                case (7): // Sine
                    System.out.print("Enter angle in radians : ");
                    num = sc.nextDouble();
                    res = Sine.sine(num);
                    break;
                case (8): // Cosine
                    System.out.print("Enter angle in radians : ");
                    num = sc.nextDouble();
                    res = Cosine.cosine(num);
                    break;
                case (9): // Tangent
                    System.out.print("Enter angle in radians : ");
                    num = sc.nextDouble();
                    res = Tangent.tangent(num);
                    break;
                case (10): // Arcsine
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Arcsine.arcsine(num);
                    break;
                case (11): // Arccosine
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Arccosine.arccosine(num);
                    break;
                case (12): // Arctangent
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Arctangent.arctangent(num);
                    break;
                case (13): // Sinh
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Sinh.sinh(num);
                    break;
                case (14): // Cosh
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Cosh.cosh(num);
                    break;
                case (15): // Tanh
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Tanh.tanh(num);
                    break;
                case (16): // Round to Decimal Places
                    System.out.print("Enter number : ");
                    num = sc.nextDouble();
                    System.out.print("Enter decimal places : ");
                    int decimalPlaces = sc.nextInt();
                    res = Roundtodecimal.roundToDecimalPlaces(num, decimalPlaces);
                    break;
                case (17): // Round to Nearest Integer
                    System.out.print("Enter number : ");
                    num = sc.nextDouble();
                    res = Roundtointeger.roundToNearestInteger(num);
                    break;
                case (18): // Degrees to Radians
                    System.out.print("Enter degrees : ");
                    num = sc.nextDouble();
                    res = Degreestoradians.degreesToRadians(num);
                    break;
                case (19): // Radians to Degrees
                    System.out.print("Enter radians : ");
                    num = sc.nextDouble();
                    res = Radianstodegrees.radiansToDegrees(num);
                    break;
                case (20): // Celsius to Fahrenheit
                    System.out.print("Enter temperature in Celsius : ");
                    num = sc.nextDouble();
                    res = Celsius.celsiusToFahrenheit(num);
                    break;
                case (21): // Fahrenheit to Celsius
                    System.out.print("Enter temperature in Fahrenheit : ");
                    num = sc.nextDouble();
                    res = Farenheit.fahrenheitToCelsius(num);
                    break;
                case (22): // Inches to Centimeters
                    System.out.print("Enter length in inches : ");
                    num = sc.nextDouble();
                    res = Inches.inchesToCentimeters(num);
                    break;
                case (23): // Centimeters to Meters
                    System.out.print("Enter length in centimeters : ");
                    num = sc.nextDouble();
                    res = Centimeters.centimetersToMeters(num);
                    break;
                case (24): // Miles to Kilometers
                    System.out.print("Enter distance in miles : ");
                    num = sc.nextDouble();
                    res = Miles.milesToKilometers(num);
                    break;
                case (25): // USD to INR
                    System.out.print("Enter amount in USD : ");
                    num = sc.nextDouble();
                    res = Usdtoinr.usdToInr(num);
                    break;
                case (26): // INR to USD
                    System.out.print("Enter amount in INR : ");
                    num = sc.nextDouble();
                    res = Inrtousd.inrToUsd(num);
                    break;
                case (27): // Centimeters to Millimeters
                    System.out.print("Enter length in centimeters : ");
                    num = sc.nextDouble();
                    res = Centimeterstomm.centimetersToMillimeters(num);
                    break;
                case (28): // Meters to Centimeters
                    System.out.print("Enter length in meters : ");
                    num = sc.nextDouble();
                    res = Meterstocm.metersToCentimeters(num);
                    break;
                case (29): // Mean
                    System.out.print("Enter the number of values : ");
                    int count = sc.nextInt();
                    double[] values = new double[count];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < count; i++) {
                        values[i] = sc.nextDouble();
                    }
                    res = Mean.mean(values);
                    break;
                case (30): // Median
                    System.out.print("Enter the number of values : ");
                    int countMedian = sc.nextInt();
                    double[] valuesMedian = new double[countMedian];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < countMedian; i++) {
                        valuesMedian[i] = sc.nextDouble();
                    }
                    res = Median.median(valuesMedian);
                    break;
                case (31): // Standard Deviation
                    System.out.print("Enter the number of values : ");
                    int countSD = sc.nextInt();
                    double[] valuesSD = new double[countSD];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < countSD; i++) {
                        valuesSD[i] = sc.nextDouble();
                    }
                    res = Standarddeviation.standardDeviation(valuesSD);
                    break;
                case (32): // Variance
                    System.out.print("Enter the number of values : ");
                    int countVariance = sc.nextInt();
                    double[] valuesVariance = new double[countVariance];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < countVariance; i++) {
                        valuesVariance[i] = sc.nextDouble();
                    }
                    res = Variance.variance(valuesVariance);
                    break;
                case (33): // Solve Simple Equation
                    System.out.print("Enter only coefficients of the simple equation (e.g., 'a*x + b = c', then enter 'a,b,c'): ");
                    sc.nextLine(); // Consume newline
                    String simpleEquation = sc.nextLine();
                    res = SolveSimpleEquation.solveSimpleEquation(simpleEquation);
                    break;
                case (34): // Solve Quadratic Equation
                    System.out.print("Enter the coefficients of the quadratic equation (e.g., 'a*x^2 + b*x + c = 0'): input 'a,b,c':");
                    sc.nextLine(); // Consume newline
                    String quadraticEquation = sc.nextLine();
                    res = Solvequadraticequation.solveQuadraticEquation(quadraticEquation);
                    break;
                case(35): // Solve Derivative
                    ArrayList<String> all_terms = new ArrayList<String>();
                    System.out.print("Enter the type of Derivative to be solved for: ( Power Rule, Product Rule, Chain Rule, Log Rule)");
                    sc.nextLine();
                    String input = sc.nextLine();
                    if (input.equals("Power Rule")){
                        System.out.print("Enter your function: (MULTIPLE TERMS AVAILABLE e.g. 'ax^b+cx^d+ex^f+...'): ");
                        String function = sc.next();
                        Process_power_rule.process_power_rule(function);
                        while (switch_flag==false){
                            System.out.print("Enter your function: ");
                            sc.reset();
                            function=sc.next();
                            Process_power_rule.process_power_rule(function);
                        }

                        System.out.print("The derivative is: "+ Process_power_rule.process_power_rule(function) + "\n");

                    }
                    if (input.equals("Product Rule")){
                        System.out.print("Enter your function (form: (ax^b+cx^d)*(ex^f+gx^h)): ");
                        String function = sc.next();
                        Process_product_rule.process_product_rule(function);
                        while (switch_flag==false) {
                            System.out.print("Enter your function (form: (ax^b+cx^d)*(ex^f+gx^h)): ");
                            sc.reset();
                            function = sc.next();
                            Process_product_rule.process_product_rule(function);

                        }
                        System.out.print("Derivative: "+ Process_product_rule.process_product_rule(function) + "\n");

                    }
                    if (input.equals("Chain Rule")){
                        System.out.print("Enter your function (form: (ax^b+cx^d)^e): ");
                        String function = sc.next();
                        Process_chain_rule.process_chain_rule(function);
                        while (switch_flag==false){
                            System.out.print("Enter your function (form: (ax^b+cx^d)^e): ");
                            sc.reset();
                            function=sc.next();
                            Process_chain_rule.process_chain_rule(function);

                        }

                        ChainRule obj = new ChainRule(function);
                        System.out.print("Derivative: "+ Process_chain_rule.process_chain_rule(function) + "\n");

                    }
                    if (input.equals("Log Rule")){
                        System.out.print("Enter your function (form: a^x, MULTIPLE TERMS NOT AVAILABLE): ");
                        String function = sc.next();
                        Process_log_rule.process_log_rule(function);
                        while (switch_flag==false){
                            System.out.print("Enter your function (form: a^x, MULTIPLE TERMS NOT AVAILABLE): ");
                            sc.reset();
                            function=sc.next();
                            Process_log_rule.process_log_rule(function);
                        }

                        System.out.print("Derivative: "+ Process_log_rule.process_log_rule(function) + "\n");

                    }

                default:
                    System.out.print("Closing the application\n");
                    return;
            }
            System.out.print("Result : " + res + "\n");
        }
    }

    public static String log_rule_calc(String term){
        String number = "";
        for (int placeInString = 0;placeInString<term.length();placeInString++){
            if (String.valueOf(term.charAt(placeInString)).equals("^")){
                number=term.substring(0,placeInString);

            }
        }
        Double.parseDouble(number);
        return (term+"ln("+number+")");

    }

    public static String power_rule_calc(){
        if (SingleInputAnalyzer.getVariable().equals("")){
            return "0";
        }
        double coefficient=Double.parseDouble(SingleInputAnalyzer.getCoefficient());
        double power = Double.parseDouble(SingleInputAnalyzer.getPower());
        final String VARIABLE = SingleInputAnalyzer.getVariable();
        String newCoefficient = String.valueOf(coefficient*power);
        String newPower = String.valueOf(power-1);
        String newTerm = newCoefficient+VARIABLE+"^"+newPower;
        return newTerm;
    }


    public static String product_rule_calc(String input){
        String fx="",gx="";
        boolean switch1=false,switch2=false;
        boolean entireSwitch1=true,entireSwitch2=false;;
        for (int i=0;i<input.length();i++){
            if (entireSwitch1==true){
                if (switch1==true){
                    if (!String.valueOf(input.charAt(i)).equals(")")){

                        fx+=String.valueOf(input.charAt(i));
                    }
                }
                if (String.valueOf(input.charAt(i)).equals("(")){
                    switch1=true;
                }
                if (String.valueOf(input.charAt(i)).equals(")")){
                    switch1=false;
                    entireSwitch1=false;
                    entireSwitch2=true;
                    i+=1;
                }
            }
            if (entireSwitch2==true){

                if (switch2==true){

                    if (!String.valueOf(input.charAt(i)).equals(")")){

                        gx+=String.valueOf(input.charAt(i));
                    }
                }
                if (String.valueOf(input.charAt(i)).equals("(")){

                    switch2=true;
                }
                if (String.valueOf(input.charAt(i)).equals(")")){
                    switch2=false;
                    entireSwitch2=false;
                }
            }
        }
        String dfdx = MIA.MIA(fx);
        String dgdx = MIA.MIA(gx);
        return ("("+gx+")"+"*"+"("+dfdx+")"+"+"+"("+fx+")"+"*"+"("+dgdx+")");
    }




}
