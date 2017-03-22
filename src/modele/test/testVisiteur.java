/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.test;

import modele.metier.Visiteur;
import java.util.Date;
import modele.metier.Labo;
import modele.metier.Secteur;
/**
 *
 * @author btssio
 */
public class testVisiteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Visiteur vis, vis1, vis2;
        System.out.println("\nTest n°1 : instanciation et accesseurs");
        vis = new Visiteur("matricule", "nom","prenom","adresse","codpost","ville",new Date(21,11,11),new Secteur("secteurcode"),new Labo("labcode"));
        System.out.println(vis);
        System.out.println("\nTest n°2 : mutateurs");
        vis.setMatriculeVisiteur("matriculevis");
        vis.setNomVisiteur("lenom");
        vis.setPrenomVisiteur("lenom");
        vis.setAdresseVisiteur("lenom");
        vis.setCpVisiteur("lenom");
        vis.setVilleVisiteur("lenom");
        vis.setDateEmbaucheVisiteur(new Date(21,11,11));
        vis.setSecteur(new Secteur("idlabo"));
        vis.setLabo(new Labo("lenom"));
        System.out.println(vis);
        vis1 = new Visiteur(null,null,null,null,null,null,new Date(21,11,11),new Secteur("idlabo"),new Labo("lenom"));
        System.out.println(vis1.equals(vis));
        vis2 = new Visiteur(null,null,null,null,null,null,new Date(21,11,11),new Secteur("idlabo"),new Labo("lenom"));
        System.out.println(vis1.equals(vis2));
        
        
        
    }
    
}
