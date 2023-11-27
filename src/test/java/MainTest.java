import org.cal.*;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class MainTest {

//    Main calculator = new Main();
    // Unit Test for squareroot Function
    @Test
    public void testPositiveSquareRoot() {
        assertEquals(4.0, Squareroot.squareroot(16), 0.001);
    }

    @Test
    public void testZeroSquareRoot() {
        assertEquals(0.0, Squareroot.squareroot(0), 0.001);
    }

    @Test
    public void testNegativeSquareRoot() {
        assertEquals(Double.NaN, Squareroot.squareroot(-25), 0.001);
    }

    // Unit Test for factorial Function
    @Test
    public void testPositiveFactorial() {
        assertEquals(120, Factorial.factorial(5), 0.001);
    }

    @Test
    public void testZeroFactorial() {
        assertEquals(1, Factorial.factorial(0), 0.001);
    }

    @Test
    public void testNegativeFactorial() {
        assertEquals(Double.NaN, Factorial.factorial(-3), 0.001);
    }
//
//     Unit Test for log Function
    @Test
    public void testPositiveLog() {
        assertEquals(4.6, Log.log(100), 0.1);
    }

    @Test
    public void testZeroLog() {
        assertEquals(Double.NEGATIVE_INFINITY, Log.log(0), 0.001);
    }

    @Test
    public void testNegativeLog() {
        assertEquals(Double.NaN, Log.log(-5), 0.001);
    }

    // Unit Test for logBase10 Function
    @Test
    public void testPositiveLogBase10() {
        assertEquals(2.0, LogBase10.logBase10(100), 0.001);
    }

    @Test
    public void testZeroLogBase10() {
        assertEquals(Double.NEGATIVE_INFINITY, LogBase10.logBase10(0), 0.001);
    }

    @Test
    public void testNegativeLogBase10() {
        assertEquals(Double.NaN, LogBase10.logBase10(-5), 0.001);
    }

    // Unit Test for exponential Function
    @Test
    public void testPositiveExponential() {
        assertEquals(20.0855, Exponential.exponential(3), 0.001);
    }

    @Test
    public void testZeroExponential() {
        assertEquals(1.0, Exponential.exponential(0), 0.001);
    }

    @Test
    public void testNegativeExponential() {
        assertEquals(0.0497, Exponential.exponential(-3), 0.001);
    }

    // Unit Test for power Function
    @Test
    public void testPositivePower() {
        assertEquals(64, Power.power(2, 6), 0.001);
    }

    @Test
    public void testZeroPower() {
        assertEquals(1, Power.power(10, 0), 0.001);
    }

    @Test
    public void testNegativePower() {
        assertEquals(0.25, Power.power(2, -2), 0.001);
    }

    // Unit Test for sine, cosine, and tangent Functions
    @Test
    public void testSine() {
        assertEquals(1.0, Sine.sine(1.57), 0.1);
    }

    @Test
    public void testCosine() {
        assertEquals(1.0, Cosine.cosine(0), 0.001);
    }

    @Test
    public void testTangent() {
        assertEquals(1.0, Tangent.tangent(0.785), 0.1);
    }

    // Unit Test for arcsine, arccosine, and arctangent Functions
    @Test
    public void testArcsine() {
        assertEquals(1.57, Arcsine.arcsine(1), 0.1);
    }

    @Test
    public void testArccosine() {
        assertEquals(1.57, Arccosine.arccosine(0), 0.1);
    }

    @Test
    public void testArctangent() {
        assertEquals(0.785, Arctangent.arctangent(1), 0.1);
    }

    // Unit Test for sinh, cosh, and tanh Functions
    @Test
    public void testSinh() {
        assertEquals(2.299, Sinh.sinh(1.57), 0.1);
    }

    @Test
    public void testCosh() {
        assertEquals(1.0, Cosh.cosh(0), 0.001);
    }

    @Test
    public void testTanh() {
        assertEquals(0.917, Tanh.tanh(1.57), 0.1);
    }

    // Unit Test for roundToDecimalPlaces Function
    @Test
    public void testRoundToDecimalPlaces() {
        assertEquals(3.142, Roundtodecimal.roundToDecimalPlaces(Math.PI, 3), 0.001);
    }

    // Unit Test for roundToNearestInteger Function
    @Test
    public void testRoundToNearestInteger() {
        assertEquals(5, Roundtointeger.roundToNearestInteger(4.6), 0.001);
    }

    // Unit Test for degreesToRadians and radiansToDegrees Functions
    @Test
    public void testDegreesToRadians() {
        assertEquals(Math.PI, Degreestoradians.degreesToRadians(180), 0.001);
    }

    @Test
    public void testRadiansToDegrees() {
        assertEquals(180.0, Radianstodegrees.radiansToDegrees(Math.PI), 0.001);
    }

    // Unit Test for Temperature Conversion Functions
    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(89.6, Celsius.celsiusToFahrenheit(32.0), 0.1);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(32.0, Farenheit.fahrenheitToCelsius(89.6), 0.1);
    }

    // Unit Test for Length Conversion Functions
    @Test
    public void testInchesToCentimeters() {
        assertEquals(2.54, Inches.inchesToCentimeters(1), 0.001);
    }

    @Test
    public void milesToKilometers(){
        assertEquals(6.437, Miles.milesToKilometers(4.0), 0.1);
    }

    @Test
    public void testCentimetersToMeters() {
        assertEquals(1.0, Centimeters.centimetersToMeters(100), 0.001);
    }

    // Unit Test for Currency Conversion Functions
    @Test
    public void testUsdToInr() {
        assertEquals(5000.0, Usdtoinr.usdToInr(60), 5);
    }

    @Test
    public void testInrToUsd() {
        assertEquals(60.0, Inrtousd.inrToUsd(5000), 0.001);
    }

    // Unit Test for Additional Unit Conversion Functions
    @Test
    public void testCentimetersToMillimeters() {
        assertEquals(10.0, Centimeterstomm.centimetersToMillimeters(1), 0.001);
    }

    @Test
    public void testMetersToCentimeters() {
        assertEquals(100.0, Meterstocm.metersToCentimeters(1), 0.001);
    }

    // Unit Test for Statistical Functions
    @Test
    public void testMean() {
        assertEquals(3.0, Mean.mean(new double[]{1, 2, 3, 4, 5}), 0.001);
    }

    @Test
    public void testMedian1() {
        assertEquals(3.0, Median.median(new double[]{1, 3, 2, 4, 5}), 0.001);
    }

    @Test
    public void testMedian2() {
        assertEquals(2.5, Median.median(new double[]{1, 3, 2, 4}), 0.001);
    }

    @Test
    public void testStandardDeviation() {
        assertEquals(1.414, Standarddeviation.standardDeviation(new double[]{1, 2, 3, 4, 5}), 0.001);
    }

    @Test
    public void testVariance() {
        assertEquals(2.0, Variance.variance(new double[]{1, 2, 3, 4, 5}), 0.001);
    }

    // Unit Test for Equation Solving Functions
    @Test
    public void testSolveSimpleEquation1() {
        assertEquals(2.0, SolveSimpleEquation.solveSimpleEquation("2,1,5"), 0.001);
    }

    @Test
    public void testSolveSimpleEquation2() {
        assertEquals(Double.NaN, SolveSimpleEquation.solveSimpleEquation("0,1,5"), 0.001);
    }

    @Test
    public void testSolveQuadraticEquation1() {
        assertEquals(Double.NaN, Solvequadraticequation.solveQuadraticEquation("2,2,1"), 0.001);
    }

    @Test
    public void testSolveQuadraticEquation2() {
        assertEquals(5.0, Solvequadraticequation.solveQuadraticEquation("1,-7,10"), 0.001);
    }

    @Test
    public void testSolveQuadraticEquation3() {
        assertEquals(Double.NaN, Solvequadraticequation.solveQuadraticEquation("0,-7,10"), 0.001);
    }

    @Test
    public void testSolveQuadraticEquationWithComplexRoots() {
        assertTrue(Double.isNaN(Solvequadraticequation.solveQuadraticEquation("2,0,1")));
    }

    @Test
    public void process_power_rule_test(){
        assertEquals("9.0x^2.0+8.0x^1.0+5.0x^0.0+0", Process_power_rule.process_power_rule("3x^3+4x^2+5x+4"));
    }

    @Test
    public void process_power_rule_test1(){
        assertEquals("Invalid input", Process_power_rule.process_power_rule("3xxx"));
    }

    @Test
    public void process_product_rule_test(){
        assertEquals("(3x^3+4x^1)*(8.0x^3.0+10.0x^1.0)+(2x^4+5x^2)*(9.0x^2.0+4.0x^0.0)", Process_product_rule.process_product_rule("(2x^4+5x^2)*(3x^3+4x^1)"));
    }

    @Test
    public void process_product_rule_test1(){
        assertEquals("Invalid input", Process_product_rule.process_product_rule("(2x^4+5x^2xxx)"));
    }

    @Test
    public void process_chain_rule_test(){
        assertEquals("(3.0(3x^2+5x^1)^2.0)*(6.0x^1.0+5.0x^0.0)", Process_chain_rule.process_chain_rule("(3x^2+5x^1)^3"));
    }

    @Test
    public void process_chain_rule_test1() {
        assertEquals("Invalid input", Process_chain_rule.process_chain_rule("3x^2+5x^1"));
    }

    @Test
    public void process_log_rule_test(){
        assertEquals("3^xln(3)", Process_log_rule.process_log_rule("3^x"));
    }

    @Test
    public void process_log_rule_test1(){
        assertEquals("Invalid input", Process_log_rule.process_log_rule("3"));
    }

    @Test
    public void MIA(){
        assertEquals("9.0x^2.0+8.0x^1.0+5.0x^0.0+0", MIA.MIA("3x^3+4x^2+5x+4"));
    }

    @Test
    public void product_rule_calc(){
        assertEquals("(3x^3+4x^1)*(8.0x^3.0+10.0x^1.0)+(2x^4+5x^2)*(9.0x^2.0+4.0x^0.0)", Main.product_rule_calc("(2x^4+5x^2)*(3x^3+4x^1)"));
    }

    @Test
    public void log_rule_calc(){
        assertEquals("3^xln(3)", Main.log_rule_calc("3^x"));
    }


}