/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.facturation2.view;

/**
 *
 * @author youyou
 */
public class PanelMenuVente extends javax.swing.JPanel {

    /**
     * Creates new form PanelMenuVente
     */
    public PanelMenuVente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBackMainMenu = new javax.swing.JButton();
        btnNewVente = new javax.swing.JButton();
        btnFindVente = new javax.swing.JButton();
        btnListVente = new javax.swing.JButton();

        btnBackMainMenu.setText("Retour");

        btnNewVente.setText("Nouvelle Vente");

        btnFindVente.setText("Rechercher Vente");

        btnListVente.setText("Liste Ventes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBackMainMenu)
                    .addComponent(btnFindVente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListVente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewVente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackMainMenu)
                .addGap(18, 18, 18)
                .addComponent(btnNewVente)
                .addGap(18, 18, 18)
                .addComponent(btnFindVente)
                .addGap(18, 18, 18)
                .addComponent(btnListVente)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackMainMenu;
    private javax.swing.JButton btnFindVente;
    private javax.swing.JButton btnListVente;
    private javax.swing.JButton btnNewVente;
    // End of variables declaration//GEN-END:variables
}
