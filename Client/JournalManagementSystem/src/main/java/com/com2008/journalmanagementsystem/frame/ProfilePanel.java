/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com2008.journalmanagementsystem.frame;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.JOptionPane;

import com.com2008.journalmanagementsystem.model.Author;
import com.com2008.journalmanagementsystem.model.Editor;
import com.com2008.journalmanagementsystem.util.Password;
import com.com2008.journalmanagementsystem.util.database.Database;

/**
 *
 * @author Ziting Zhao
 */
public class ProfilePanel extends javax.swing.JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ProfilePanel
     */
    public ProfilePanel() {
        initComponents();
    }

    private UserRole userRole;
    private String email;

    public ProfilePanel(UserRole userRole, String email) {
        initComponents();

        this.userRole = userRole;
        this.email = email;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        innerPanel = new javax.swing.JPanel();
        changePasswordPanel = new javax.swing.JPanel();
        changePasswordLabel = new javax.swing.JLabel();
        changePasswordMainPanel = new javax.swing.JPanel();
        changePasswordInnerPanel = new javax.swing.JPanel();
        oldPasswordPanel = new javax.swing.JPanel();
        oldPasswordLabelPanel = new javax.swing.JPanel();
        oldPasswordLabel = new javax.swing.JLabel();
        filler38 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        oldPasswordField = new javax.swing.JPasswordField();
        filler39 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        newPasswordPanel = new javax.swing.JPanel();
        newPasswordLabelPanel = new javax.swing.JPanel();
        newPasswordLabel = new javax.swing.JLabel();
        filler51 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        newPasswordField = new javax.swing.JPasswordField();
        filler52 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        confirmNewPasswordPanel = new javax.swing.JPanel();
        confirmNewPasswordLabelPanel = new javax.swing.JPanel();
        confirmNewPasswordLabel = new javax.swing.JLabel();
        filler53 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        confirmNewPasswordField = new javax.swing.JPasswordField();
        filler54 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        confirmButton = new javax.swing.JButton();
        filler59 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 40), new java.awt.Dimension(0, 40), new java.awt.Dimension(32767, 40));
        filler60 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler61 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler62 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        jSeparator1 = new javax.swing.JSeparator();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));

        setLayout(new java.awt.BorderLayout());

        mainPanel.setLayout(new java.awt.BorderLayout());

        innerPanel.setLayout(new javax.swing.BoxLayout(innerPanel, javax.swing.BoxLayout.PAGE_AXIS));

        changePasswordPanel.setLayout(new java.awt.BorderLayout());

        changePasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        changePasswordLabel.setText("Change password");
        changePasswordPanel.add(changePasswordLabel, java.awt.BorderLayout.NORTH);

        changePasswordMainPanel.setLayout(new java.awt.BorderLayout());

        changePasswordInnerPanel.setLayout(new javax.swing.BoxLayout(changePasswordInnerPanel, javax.swing.BoxLayout.PAGE_AXIS));

        oldPasswordPanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        oldPasswordPanel.setMinimumSize(new java.awt.Dimension(0, 31));
        oldPasswordPanel.setPreferredSize(new java.awt.Dimension(120, 31));
        oldPasswordPanel.setLayout(new java.awt.BorderLayout());

        oldPasswordLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        oldPasswordLabelPanel.setPreferredSize(getTextfieldLabelSize());
        oldPasswordLabelPanel.setLayout(new java.awt.BorderLayout());

        oldPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        oldPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        oldPasswordLabel.setText("Old password:");
        oldPasswordLabelPanel.add(oldPasswordLabel, java.awt.BorderLayout.CENTER);
        oldPasswordLabelPanel.add(filler38, java.awt.BorderLayout.EAST);

        oldPasswordPanel.add(oldPasswordLabelPanel, java.awt.BorderLayout.WEST);

        oldPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        oldPasswordPanel.add(oldPasswordField, java.awt.BorderLayout.CENTER);
        oldPasswordPanel.add(filler39, java.awt.BorderLayout.SOUTH);

        changePasswordInnerPanel.add(oldPasswordPanel);

        newPasswordPanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        newPasswordPanel.setMinimumSize(new java.awt.Dimension(0, 31));
        newPasswordPanel.setPreferredSize(new java.awt.Dimension(120, 31));
        newPasswordPanel.setLayout(new java.awt.BorderLayout());

        newPasswordLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        newPasswordLabelPanel.setPreferredSize(getTextfieldLabelSize());
        newPasswordLabelPanel.setLayout(new java.awt.BorderLayout());

        newPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        newPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        newPasswordLabel.setText("New password:");
        newPasswordLabelPanel.add(newPasswordLabel, java.awt.BorderLayout.CENTER);
        newPasswordLabelPanel.add(filler51, java.awt.BorderLayout.EAST);

        newPasswordPanel.add(newPasswordLabelPanel, java.awt.BorderLayout.WEST);

        newPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        newPasswordPanel.add(newPasswordField, java.awt.BorderLayout.CENTER);
        newPasswordPanel.add(filler52, java.awt.BorderLayout.SOUTH);

        changePasswordInnerPanel.add(newPasswordPanel);

        confirmNewPasswordPanel.setMaximumSize(new java.awt.Dimension(2147483647, 31));
        confirmNewPasswordPanel.setMinimumSize(new java.awt.Dimension(0, 31));
        confirmNewPasswordPanel.setPreferredSize(new java.awt.Dimension(120, 31));
        confirmNewPasswordPanel.setLayout(new java.awt.BorderLayout());

        confirmNewPasswordLabelPanel.setMinimumSize(new java.awt.Dimension(110, 16));
        confirmNewPasswordLabelPanel.setPreferredSize(getTextfieldLabelSize());
        confirmNewPasswordLabelPanel.setLayout(new java.awt.BorderLayout());

        confirmNewPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        confirmNewPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        confirmNewPasswordLabel.setText("Confirm password:");
        confirmNewPasswordLabelPanel.add(confirmNewPasswordLabel, java.awt.BorderLayout.CENTER);
        confirmNewPasswordLabelPanel.add(filler53, java.awt.BorderLayout.EAST);

        confirmNewPasswordPanel.add(confirmNewPasswordLabelPanel, java.awt.BorderLayout.WEST);

        confirmNewPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        confirmNewPasswordPanel.add(confirmNewPasswordField, java.awt.BorderLayout.CENTER);
        confirmNewPasswordPanel.add(filler54, java.awt.BorderLayout.SOUTH);

        changePasswordInnerPanel.add(confirmNewPasswordPanel);

        confirmButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        changePasswordInnerPanel.add(confirmButton);

        changePasswordMainPanel.add(changePasswordInnerPanel, java.awt.BorderLayout.CENTER);
        changePasswordMainPanel.add(filler59, java.awt.BorderLayout.NORTH);
        changePasswordMainPanel.add(filler60, java.awt.BorderLayout.SOUTH);
        changePasswordMainPanel.add(filler61, java.awt.BorderLayout.WEST);
        changePasswordMainPanel.add(filler62, java.awt.BorderLayout.EAST);

        changePasswordPanel.add(changePasswordMainPanel, java.awt.BorderLayout.CENTER);

        innerPanel.add(changePasswordPanel);
        innerPanel.add(filler1);
        innerPanel.add(jSeparator1);

        mainPanel.add(innerPanel, java.awt.BorderLayout.CENTER);
        mainPanel.add(filler3, java.awt.BorderLayout.WEST);
        mainPanel.add(filler4, java.awt.BorderLayout.EAST);
        mainPanel.add(filler5, java.awt.BorderLayout.NORTH);
        mainPanel.add(filler6, java.awt.BorderLayout.SOUTH);

        mainScrollPane.setViewportView(mainPanel);

        add(mainScrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmButtonActionPerformed

        char[] oldPassword = oldPasswordField.getPassword();
        char[] newPassword = newPasswordField.getPassword();
        char[] confirmNewPassword = confirmNewPasswordField.getPassword();

        if (!Arrays.equals(newPassword, confirmNewPassword)) {
            JOptionPane.showMessageDialog(null, "Inconsistent password.", "Change password", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String hashedOldPassword = Password.generateHash(new String(oldPassword));
        String hashedNewPassword = Password.generateHash(new String(newPassword));

        try {
            switch(userRole){
                case AUTHOR:
                    Author author = Database.read("Author", new Author(email, null)).get(0);
                    if(author.getHashedPassword().equals(hashedOldPassword)){
                        Database.update("Author", new Author(email, null), new Author(null, hashedNewPassword));
                        JOptionPane.showMessageDialog(null, "Change password success.", "Change password", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect old password.", "Change password", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
                case EDITOR:
                	Editor editor = Database.read("Editor", new Editor(email, null)).get(0);
                    if(editor.getHashedPassword().equals(hashedOldPassword)){
                        Database.update("Editor", new Editor(email, null), new Editor(null, hashedNewPassword));
                        JOptionPane.showMessageDialog(null, "Change password success.", "Change password", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect old password.", "Change password", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                default:
                    break;
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }                                             

    // <editor-fold defaultstate="collapsed" desc="Element size">
    private Dimension textfieldLabelSize = new Dimension(120, 100);
    private Dimension getTextfieldLabelSize(){
        return textfieldLabelSize;
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel changePasswordInnerPanel;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JPanel changePasswordMainPanel;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPasswordField confirmNewPasswordField;
    private javax.swing.JLabel confirmNewPasswordLabel;
    private javax.swing.JPanel confirmNewPasswordLabelPanel;
    private javax.swing.JPanel confirmNewPasswordPanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler38;
    private javax.swing.Box.Filler filler39;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler51;
    private javax.swing.Box.Filler filler52;
    private javax.swing.Box.Filler filler53;
    private javax.swing.Box.Filler filler54;
    private javax.swing.Box.Filler filler59;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler60;
    private javax.swing.Box.Filler filler61;
    private javax.swing.Box.Filler filler62;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPanel newPasswordLabelPanel;
    private javax.swing.JPanel newPasswordPanel;
    private javax.swing.JPasswordField oldPasswordField;
    private javax.swing.JLabel oldPasswordLabel;
    private javax.swing.JPanel oldPasswordLabelPanel;
    private javax.swing.JPanel oldPasswordPanel;
    // End of variables declaration//GEN-END:variables
}
