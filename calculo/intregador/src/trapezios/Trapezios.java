/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapezios;

import interfaces.funcao;

/**
 *
 * @author william.pereira
 */
public class Trapezios implements interfaces.integrador{

    @Override
    public double integrar(double qntPassos, double a, double b, funcao funcao) {
        if(qntPassos<=0){
            return 0;
        }else{
            double h = (b-a)/qntPassos;
            double x = a+h;
            double soma = 0;
            
            for(int i=1; i<qntPassos; i++){
                soma = soma+funcao.f(x);
                x = x+h;
            }
            
            double T = h*((funcao.f(a)+funcao.f(b))/2+soma);                   
            return T;
        }
    }
    
}
