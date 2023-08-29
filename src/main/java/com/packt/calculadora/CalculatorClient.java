/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packt.calculadora;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            Calculadora calculator = (Calculadora) registry.lookup("Calculator");
            
            
            int a = 10;
            int b = 5;

            int result = calculator.add(a, b);
            System.out.println(a + " + " + b + " = " + result);

            result = calculator.subtract(a, b);
            System.out.println(a + " - " + b + " = " + result);

            result = calculator.multiply(a, b);
            System.out.println(a + " * " + b + " = " + result);

            result = calculator.divide(a, b);
            System.out.println(a + " / " + b + " = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
