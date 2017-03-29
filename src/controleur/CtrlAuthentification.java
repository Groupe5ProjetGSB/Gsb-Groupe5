/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.text.ParseException;
import modele.dao.DaoAuthentification;
import vue.VueAuthentification;

/**
 *
 * @author Dimitri
 */
public class CtrlAuthentification implements WindowListener, ActionListener {

    VueAuthentification vue;
    CtrlPrincipal ctrlPrincipal;

    public CtrlAuthentification(VueAuthentification vue, CtrlPrincipal ctrlPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = ctrlPrincipal;
        vue.getjButtonOkIdentification().addActionListener(this);

    }

    public final boolean authentification() throws SQLException, ParseException {
        String login = vue.getjTextFieldLogin().toString();
        String password = vue.getjTextFieldMotDePasse().toString();
        boolean ok = false;

        

        ok = DaoAuthentification.Login(login, password);

        return ok;

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
