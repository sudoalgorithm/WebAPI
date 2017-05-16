/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.knrmalhotra;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kunalmalhotra
 */
@WebService(serviceName = "Calculator")
public class Calculator {

    @WebMethod(operationName = "Addition")
    public int add(@WebParam(name = "FirstNum") int num1, @WebParam(name = "SecondNum") int num2){
        return num1 + num2;
    }
    
    @WebMethod(operationName = "Subtraction")
    public int sub(@WebParam(name = "FirstNum") int num1, @WebParam(name = "SecondNum") int num2){
        return num1 - num2;
    }
    
    @WebMethod(operationName = "Multiplication")
    public int mul(@WebParam(name = "FirstNum") int num1, @WebParam(name = "SecondNum") int num2){
        return num1 * num2;
    }
    
    @WebMethod(operationName = "Divide")
    public int div(@WebParam(name = "FirstNum") int num1, @WebParam(name = "SecondNum") int num2){
        return num1 / num2;
    }
}
