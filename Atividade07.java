/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade07;

import java.util.Scanner;

/**
 *
 * @author 322121746
 */
public class Atividade07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        double lado,area;
        System.out.println("Digite o lado do quadrado");
        lado = leia.nextDouble();
        area = (lado*lado);
        System.out.println("A area do quadrado vale " + area);
        System.out.println("O dobro da area vale ");
        System.out.println(area*2);
        
    }
    
}
