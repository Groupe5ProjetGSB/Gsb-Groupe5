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
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class DaoTypePraticien {
    
    public static TypePraticien selectOne(String TYP_CODE) throws SQLException {
    
        TypePraticien unTypePraticien = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM TypePraticien WHERE TYP_CODE= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, TYP_CODE);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String CODE = rs.getString("TYP_CODE");
            
            
            String typ_libelle = rs.getString("TYP_LIBELLE");
            String typ_lieu = rs.getString("TYP_LIEU");
            unTypePraticien = new TypePraticien(CODE,typ_lieu, typ_libelle);
        }
        
        return unTypePraticien;
    }
    
    public static List<TypePraticien> selectAll() throws SQLException {
        List<TypePraticien> lesTypePraticien = new ArrayList<>();
        TypePraticien unTypePraticien;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM TYPE_PRATICIEN ";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String CODE = rs.getString("TYP_CODE");
            String typ_libelle = rs.getString("TYP_LIBELLE");
            String typ_lieu = rs.getString("TYP_LIEU");
            unTypePraticien = new TypePraticien(CODE, typ_libelle,typ_lieu);
            lesTypePraticien.add(unTypePraticien);
        }
        return lesTypePraticien;
    }
    
    public static int insert(TypePraticien unTypePraticien) throws SQLException {
        int nb;
        Jdbc jdbc = Jdbc.getInstance();
        String requete;
        ResultSet rs;
        PreparedStatement pstmt;
        requete = "INSERT INTO TYPE_PRATICIEN (TYP_CODE, TYP_LIBELLE, TYP_LIEU) VALUES (?, ?, ?)";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, unTypePraticien.getTyp_code());
        pstmt.setString(2, unTypePraticien.getTyp_libelle());
        pstmt.setString(3, unTypePraticien.getTyp_lieu());
        nb = pstmt.executeUpdate();
        return nb;
    }
    
    public static int update(TypePraticien unTypePraticien) throws SQLException {
        int nb;
        Jdbc jdbc = Jdbc.getInstance();
        String requete;
        ResultSet rs;
        PreparedStatement pstmt;
        requete = "INSERT INTO TYPE_PRATICIEN (TYP_CODE, TYP_LIBELLE, TYP_LIEU) VALUES (?, ?, ?)";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, unTypePraticien.getTyp_code());
        pstmt.setString(2, unTypePraticien.getTyp_libelle());
        pstmt.setString(3, unTypePraticien.getTyp_lieu());
        nb = pstmt.executeUpdate();
        return nb;
    }
    
    public static int delete(String code_TypPraticien) throws SQLException {
        int nb;
        Jdbc jdbc = Jdbc.getInstance();
        String requete;
        ResultSet rs;
        PreparedStatement pstmt;
        requete = "DELETE  FROM TYPE_PRATICIEN WHERE ID = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, code_TypPraticien);
        nb = pstmt.executeUpdate();
        return nb;
    }
    
}
