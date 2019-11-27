/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.math.*;

/**
 *
 * @author william.pereira
 */
public class Func implements interfaces.funcao{

    @Override
    public double f(double x) {
        double resultado;
        resultado = x/(1+x*x);
        return resultado;
    }
    
}
