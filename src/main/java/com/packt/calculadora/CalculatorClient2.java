/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.packt.calculadora;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author lpana
 */
public class CalculatorClient2 {
    public static void main(String[] args) {
        String num1=JOptionPane.showInputDialog("Ingrese un numero 1:");
            int a = Integer.parseInt(num1);
            
            String num2=JOptionPane.showInputDialog("Ingrese un numero 2:");
            int b = Integer.parseInt(num2);
    try{
     Registry registry = LocateRegistry.getRegistry("localhost");
     Calculadora calculator = (Calculadora) registry.lookup("Calculator");
 

            int result = calculator.add(a, b);
            System.out.println(a + " + " + b + " = " + result);

            result = calculator.subtract(a, b);
            System.out.println(a + " - " + b + " = " + result);

            result = calculator.multiply(a, b);
            System.out.println(a + " * " + b + " = " + result);

            result = calculator.divide(a, b);
            System.out.println(a + " / " + b + " = " + result);
    
        }catch (Exception e){
         e.printStackTrace();
    
    }
    
    }
}
