/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Windows 8.1
 */
public class VueVisiteur extends javax.swing.JFrame {

    /**
     * Creates new form VueVisiteur
     */
    public VueVisiteur() {
        initComponents();

    }

    public JTextField getjTextFieldLabo() {
        return jTextFieldLabo;
    }

    public JTextField getjTextFieldSecteur() {
        return jTextFieldSecteur;
    }

    public JButton getjButtonFermer() {
        return jButtonFermer;
    }

    public JButton getjButtonPrecedent() {
        return jButtonPrecedent;
    }

    public JButton getjButtonSuivant() {
        return jButtonSuivant;
    }

    public JButton getjButtonChercherVisiteur() {
        return jButtonChercherVisiteur;
    }

    public void setjButtonChercherVisiteur(JButton jButtonChercherVisiteur) {
        this.jButtonChercherVisiteur = jButtonChercherVisiteur;
    }

    public JComboBox getjComboBoxChercher() {
        return jComboBoxChercher;
    }

    public void setjComboBoxChercher(JComboBox jComboBoxChercher) {
        this.jComboBoxChercher = jComboBoxChercher;
    }

    public JLabel getjLabelAdresse() {
        return jLabelAdresse;
    }

    public void setjLabelAdresse(JLabel jLabelAdresse) {
        this.jLabelAdresse = jLabelAdresse;
    }

    public JLabel getjLabelChercher() {
        return jLabelChercher;
    }

    public void setjLabelChercher(JLabel jLabelChercher) {
        this.jLabelChercher = jLabelChercher;
    }

    public JLabel getjLabelLabo() {
        return jLabelLabo;
    }

    public void setjLabelLabo(JLabel jLabelLabo) {
        this.jLabelLabo = jLabelLabo;
    }

    public JLabel getjLabelNom() {
        return jLabelNom;
    }

    public void setjLabelNom(JLabel jLabelNom) {
        this.jLabelNom = jLabelNom;
    }

    public JLabel getjLabelPrenom() {
        return jLabelPrenom;
    }

    public void setjLabelPrenom(JLabel jLabelPrenom) {
        this.jLabelPrenom = jLabelPrenom;
    }

    public JLabel getjLabelSecteur() {
        return jLabelSecteur;
    }

    public void setjLabelSecteur(JLabel jLabelSecteur) {
        this.jLabelSecteur = jLabelSecteur;
    }

    public JLabel getjLabelVille() {
        return jLabelVille;
    }

    public void setjLabelVille(JLabel jLabelVille) {
        this.jLabelVille = jLabelVille;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JTextField getjTextFieldAdresse() {
        return jTextFieldAdresse;
    }

    public void setjTextFieldAdresse(JTextField jTextFieldAdresse) {
        this.jTextFieldAdresse = jTextFieldAdresse;
    }

    public JTextField getjTextFieldCp() {
        return jTextFieldCp;
    }

    public void setjTextFieldCp(JTextField jTextFieldCp) {
        this.jTextFieldCp = jTextFieldCp;
    }

    public JTextField getjTextFieldNom() {
        return jTextFieldNom;
    }

    public void setjTextFieldNom(JTextField jTextFieldNom) {
        this.jTextFieldNom = jTextFieldNom;
    }

    public JTextField getjTextFieldNomVille() {
        return jTextFieldNomVille;
    }

    public void setjTextFieldNomVille(JTextField jTextFieldNomVille) {
        this.jTextFieldNomVille = jTextFieldNomVille;
    }

    public JTextField getjTextFieldPrenom() {
        return jTextFieldPrenom;
    }

    public void setjTextFieldPrenom(JTextField jTextFieldPrenom) {
        this.jTextFieldPrenom = jTextFieldPrenom;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxChercher = new javax.swing.JComboBox();
        jLabelChercher = new javax.swing.JLabel();
        jButtonChercherVisiteur = new javax.swing.JButton();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelAdresse = new javax.swing.JLabel();
        jLabelVille = new javax.swing.JLabel();
        jLabelSecteur = new javax.swing.JLabel();
        jLabelLabo = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jTextFieldAdresse = new javax.swing.JTextField();
        jTextFieldCp = new javax.swing.JTextField();
        jTextFieldNomVille = new javax.swing.JTextField();
        jButtonPrecedent = new javax.swing.JButton();
        jButtonSuivant = new javax.swing.JButton();
        jButtonFermer = new javax.swing.JButton();
        jTextFieldSecteur = new javax.swing.JTextField();
        jTextFieldLabo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        jComboBoxChercher.setName(""); // NOI18N

        jLabelChercher.setText("Chercher");

        jButtonChercherVisiteur.setText("Ok");
        jButtonChercherVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChercherVisiteurActionPerformed(evt);
            }
        });

        jLabelNom.setText("Nom");

        jLabelPrenom.setText("Prenom");

        jLabelAdresse.setText("Adresse");

        jLabelVille.setText("Ville");

        jLabelSecteur.setText("Secteur");

        jLabelLabo.setText("Labo");

        jButtonPrecedent.setText("Précédent");

        jButtonSuivant.setText("Suivant");

        jButtonFermer.setText("Fermer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPrenom)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldPrenom))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelNom)
                                    .addGap(33, 33, 33)
                                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelChercher)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxChercher, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelAdresse)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelVille)
                                                .addGap(34, 34, 34)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldAdresse)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldCp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldNomVille)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonChercherVisiteur))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSecteur)
                                    .addComponent(jLabelLabo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldSecteur)
                                    .addComponent(jTextFieldLabo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonPrecedent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSuivant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jButtonFermer)
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxChercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelChercher)
                    .addComponent(jButtonChercherVisiteur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrenom)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdresse)
                    .addComponent(jTextFieldAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVille)
                    .addComponent(jTextFieldCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSecteur)
                    .addComponent(jTextFieldSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLabo)
                    .addComponent(jTextFieldLabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrecedent)
                    .addComponent(jButtonSuivant)
                    .addComponent(jButtonFermer))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChercherVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChercherVisiteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChercherVisiteurActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VueVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueVisiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueVisiteur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChercherVisiteur;
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox jComboBoxChercher;
    private javax.swing.JLabel jLabelAdresse;
    private javax.swing.JLabel jLabelChercher;
    private javax.swing.JLabel jLabelLabo;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelSecteur;
    private javax.swing.JLabel jLabelVille;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAdresse;
    private javax.swing.JTextField jTextFieldCp;
    private javax.swing.JTextField jTextFieldLabo;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldNomVille;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldSecteur;
    // End of variables declaration//GEN-END:variables
}