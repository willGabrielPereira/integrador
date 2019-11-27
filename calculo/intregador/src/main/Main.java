/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author william.pereira
 */
public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        interfaces.funcao f = new Func();
        String menu = "integração por...\n1 - Retangulos\n2 - Trapézios\n3 - Simpson\n4 - Desligar";

        int opcao;
        double resultado, passos = 0, a = 0, b = 0;

        interfaces.integrador i;

        do {
            System.out.println(menu);
            opcao = Integer.parseInt(scan.nextLine());
            if (opcao != 4) {
                System.out.print("Quantidade de passos: ");
                passos = Integer.parseInt(scan.nextLine());
                System.out.print("Valor de A: ");
                a = Integer.parseInt(scan.nextLine());
                System.out.print("Valor de B: ");
                b = Integer.parseInt(scan.nextLine());
            }
            switch (opcao) {
                case 1:
                    i = new retangulos.Retangulos();
                    resultado = i.integrar(passos, a, b, f);
                    System.out.println("Resultado da integração por Retângulos é: " + resultado + "\n");
                    break;
                case 2:
                    i = new trapezios.Trapezios();
                    resultado = i.integrar(passos, a, b, f);
                    System.out.println("Resultado da integração por Trapézios é: " + resultado + "\n");
                    break;
                case 3:
                    i = new simpson.Simpson();
                    resultado = i.integrar(passos, a, b, f);
                    System.out.println("Resultado da integração pela regra de Simpson é: " + resultado + "\n");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 4);

    }
}
