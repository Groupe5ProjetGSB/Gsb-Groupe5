/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.test;

import modele.metier.Secteur;

/**
 *
 * @author btssio
 */
public class testSecteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Secteur sec, sec1, sec2;
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        sec = new Secteur("a", "Saint Sébastien sur Loire");
        System.out.println(sec);
        System.out.println("\nTest n°2 : mutateurs");
        sec.setSec_code("a");
        sec.setSec_libelle("44265");
        
        System.out.println(sec);
        sec1 = new Secteur("a", null);
        System.out.println(sec1.equals(sec));
        sec2 = new Secteur("b", null);
        System.out.println(sec1.equals(sec2));
        
    }
    
}
