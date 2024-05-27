package com.pro.sky.Calculator;

import com.pro.sky.exeption.ZeroDivideError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ServiceCalculatorTest {
    public ServiceCalculator out = new ServiceCalculator();
    final int NUM1 = -8;
    final int NUM2 = 20;
    final int ZERO = 0;


    @MethodSource("createValueForReturnCalculate")
    @ParameterizedTest
    public void returnCalculateSumm1(int num1, int num2) {
        Assertions.assertEquals((long) num1 + num2, out.plus(num1, num2));
    }

    public static Stream<Arguments> createValueForReturnCalculate() {
        return Stream.of(
                Arguments.of(Integer.MIN_VALUE, -2),
                Arguments.of(Integer.MIN_VALUE, 2),
                Arguments.of(-25, -20),
                Arguments.of(-12, 12),
                Arguments.of(12, -12),
                Arguments.of(-10, 6),
                Arguments.of(6, -10),
                Arguments.of(0, 0),
                Arguments.of(0, 24),
                Arguments.of(2, 8),
                Arguments.of(Integer.MAX_VALUE, 5),
                Arguments.of(Integer.MAX_VALUE, -5));
    }


    @MethodSource("createValueForReturnCalculate")
    @ParameterizedTest
    public void returnCalculateMinus(int num1, int num2) {
        Assertions.assertEquals((long) num1 - num2, out.minus(num1, num2));

    }

    @MethodSource("createValueForReturnCalculate")
    @ParameterizedTest
    public void returnCalculateMultiply(int num1, int num2) {
        Assertions.assertEquals((long) num1 - num2, out.multiply(num1, num2));
    }

    @MethodSource("createValueForReturnCalculate")
    @ParameterizedTest
    public void returnCalculateDivide(int num1, int num2) {
        Assertions.assertEquals((float) num1/num2, out.divide(num1, num2));
    }

    @Test
    public void divizeByZero() {
        Assertions.assertThrows(ZeroDivideError.class,()->out.divide(5,0));

    }
}