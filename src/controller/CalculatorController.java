/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.CalculatorModel;
import view.CalculatorView;

/**
 *
 * @author ayida
 */
public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        
        view.getCalculateButton().setOnAction(new CalculateButtonHandler());

    }

    private class CalculateButtonHandler implements EventHandler<ActionEvent> {

        

        @Override
        public void handle(ActionEvent event) {
            double number1 = Double.parseDouble(view.getNumber1TextField().getText());
            double number2 = Double.parseDouble(view.getNumber2TextField().getText());
            String operation = view.getOperationComboBox().getValue();
            
            model.setNumber1(number1);
            model.setNumber2(number2);
            
            switch (operation) {
            case "Addition":
                model.add();
                break;
            case "Substraction":
                model.subtract();
                break;
            case "Multiplication":
                model.multiply();
                break;
            case "Division":
                model.divide();
                break;
        }
            view.getResultLabel().setText(Double.toString(model.getResult()));
        }
    }
    
    
}
