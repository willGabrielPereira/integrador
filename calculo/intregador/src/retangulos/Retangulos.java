/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulos;

/**
 *
 * @author william.pereira
 */
public class Retangulos implements interfaces.integrador{

    @Override
    public double integrar(double qntPassos, double a, double b, interfaces.funcao funcao) {
        double h = (b-a)/qntPassos;
        double x = (a+(a+h))/2;
        double soma = 0;
        
        for(int i=0; i<qntPassos; i++){
            soma = soma+funcao.f(x);
            x = x+h;
        }
        
        double r = h*soma;
        return r;
    }
    
}
