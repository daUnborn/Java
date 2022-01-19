package com.codebase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalc extends JFrame{
    private JPanel mainPanel;
    private JTextField num_result;
    private JButton btn_7;
    private JButton btn_8;
    private JButton btn_9;
    private JButton btn_multiply;
    private JButton btn_subtract;
    private JButton btn_6;
    private JButton btn_5;
    private JButton btn_4;
    private JButton btn_add;
    private JButton btn_3;
    private JButton btn_2;
    private JButton btn_1;
    private JButton btn_equals;
    private JButton btn_clear;
    private JButton btn_divide;
    private JButton btn_0;

    private char operator;
    private int num1;
    private int num2;
    private double answer;

    public JavaCalc(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        btn_0.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_0.getText());
        });

        btn_1.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_1.getText());
        });


        btn_2.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_2.getText());
        });

        btn_3.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_3.getText());
        });


        btn_4.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_4.getText());
        });

        btn_5.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_5.getText());
        });


        btn_6.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_6.getText());
        });

        btn_7.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_7.getText());
        });


        btn_8.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_8.getText());
        });

        btn_9.addActionListener(e -> {
            //grab the text from the button
            num_result.setText(num_result.getText() + btn_9.getText());
        });

        btn_clear.addActionListener(e -> num_result.setText(""));

        btn_multiply.addActionListener(e -> {
            operator = btn_multiply.getText().charAt(0);
            num1 = Integer.parseInt(num_result.getText());
            num_result.setText("");
        });

        btn_equals.addActionListener(e -> {

            num2 = Integer.parseInt(num_result.getText());
            String final_result = Double.toString(calculate(num1, num2));
            num_result.setText(final_result);
        });
        btn_subtract.addActionListener(e -> {
            operator = btn_subtract.getText().charAt(0);
            num1 = Integer.parseInt(num_result.getText());
            num_result.setText("");
        });
        btn_add.addActionListener(e -> {
            operator = btn_add.getText().charAt(0);
            num1 = Integer.parseInt(num_result.getText());
            num_result.setText("");
        });
        btn_divide.addActionListener(e -> {
            operator = btn_divide.getText().charAt(0);
            num1 = Integer.parseInt(num_result.getText());
            num_result.setText("");
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public double calculate(int number1, int number2){
        if(operator == '*') {
            answer = number1 * number2;
        } else if (operator == '+'){
            answer = number1 + number2;
        } else if (operator == '-'){
            answer = number1 - number2;
        } else {
            answer = number1 / number2;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        JFrame frame = new JavaCalc("My Java Calculator");
        frame.setVisible(true);
    }
}
