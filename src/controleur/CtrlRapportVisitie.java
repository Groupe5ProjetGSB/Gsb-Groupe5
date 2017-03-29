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
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.dao.DaoLabo;
import modele.dao.DaoPracticien;
import modele.dao.DaoSecteur;
import modele.dao.DaoVisiteur;
import modele.metier.Labo;
import modele.metier.Practicien;
import modele.metier.Secteur;
import modele.metier.Visiteur;
import vue.VueCompteRendu;
import vue.VueVisiteur;

/**
 *
 * @author Dimitri
 */
public class CtrlRapportVisitie implements ActionListener, WindowListener {

    VueCompteRendu vue;
    CtrlPrincipal ctrlPrincipal;

    public CtrlRapportVisitie(VueCompteRendu vue, CtrlPrincipal ctrlPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = ctrlPrincipal;
        vue.getjButtonFermer().addActionListener(this);

        afficherLesPracticien();

    }

    public final void afficherLesPracticien() {
        List<Practicien> lesPraticien = null;
        try {
            lesPraticien = DaoPracticien.selectAll();

            for (Practicien practicien : lesPraticien) {
                getVue().getjComboBoxPraticien().addItem(practicien);
            }
        } catch (Exception e) {
        }

    }

    public VueCompteRendu getVue() {
        return vue;
    }

    public void setVue(VueCompteRendu vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vue.getjButtonFermer())) {
            vue.setVisible(false);
            ctrlPrincipal.afficherMenuPrincipal();
        }
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

}
