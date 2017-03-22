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
import modele.metier.Praticien;
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class DaoPraticien {
   
    public static Praticien selectOne(int PRA_NUM) throws SQLException {
    
        Praticien unPraticien = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM Praticien WHERE PRA_NUM= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setInt(1, PRA_NUM);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            int pra_num = rs.getInt("PRA_NUM");
            String pra_nom = rs.getString("PRA_NOM");
            String pra_prenom = rs.getString("PRA_PRENOM");
            String pra_adresse = rs.getString("PRA_ADRESSE");
            String pra_cp = rs.getString("PRA_CP");
            String pra_ville = rs.getString("PRA_VILLE");
            float pra_coef = rs.getFloat("PRA_COEFNOTORIETE");
            String codTypPraticien = rs.getString("TYP_CODE");
            //unPraticien = new Praticien(pra_num,pra_nom, pra_prenom,pra_adresse,pra_cp,pra_ville,pra_coef,codTypPraticien);
        }
        
        return unPraticien;
    }
    
//    public static List<TypePraticien> selectAll() throws SQLException {
//        List<TypePraticien> lesTypePraticien = new ArrayList<>();
//        TypePraticien unTypePraticien;
//        ResultSet rs;
//        PreparedStatement pstmt;
//        Jdbc jdbc = Jdbc.getInstance();
//        // préparer la requête
//        String requete = "SELECT * FROM TYPE_PRATICIEN ";
//        pstmt = jdbc.getConnexion().prepareStatement(requete);
//        rs = pstmt.executeQuery();
//        while (rs.next()) {
//            String CODE = rs.getString("TYP_CODE");
//            String typ_libelle = rs.getString("TYP_LIBELLE");
//            String typ_lieu = rs.getString("TYP_LIEU");
//            unTypePraticien = new TypePraticien(CODE, typ_libelle,typ_lieu);
//            lesTypePraticien.add(unTypePraticien);
//        }
//        return lesTypePraticien;
//    }
//    
//    public static int insert(TypePraticien unTypePraticien) throws SQLException {
//        int nb;
//        Jdbc jdbc = Jdbc.getInstance();
//        String requete;
//        ResultSet rs;
//        PreparedStatement pstmt;
//        requete = "INSERT INTO TYPE_PRATICIEN (TYP_CODE, TYP_LIBELLE, TYP_LIEU) VALUES (?, ?, ?)";
//        pstmt = jdbc.getConnexion().prepareStatement(requete);
//        pstmt.setString(1, unTypePraticien.getTyp_code());
//        pstmt.setString(2, unTypePraticien.getTyp_libelle());
//        pstmt.setString(3, unTypePraticien.getTyp_lieu());
//        nb = pstmt.executeUpdate();
//        return nb;
//    }
//    
//    public static int update(TypePraticien unTypePraticien) throws SQLException {
//        int nb;
//        Jdbc jdbc = Jdbc.getInstance();
//        String requete;
//        ResultSet rs;
//        PreparedStatement pstmt;
//        requete = "INSERT INTO TYPE_PRATICIEN (TYP_CODE, TYP_LIBELLE, TYP_LIEU) VALUES (?, ?, ?)";
//        pstmt = jdbc.getConnexion().prepareStatement(requete);
//        pstmt.setString(1, unTypePraticien.getTyp_code());
//        pstmt.setString(2, unTypePraticien.getTyp_libelle());
//        pstmt.setString(3, unTypePraticien.getTyp_lieu());
//        nb = pstmt.executeUpdate();
//        return nb;
//    }
//    
//    public static int delete(String code_TypPraticien) throws SQLException {
//        int nb;
//        Jdbc jdbc = Jdbc.getInstance();
//        String requete;
//        ResultSet rs;
//        PreparedStatement pstmt;
//        requete = "DELETE  FROM TYPE_PRATICIEN WHERE ID = ?";
//        pstmt = jdbc.getConnexion().prepareStatement(requete);
//        pstmt.setString(1, code_TypPraticien);
//        nb = pstmt.executeUpdate();
//        return nb;
//    }
//    
    
}
