/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author btssio
 */
public class VueMedicament extends javax.swing.JFrame {

    /**
     * Creates new form VueMedicament
     */
    public VueMedicament() {
        initComponents();
    }

    public JButton getjButtonFermerMedic() {
        return jButtonFermerMedic;
    }

    public JButton getjButtonPrecedentMedic() {
        return jButtonPrecedentMedic;
    }

    public JButton getjButtonSuivantMedic() {
        return jButtonSuivantMedic;
    }

    public JComboBox getjComboBoxFamilleMedic() {
        return jComboBoxFamilleMedic;
    }

    public JTextArea getjTextAreaContreIndicationsMedic() {
        return jTextAreaContreIndicationsMedic;
    }

    public JTextArea getjTextAreaEffetsIndesirablesMedic() {
        return jTextAreaEffetsIndesirablesMedic;
    }

    public JTextField getjTextFieldCodeMedic() {
        return jTextFieldCodeMedic;
    }

    public JTextField getjTextFieldCompositionMedic() {
        return jTextFieldCompositionMedic;
    }

    public JTextField getjTextFieldNomCommercialMedic() {
        return jTextFieldNomCommercialMedic;
    }

    public JTextField getjTextFieldPrixEchantillonMedic() {
        return jTextFieldPrixEchantillonMedic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitreMedicament = new javax.swing.JLabel();
        jLabelCodeMedicament = new javax.swing.JLabel();
        jTextFieldCodeMedic = new javax.swing.JTextField();
        jLabelNomCommercialMedic = new javax.swing.JLabel();
        jTextFieldNomCommercialMedic = new javax.swing.JTextField();
        jLabelFamilleMedic = new javax.swing.JLabel();
        jComboBoxFamilleMedic = new javax.swing.JComboBox();
        jLabelCompositionMedic = new javax.swing.JLabel();
        jTextFieldCompositionMedic = new javax.swing.JTextField();
        jLabelEffetsIndesirablesMedic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEffetsIndesirablesMedic = new javax.swing.JTextArea();
        jLabelContreIndicationMedic = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaContreIndicationsMedic = new javax.swing.JTextArea();
        jLabelPrixEchantillonMedic = new javax.swing.JLabel();
        jTextFieldPrixEchantillonMedic = new javax.swing.JTextField();
        jButtonPrecedentMedic = new javax.swing.JButton();
        jButtonSuivantMedic = new javax.swing.JButton();
        jButtonFermerMedic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitreMedicament.setText("                                     Medicaments");

        jLabelCodeMedicament.setText("Code");

        jTextFieldCodeMedic.setText("3MYC7");

        jLabelNomCommercialMedic.setText("Nom Commercial");

        jTextFieldNomCommercialMedic.setText("TRIMYCINE");

        jLabelFamilleMedic.setText("Famille");

        jComboBoxFamilleMedic.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelCompositionMedic.setText("Composition");

        jLabelEffetsIndesirablesMedic.setText("Effets indésirables");

        jTextAreaEffetsIndesirablesMedic.setColumns(20);
        jTextAreaEffetsIndesirablesMedic.setRows(5);
        jScrollPane1.setViewportView(jTextAreaEffetsIndesirablesMedic);

        jLabelContreIndicationMedic.setText("Contre Indication");

        jTextAreaContreIndicationsMedic.setColumns(20);
        jTextAreaContreIndicationsMedic.setRows(5);
        jScrollPane2.setViewportView(jTextAreaContreIndicationsMedic);

        jLabelPrixEchantillonMedic.setText("Prix Echantillon");

        jButtonPrecedentMedic.setText("Précédent");

        jButtonSuivantMedic.setText("Suivant");

        jButtonFermerMedic.setText("Fermer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitreMedicament, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomCommercialMedic)
                                    .addComponent(jLabelCodeMedicament)
                                    .addComponent(jLabelFamilleMedic))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNomCommercialMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxFamilleMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCodeMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEffetsIndesirablesMedic)
                                    .addComponent(jLabelCompositionMedic)
                                    .addComponent(jLabelPrixEchantillonMedic))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCompositionMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPrixEchantillonMedic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonPrecedentMedic)
                            .addComponent(jLabelContreIndicationMedic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSuivantMedic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFermerMedic)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitreMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodeMedicament)
                    .addComponent(jTextFieldCodeMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomCommercialMedic)
                    .addComponent(jTextFieldNomCommercialMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFamilleMedic)
                    .addComponent(jComboBoxFamilleMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCompositionMedic)
                    .addComponent(jTextFieldCompositionMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEffetsIndesirablesMedic)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContreIndicationMedic)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrixEchantillonMedic)
                    .addComponent(jTextFieldPrixEchantillonMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrecedentMedic)
                    .addComponent(jButtonSuivantMedic)
                    .addComponent(jButtonFermerMedic))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VueMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueMedicament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueMedicament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFermerMedic;
    private javax.swing.JButton jButtonPrecedentMedic;
    private javax.swing.JButton jButtonSuivantMedic;
    private javax.swing.JComboBox jComboBoxFamilleMedic;
    private javax.swing.JLabel jLabelCodeMedicament;
    private javax.swing.JLabel jLabelCompositionMedic;
    private javax.swing.JLabel jLabelContreIndicationMedic;
    private javax.swing.JLabel jLabelEffetsIndesirablesMedic;
    private javax.swing.JLabel jLabelFamilleMedic;
    private javax.swing.JLabel jLabelNomCommercialMedic;
    private javax.swing.JLabel jLabelPrixEchantillonMedic;
    private javax.swing.JLabel jLabelTitreMedicament;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaContreIndicationsMedic;
    private javax.swing.JTextArea jTextAreaEffetsIndesirablesMedic;
    private javax.swing.JTextField jTextFieldCodeMedic;
    private javax.swing.JTextField jTextFieldCompositionMedic;
    private javax.swing.JTextField jTextFieldNomCommercialMedic;
    private javax.swing.JTextField jTextFieldPrixEchantillonMedic;
    // End of variables declaration//GEN-END:variables
}
