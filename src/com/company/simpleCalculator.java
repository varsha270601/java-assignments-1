package com.company;

import java.util.Scanner;

   public class simpleCalculator {
       public static void main(String[] args) {
           double a, b, output;
           char operator;
           Scanner scanner = new Scanner(System.in);
           System.out.println("enter first number");
           a = scanner.nextDouble();
           System.out.println("enter second number");
           b = scanner.nextDouble();
           System.out.println("enter an expression:");
           operator = scanner.next().charAt(0);
           switch (operator) {
               case '+':
                   output = a + b;
                   break;
               case '-':
                   output = a - b;
                   break;
               case '*':
                   output = a * b;
                   break;
               case '/':
                   output = a / b;
                   break;
               default:
                   System.out.println("invalid operator:");
                   return;
           }
           System.out.println(a + " " + operator + " " + b + ":" + output);
       }
   }


