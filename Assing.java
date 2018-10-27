/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author LaboratorioFISI
 */
public class Assing {

    /**
     * @param args the command line arguments
     */


    static int tamaño(int alto, int ancho) {
        // Return an expression based on two arguments (variables).
        return alto * ancho;
    }

    public static void main(String[] args) {

        // Assign to the result of computeSize.
        int result = tamaño(10, 3);
        System.out.println(result);
    }
}

