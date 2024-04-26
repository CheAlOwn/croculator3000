package com.example.unicalculator.controllers;

import com.example.unicalculator.entities.Function;
import com.example.unicalculator.entities.Operation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class MainPageController {

    @FXML
    private Button but0;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button but3;

    @FXML
    private Button but4;

    @FXML
    private Button but5;

    @FXML
    private Button but6;

    @FXML
    private Button but7;

    @FXML
    private Button but8;

    @FXML
    private Button but9;

    @FXML
    private GridPane buttonsGroup;

    @FXML
    private Button calcButton;

    @FXML
    private Button categoriesBut;

    @FXML
    private Button clearBut;

    @FXML
    private Button commaBut;

    @FXML
    private AnchorPane contentFrame;

    @FXML
    private Button cosBut;

    @FXML
    private Button convertBut;

    @FXML
    private Button deleteBut;

    @FXML
    private Button divBut;

    @FXML
    private Button plusBut;
    @FXML
    private Button minusBut;

    @FXML
    private Button drBut;

    @FXML
    private Button equalBut;

    @FXML
    private Button expBut;

    @FXML
    private Button historyBut;

    @FXML
    private Button incBut;

    @FXML
    private TextField inputField;

    @FXML
    private AnchorPane inputFrame;

    @FXML
    private Button lgBut;

    @FXML
    private Button lnBut;

    @FXML
    private FlowPane mainBar;

    @FXML
    private AnchorPane mainWindow;

    @FXML
    private Button percentBut;

    @FXML
    private Button powBut;

    @FXML
    private Button rootBut;

    @FXML
    private Button sinBut;

    @FXML
    private Button sndBut;

    @FXML
    private Button tanBut;

    @FXML
    public void initialize() {
        but0.setOnAction((actionEvent) -> inputNumber(0));
        but1.setOnAction((actionEvent) -> inputNumber(1));
        but2.setOnAction((actionEvent) -> inputNumber(2));
        but3.setOnAction((actionEvent) -> inputNumber(3));
        but4.setOnAction((actionEvent) -> inputNumber(4));
        but5.setOnAction((actionEvent) -> inputNumber(5));
        but6.setOnAction((actionEvent) -> inputNumber(6));
        but7.setOnAction((actionEvent) -> inputNumber(7));
        but8.setOnAction((actionEvent) -> inputNumber(8));
        but9.setOnAction((actionEvent) -> inputNumber(9));

        plusBut.setOnAction((actionEvent) -> inputOperation(Operation.PLUS));
        minusBut.setOnAction((actionEvent) -> inputOperation(Operation.MINUS));
        divBut.setOnAction((actionEvent) -> inputOperation(Operation.DIVISION));
        incBut.setOnAction((actionEvent) -> inputOperation(Operation.MULTIPLY));

        sndBut.setOnAction((actionEvent) -> inputFunction(Function.SND));
        drBut.setOnAction((actionEvent) -> inputFunction(Function.DEG));
        sinBut.setOnAction((actionEvent) -> inputFunction(Function.SIN));
        cosBut.setOnAction((actionEvent) -> inputFunction(Function.COS));
        tanBut.setOnAction((actionEvent) -> inputFunction(Function.TAN));
        rootBut.setOnAction((actionEvent) -> inputFunction(Function.ROOT));
        percentBut.setOnAction((actionEvent) -> inputFunction(Function.PERCENT));
        powBut.setOnAction((actionEvent) -> inputFunction(Function.POWER));
        lgBut.setOnAction((actionEvent) -> inputFunction(Function.LG));
        lnBut.setOnAction((actionEvent) -> inputFunction(Function.LN));
        expBut.setOnAction((actionEvent) -> inputFunction(Function.EXP));

        clearBut.setOnAction((actionEvent) -> inputClear());
        deleteBut.setOnAction((actionEvent) -> inputDelete());
        historyBut.setOnAction((actionEvent) -> inputHistory());
        commaBut.setOnAction((actionEvent) -> inputComma());
        equalBut.setOnAction((actionEvent) -> inputEquals());
    }

    private void inputNumber(int number) {
        System.out.println("Input " + number);
    }

    private void inputFunction(Function function) {
        System.out.println("Input " + function.name());
    }

    private void inputOperation(Operation operation) {
        System.out.println("Input " + operation.name());
    }

    private void inputClear() {
        System.out.println("Input Clear");
    }

    private void inputDelete() {
        System.out.println("Input Delete");
    }

    private void inputHistory() {
        System.out.println("Input History");
    }

    private void inputComma() {
        System.out.println("Input Comma");
    }

    private void inputEquals() {
        System.out.println("Input Equals");
    }


}
