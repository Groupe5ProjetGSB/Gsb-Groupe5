/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import modele.dao.DaoAuthentification;
import modele.dao.DaoSecteur;
import modele.dao.Jdbc;
import modele.metier.Authentification;
import modele.metier.Secteur;

/**
 *
 * @author Dimitri
 */
public class DaoAuthentificationTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {
        java.sql.Connection cnx = null;

        test0_Connexion();
        System.out.println("Test0 effectué : connexion\n");
        test2_authentification();
        System.out.println("Test2 effectué : Authentification");
        if (cnx != null) {
            cnx.close();
        }

    }

    public static void test2_authentification() throws SQLException, ParseException {
        boolean ok = false;
        String login = "Andre";
        String password = "26-aug-1991";

        ok = DaoAuthentification.Login(login, password);

        if (ok) {
            System.out.println("Il existe ! ");
        } else {
            System.out.println("Introuvable ! ");
        }
    }

    public static void test0_Connexion() throws ClassNotFoundException, SQLException {
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "gsb@//localhost:1521/xe", "", "gsb", "gsb");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
    }

}
