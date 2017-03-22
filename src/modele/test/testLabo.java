/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.metier;

import modele.metier.Labo;

/**
 *
 * @author btssio
 */
public class testLabo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Labo Lab, Lab1, Lab2;
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        Lab = new Labo("code", "nom", "chefvente");
        System.out.println(Lab);
        System.out.println("\nTest n°2 : mutateurs");
        Lab.setCodeLabo("1");
        Lab.setNomLabo("nom");
        Lab.setChefVenteLabo("chefvente");        
        System.out.println(Lab);
        Lab1 = new Labo("1", null, null);
        System.out.println(Lab1.equals(Lab));
        Lab2 = new Labo("2", null, null);
        System.out.println(Lab1.equals(Lab2));
        
    }
    
}
