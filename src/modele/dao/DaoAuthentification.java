/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import modele.metier.Authentification;
import modele.metier.Secteur;

/**
 *
 * @author Dimitri
 */
public class DaoAuthentification {

    private static Object dateFormat;

    /**
     *
     * @param login
     * @param mdp
     */
    public static boolean Login(String login, String mdp) throws SQLException, ParseException {

        boolean ok = false;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        Date sqlDate = null;

        java.util.Date date = new java.util.Date(mdp);
        sqlDate = new Date(date.getTime());
        java.sql.Date dateFinal = new java.sql.Date(date.getTime());

        //On prépare la requête
        String requete = "SELECT VIS_NOM, VIS_DATEEMBAUCHE FROM VISITEUR WHERE VIS_NOM = ? AND VIS_DATEEMBAUCHE = ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, login);
        pstmt.setDate(2, dateFinal);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            ok = true;
        } else {
            ok = false;
        }
        return ok;
    }

}
