package com.pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class ControllerCalculator {
    private final InterfaceCalculator calculator;

    public ControllerCalculator(InterfaceCalculator calculator) {
        this.calculator = calculator;
    }
    @GetMapping
    public String hello(){
        return calculator.hello();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return num1+" + "+num2+" = "+calculator.plus(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return num1+" - "+num2+" = "+calculator.minus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return num1+" * "+num2+" = "+calculator.multiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int num1,@RequestParam("num2") int num2){
        return num1+" / "+num2+" = "+calculator.divide(num1,num2);
    }

}
//\ No newline at end of file
