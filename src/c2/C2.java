/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2;

import java.util.*;

/**
 *
 * @author AGoMur
 * @version 1
 * @since 9-8-17
 */
public class C2 {

    /**
     * @param Extra1 = horas al doble Extra2 = horas al triple CostoE1 = costo
     * horas al doble CostoE2 = costo horas al triple
     *
     * @return
     */
    public static double CalcularSalario(int horas, double precioH) {
        double extra1 = 0;
        double extra2 = 0;
        if (horas > 40) {            
            extra1 = horas - 40;
            horas = 40;
        }
        if (extra1 > 8) {            
            extra2 = extra1 - 8;
            extra1 = 8;
        }
        double costoE1 = (extra1 * precioH * 2);
        double costoE2 = (extra2 * precioH * 3);
        double salario = (horas * precioH);
        double total;
        total = (salario + costoE1 + costoE2);
        return 
total;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner flujoEnt = new Scanner(System.in);
        // variables
        String nombre = null;
        int numHoras = 0;
        double valorHora = 0;
        double valorPagar = 0;

        //pedir datos 
        System.out.println("Ingrese el nombre del trabajador");
        nombre = flujoEnt.next();
        System.out.println("Ingrese el numero de horas trabajadas");
        numHoras = flujoEnt.nextInt();
        System.out.println("Ingres el salario por hora");
        valorHora = flujoEnt.nextDouble();
        
        valorPagar = CalcularSalario(numHoras, valorHora);

            System.out.println("El salario a pagar es: " + valorPagar);

    }
}
