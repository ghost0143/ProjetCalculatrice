/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Observable;
import java.util.Observer;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.CalculatorModel;

/**
 *
 * @author ayida
 */
public class CalculatorView extends GridPane implements Observer{
    private TextField number1TextField;
    private TextField number2TextField; 
    private ComboBox<String> operationComboBox;
    private Label resultLabel;
    private Button calculateButton;
    private CalculatorModel calculatorModel;
    
    public CalculatorView(CalculatorModel model){
        this.calculatorModel = model;
        this.calculatorModel.addObserver(this);
        
        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));
        
        number1TextField = new TextField();
        number1TextField.setPromptText("Number 1");
        number2TextField = new TextField();
        number2TextField.setPromptText("Number 2");
        operationComboBox = new ComboBox<>();
        operationComboBox.getItems().addAll("Addition", "Substraction", "Multiplication", "Division");
        operationComboBox.setValue("Addition");
        resultLabel = new Label();
        calculateButton = new Button("Calculate");
        
        add(new Label("Number 1:"),0 ,0);
        add(number1TextField, 1, 0);
        add(new Label("Number 2:"),0 ,1);
        add(number2TextField, 1, 1);
        add(new Label("Operation"),0, 2);
        add(operationComboBox,1 ,2);
        add(resultLabel, 0, 3, 2, 1);
        add(calculateButton, 0, 4, 2,1);
        
        setAlignment(Pos.CENTER);
        
        calculateButton.setOnAction(e -> calculate());
    }

    public TextField getNumber1TextField() {
        return number1TextField;
    }

    public TextField getNumber2TextField() {
        return number2TextField;
    }

    public ComboBox<String> getOperationComboBox() {
        return operationComboBox;
    }

    public Label getResultLabel() {
        return resultLabel;
    }

    public Button getCalculateButton() {
        return calculateButton;
    }

    
    private void calculate(){
        double number1 = Double.parseDouble(number1TextField.getText());
        double number2 = Double.parseDouble(number2TextField.getText());
        String operation = operationComboBox.getValue();
        
        calculatorModel.setNumber1(number1);
        calculatorModel.setNumber2(number2);
        
        switch (operation) {
            case "Addition":
                calculatorModel.add();
                break;
            case "Substraction":
                calculatorModel.subtract();
                break;
            case "Multiplication":
                calculatorModel.multiply();
                break;
            case "Division":
                calculatorModel.divide();
                break;
        }
        
    }
    

    @Override
    public void update(Observable o, Object arg) {
        resultLabel.setText(Double.toString(calculatorModel.getResult()));
    }
    
}
