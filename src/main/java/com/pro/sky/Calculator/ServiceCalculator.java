package com.pro.sky.Calculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculator implements InterfaceCalculator {
    public int plus(int num1, int num2){
        return num1+num2;
    }

    public int minus(int num1, int num2){
        return num1-num2;
    }

    public int multiply(int num1, int num2){
        return num1*num2;
    }
    public int divide(int num1, int num2){
        if (num2==0){
            throw new RuntimeException("Деление на ноль!");
        }
        return num1/num2;
    }
}
