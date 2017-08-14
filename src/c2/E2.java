/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2;

import java.util.*;

/**
 *
 * @author Andrea
 */
public class E2 {

    public static int[] Calcularvalor(int[] renta, int[] patrimonio, int[] numCred, int cant) {
        int rent;
        rent = 0;
        int pagar[];
        pagar = new int[cant];
        for (int i = 0; i < cant; i = i + 1) {
            if (renta[i] <= 25000) {
                rent = 1;
            }
            if (renta[i] > 25000 && renta[i] <= 30000) {
                rent = 2;
            }
            if (renta[i] > 30000) {
                rent = 3;
            }
            int patr;
            patr = 0;
            if (patrimonio[i] <= 100000) {
                patr = 1;
            }
            if (patrimonio[i] > 100000 && patrimonio[i] <= 150000) {
                patr = 2;
            }
            if (patrimonio[i] > 150000) {
                patr = 3;
            }
            int vcred[];
            vcred = new int[10];
            if (rent < patr) {
                if (rent == 1) {
                    vcred[i] = 130;
                }
                if (rent == 2) {
                    vcred[i] = 200;
                }
                if (rent == 3) {
                    vcred[i] = 280;
                }
                if (patr <= rent) {
                    if (patr == 1) {
                        vcred[i] = 130;
                    }
                    if (patr == 2) {
                        vcred[i] = 200;
                    }
                    if (patr == 3) {
                        vcred[i] = 280;
                    }
                }
            }

            pagar[i] = numCred[i] * vcred[i];
        }
        return pagar;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner flujoEnt = new Scanner(System.in);
        // variables
        int numEst;
        System.out.println("Ingrese el numero de estudiantes que ingresara");
        numEst = flujoEnt.nextInt();

        int codigo[];
        codigo = new int[numEst];
        int renta[];
        renta = new int[numEst];
        int patrimonio[];
        patrimonio = new int[numEst];
        int credito[];
        credito = new int[numEst];
        //pedir datos 
        int vPagar[];
        vPagar = new int[numEst];
        int suma;
        suma = 0;
        for (int i = 0; i < numEst; i = i + 1) {

            System.out.println("Ingrese el codigo del estudiante");
            codigo[i] = flujoEnt.nextInt();
            System.out.println("Ingres la renta liquida del estudiante");
            renta[i] = flujoEnt.nextInt();
            System.out.println("Ingres el patrimonio del estudiante");
            patrimonio[i] = flujoEnt.nextInt();
            System.out.println("Ingres el numero de creditos a inscribir del estudiante");
            credito[i] = flujoEnt.nextInt();
            vPagar = Calcularvalor(renta, patrimonio, credito, numEst);
            System.out.println(codigo[i]+ "   Debe pagar : " +vPagar[i]);
            suma = suma + i;

        }
                    System.out.println("El total recaudado es : " + suma);

    }
}
