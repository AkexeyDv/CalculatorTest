package com.pro.sky.Calculator;

import com.pro.sky.exeption.ZeroDivideError;
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
    public float divide(int num1, int num2){
        if (num2==0){
            throw new ZeroDivideError("Деление на ноль!");
        }
        return (float) num1/num2;
    }
    public String hello(){
        return "Добро пожаловать в калькулятор!";
    }
}
//\ No newline at end of file
