package com.pro.sky.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class CalculatorApplicationTests {
    public ServiceCalculator out = new ServiceCalculator();

    @Test
    public void divizeByZero() {
        int num1 = 6;
        int num2 = 1;
        Assertions.assertDoesNotThrow(() -> out.minus(num1, num2));
    }

    @Test
    public void resultValue() {
        int num1 = -8;
        int num2 = 20;
        Assertions.assertEquals((num1 + num2), out.plus(num1, num2));
        Assertions.assertEquals((num1 - num2), out.minus(num1, num2));
        Assertions.assertEquals((num1 * num2), out.multiply(num1, num2));
        Assertions.assertEquals((num1 / num2), out.divide(num1, num2));
    }


    @Test
    public void num() {
        Assertions.assertTrue(true);
    }

}
