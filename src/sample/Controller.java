package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label output;
    private double num1;
    private double num2;
    private String operat;
    private boolean value2 = true;
    private boolean num3 = true;
    public void num(ActionEvent ae)
    {
        if(num3)
        {
            output.setText("");
            num3 = false;
        }
        String value = ((Button)ae.getSource()).getText();
        output.setText(output.getText()+value);
    }
    public void oper(ActionEvent ae)
    {
        if(value2) {
            output.setText(output.getText() + " ");
            String value = ((Button) ae.getSource()).getText();
            output.setText(output.getText() + value + " ");
            value2 = false;
        }
    }
    public void equal(ActionEvent ae)
    {

            String str = new String(output.getText());
            String arr1[] = str.split(" ", 3);
            num1 = Double.parseDouble(arr1[0]);
            operat = arr1[1];
            num2 = Double.parseDouble(arr1[2]);

        switch(operat)
        {
            case "+":
                output.setText(String.valueOf(num1+num2));
                value2 = true;
                num3 = true;
                break;

            case "-":
                output.setText(String.valueOf(num1-num2));
                value2 = true;
                num3 = true;
                break;
            case "*":
                output.setText(String.valueOf(num1*num2));
                value2 = true;
                num3 = true;
                break;
            case "/":
                output.setText(String.valueOf(num1/num2));
                value2 = true;
                num3 = true;
                break;
            default:
                output.setText(output.getText());
                    break;

        }
    }
}
