/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.calculatorservice.service;

/**
 * Interfície calculadora
 * @author Xavier Vergés Berga
 */
public interface ICalculatorService {
    
    public int add(int num1, int num2);
    public int substract(int num1, int num2);
    public int multiply(int num1, int num2);
    public int divide(int num1, int num2);
    
}
