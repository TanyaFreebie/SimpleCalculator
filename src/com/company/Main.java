package com.company;

public class Main {

    public static void main(String[] args) {
        //Number Declaration
        int firstNumber;
        int secondNumber;
        int answer;
        //NUmber Initialized
        firstNumber = 5;
        secondNumber = 7;
        answer = 0;
        //Math Operator
        String operator ="+";

        if(operator.equals("+")){
            answer = firstNumber + secondNumber;
        } else if(operator.equals("-")){
            answer = firstNumber - secondNumber;
        }//assigment for x and /

        System.out.println(answer);
    }
}
