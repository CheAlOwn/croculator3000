package com.example.unicalculator.controllers;

import com.example.unicalculator.entities.BasicOperation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

    @FXML
    private Label output;

    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;

    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button divide;
    @FXML
    private Button multiply;
    @FXML
    private Button equals;
    @FXML
    private Button reset;
    @FXML
    private Button backslash;

    private boolean enterNumber;
    private double lastNumber = 0;
    private double currentNumber;
    private BasicOperation currentOperation;

    public void initialize() {
        zero.setOnAction(e -> onPressNumber(0));
        one.setOnAction(e -> onPressNumber(1));
        two.setOnAction(e -> onPressNumber(2));
        three.setOnAction(e -> onPressNumber(3));
        four.setOnAction(e -> onPressNumber(4));
        five.setOnAction(e -> onPressNumber(5));
        six.setOnAction(e -> onPressNumber(6));
        seven.setOnAction(e -> onPressNumber(7));
        eight.setOnAction(e -> onPressNumber(8));
        nine.setOnAction(e -> onPressNumber(9));

        reset.setOnAction(e -> onPressReset());
        equals.setOnAction(e -> onPressEquals());
        backslash.setOnAction(e -> onPressBackslash());

        plus.setOnAction(e -> onPressOperation(BasicOperation.PLUS));
        minus.setOnAction(e -> onPressOperation(BasicOperation.MINUS));
        divide.setOnAction(e -> onPressOperation(BasicOperation.DIVIDE));
        multiply.setOnAction(e -> onPressOperation(BasicOperation.MULTIPLY));

    }

    private void onPressNumber(int number) {
        if (enterNumber) {
            currentNumber *= 10;
            currentNumber += number;
        } else {
            lastNumber = currentNumber;
            currentNumber = number;
            enterNumber = true;
        }
        output.setText(String.valueOf(currentNumber));
        System.out.println("pressed: " + number);
        System.out.println("mem: " + lastNumber + " " + currentNumber);
    }

    public void onPressOperation(BasicOperation operation) {
        System.out.println("you pressed " + operation.name());
        if (enterNumber) {
            onPressEquals();
        }
        currentOperation = operation;
        enterNumber = false;

    }

    private void onPressReset() {
        output.setText("0");
        currentNumber = 0;
        lastNumber = 0;
    }

    private void onPressEquals() {
        System.out.println(lastNumber + " " + currentOperation.name() + " " + currentNumber + " equals " + currentOperation.execute(lastNumber, currentNumber));
        lastNumber = currentOperation.execute(lastNumber, currentNumber);
        output.setText(String.valueOf(lastNumber));
    }

    private void onPressBackslash() {
        if (currentNumber / 10 * 10 == currentNumber) {
            currentNumber /= 10;
        } else {
            currentNumber *= 10;
        }
    }
}

