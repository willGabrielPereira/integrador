/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpson;

import interfaces.funcao;

/**
 *
 * @author william.pereira
 */
public class Simpson implements interfaces.integrador {

    @Override
    public double integrar(double qntPassos, double a, double b, funcao funcao) {
        double h = (b - a) / qntPassos;
        double x = a + h;
        double somaPares = 0;
        double somaImpares = 0;
        
        for(int i=1; i<qntPassos; i++){
            if(i%2 == 0){
                somaPares = somaPares + funcao.f(x);
            }else{
                somaImpares = somaImpares + funcao.f(x);
            }
            x = x+h;
        }
        double S = (h/3) * (funcao.f(a)+funcao.f(b) + 4 * somaImpares + 2 * somaPares);
        return S;
    }

}
