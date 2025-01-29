package com.calculator.projectcalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.projectcalculator.model.CalculationRequest;
import com.calculator.projectcalculator.service.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
@Autowired
    private CalculatorService calculatorService;

    @PostMapping("/add")
    public double add(@RequestBody CalculationRequest request) {
        return calculatorService.add(request.getNumber1(), request.getNumber2());
    }

    @PostMapping("/subtract")
    public double subtract(@RequestBody CalculationRequest request) {
        return calculatorService.subtract(request.getNumber1(), request.getNumber2());
    }

    @PostMapping("/multiply")
    public double multiply(@RequestBody CalculationRequest request) {
        return calculatorService.multiply(request.getNumber1(), request.getNumber2());
    }

    @PostMapping("/divide")
    public double divide(@RequestBody CalculationRequest request) {
        return calculatorService.divide(request.getNumber1(), request.getNumber2());
    }

    @PostMapping("/modulus")
    public double modulus(@RequestBody CalculationRequest request) {
        return calculatorService.modulus(request.getNumber1(), request.getNumber2());
    }
}
