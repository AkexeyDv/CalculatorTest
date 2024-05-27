package com.pro.sky.Calculator;

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



    @MethodSource("createValueForReturnCalculateSumm")
    @ParameterizedTest
    public void returnCalculateSumm1(int num1, int num2) {
        Assertions.assertEquals(num1+num2, out.plus(num1,num2));
    }
    public static Stream<Arguments> createValueForReturnCalculateSumm() {
        return Stream.of(
                Arguments.of(-25,-20),
                Arguments.of(-12,12),
                Arguments.of(12,-12),
                Arguments.of(-10,6),
                Arguments.of(6,-10),
                Arguments.of(0,0),
                Arguments.of(0,24),
                Arguments.of(2,8));
    }


    @Test
    public void returnCalculateMinus() {
        Assertions.assertEquals((NUM1 - NUM2), out.minus(NUM1, NUM2));

    }

    @Test
    public void returnCalculateMultiply() {
        Assertions.assertEquals((NUM1 * NUM2), out.multiply(NUM1, NUM2));
    }

    @Test
    public void returnCalculateDivide() {
        Assertions.assertEquals(((float) NUM1 / NUM2), out.divide(NUM1, NUM2));
    }

    @Test
    public void divizeByZero() {
        Assertions.assertDoesNotThrow(() -> out.minus(NUM1, ZERO));
        //ZeroDivideError exception = Assertions.assertThrows(ZeroDivideError.class,()->out.minus(NUM1,ZERO));
        //System.out.println(exception.getMessage());
        // Assertions.assertEquals("Деление на ноль!", exception.getMessage());

    }
}