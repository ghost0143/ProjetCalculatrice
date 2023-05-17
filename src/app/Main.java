/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import controller.CalculatorController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.CalculatorModel;
import view.CalculatorView;

/**
 *
 * @author ayida
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView(model);
        CalculatorController controller = new CalculatorController(model, view);
        
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
