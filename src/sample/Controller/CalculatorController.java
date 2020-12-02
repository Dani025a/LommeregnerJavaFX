package sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CalculatorController {
    @FXML
    private Label expression;

    public void clearExpression(){
        expression.setText("");
    }

    public void  insertOperator(String operator){
        expression.setText(expression.getText() + " " + operator + " ");
    }

    public void insertNumber(String number){
        expression.setText(expression.getText() + number);
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        Button button = (Button) mouseEvent.getSource();
        String buttonText = button.getText();


        switch (buttonText){
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
            case ",":
                insertNumber(buttonText);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                insertOperator(buttonText);
                break;
            case "Clear":
                clearExpression();
                break;

        }
    }
}
