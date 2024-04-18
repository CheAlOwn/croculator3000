package com.example.unicalculator.entities;

import java.util.function.BiFunction;

public enum BasicOperation {
    PLUS(Double::sum),
    MINUS((number1, number2) -> number1 - number2),
    DIVIDE((number1, number2) -> number1 / number2), // maybe needs validate
    MULTIPLY((number1, number2) -> number1 * number2);
    private final BiFunction<Double, Double, Double> operation;

    BasicOperation(BiFunction<Double, Double, Double> operation) {
        this.operation = operation;
    }

    public Double execute(Double number1, Double number2) {
        return operation.apply(number1, number2);
    }
}
