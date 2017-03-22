/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.metier.Labo;
import modele.metier.Secteur;

/**
 *
 * @author Dimitri
 */
public class DaoLabo {

    public static List<Labo> selectAll() throws SQLException {
        List<Labo> lesLabo = new ArrayList<Labo>();
        Labo unLabo = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();

        //Requête
        String requete = "SELECT * FROM LABO";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String codeLabo = rs.getString("LAB_CODE");
            String nomLabo = rs.getString("LAB_NOM");
            String chefVenteLabo = rs.getString("LAB_CHEFVENTE");
            unLabo = new Labo(codeLabo, nomLabo, chefVenteLabo);
            lesLabo.add(unLabo);
        }
        return lesLabo;
    }

    public static Labo selectOne(String codeLabo) throws SQLException {
        Labo unLabo = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM LABO WHERE LAB_CODE= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, codeLabo);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String codeLab = rs.getString("LAB_CODE");
            String nomLab = rs.getString("LAB_NOM");
            unLabo = new Labo(codeLab, nomLab);
        }
        return unLabo;

    }

}
