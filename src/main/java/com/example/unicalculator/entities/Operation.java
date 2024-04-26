package com.example.unicalculator.entities;

import java.util.function.BiFunction;

public enum Operation {

    PLUS(Double::sum),
    MINUS((num1, num2) -> num1 - num2),
    DIVISION((num1, num2) -> num1 / num2),
    MULTIPLY((num1, num2) -> num1 * num2);

    private final BiFunction<Double, Double, Double> operation;

    Operation(BiFunction<Double, Double, Double> operation) {
        this.operation = operation;
    }

    public Double applyOperation(Double num1, Double num2) {
        return operation.apply(num1, num2);
    }
}
