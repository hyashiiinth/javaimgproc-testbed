/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication54;

import javax.swing.JFrame;

/**
 *
 * @author hyacinth mioten
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        DestinationLabel = new javax.swing.JLabel();
        CountButton = new javax.swing.JButton();
        RecordButton = new javax.swing.JButton();
        ForecastButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Panel.setMinimumSize(new java.awt.Dimension(1920, 1080));
        Panel.setLayout(null);

        DestinationLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DestinationLabel.setForeground(new java.awt.Color(255, 255, 255));
        DestinationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DestinationLabel.setText("Please choose your desired destination:");
        Panel.add(DestinationLabel);
        DestinationLabel.setBounds(440, 180, 400, 60);

        CountButton.setBackground(new java.awt.Color(0, 0, 0));
        CountButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CountButton.setForeground(new java.awt.Color(255, 255, 255));
        CountButton.setText("Egg/Fry Count");
        CountButton.setBorder(null);
        CountButton.setBorderPainted(false);
        CountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountButtonActionPerformed(evt);
            }
        });
        Panel.add(CountButton);
        CountButton.setBounds(440, 270, 400, 60);

        RecordButton.setBackground(new java.awt.Color(0, 0, 0));
        RecordButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        RecordButton.setForeground(new java.awt.Color(255, 255, 255));
        RecordButton.setText("View Record");
        RecordButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RecordButton.setBorderPainted(false);
        RecordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordButtonActionPerformed(evt);
            }
        });
        Panel.add(RecordButton);
        RecordButton.setBounds(440, 360, 400, 60);

        ForecastButton.setBackground(new java.awt.Color(0, 0, 0));
        ForecastButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ForecastButton.setForeground(new java.awt.Color(255, 255, 255));
        ForecastButton.setText("Forecast");
        ForecastButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ForecastButton.setBorderPainted(false);
        ForecastButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ForecastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForecastButtonActionPerformed(evt);
            }
        });
        Panel.add(ForecastButton);
        ForecastButton.setBounds(440, 450, 400, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication54/Images/I_Blue.jpg"))); // NOI18N
        Panel.add(Background);
        Background.setBounds(0, 0, 1660, 920);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ForecastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForecastButtonActionPerformed
        new ForecastFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ForecastButtonActionPerformed

    private void RecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordButtonActionPerformed
        new DatabaseFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RecordButtonActionPerformed

    private void CountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountButtonActionPerformed
        new ThesisJFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CountButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CountButton;
    private javax.swing.JLabel DestinationLabel;
    private javax.swing.JButton ForecastButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton RecordButton;
    // End of variables declaration//GEN-END:variables
}
