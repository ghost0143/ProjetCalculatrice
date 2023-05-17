/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Observable;

/**
 *
 * @author ayida
 */
public class CalculatorModel extends Observable{
    private double number1;
    private double number2;
    private double result;

    public void setNumber1(double number1) {
        this.number1 = number1;
        notifyObservers();
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
        notifyObservers();
    }
    
    public void add(){
        result = number1 + number2;
        notifyObservers();
    }
    
    public void subtract(){
        result = number1 - number2;
        notifyObservers();
    }
    
    public void multiply(){
        result = number1 * number2;
        notifyObservers();
    }
    
    public void divide(){
        if (number2 != 0){
            result = number1 + number2;
            notifyObservers();
        }
    }

    public double getResult() {
        return result;
    }
    
    
    
    
}
