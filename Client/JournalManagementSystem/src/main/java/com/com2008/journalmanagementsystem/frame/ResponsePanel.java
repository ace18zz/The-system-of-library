/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.com2008.journalmanagementsystem.frame;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import com.com2008.journalmanagementsystem.model.Criticism;
import com.com2008.journalmanagementsystem.model.Response;
import com.com2008.journalmanagementsystem.model.Review;
import com.com2008.journalmanagementsystem.util.database.Database;

/**
 *
 * @author Ziting Zhao
 */
public class ResponsePanel extends javax.swing.JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ResponsePanel
     */
    public ResponsePanel() {
        initComponents();
    }

    private ReviewPanel reviewPanel;
    private JList<Criticism> cirticsimList;
    private Criticism currentCriticism;

    public ResponsePanel(String name, Review review) {
        initComponents();
        reviewPanel = new ReviewPanel(name, review, UserRole.AUTHOR);
        add(reviewPanel, java.awt.BorderLayout.CENTER);

        cirticsimList = reviewPanel.getCriticismList();
        cirticsimList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                cirticsimListValueChanged(evt);
            }
        });
    }

    public boolean isFullResponsed(){
        for(int i = 0; i < cirticsimList.getModel().getSize(); i++){
            Criticism criticism = cirticsimList.getModel().getElementAt(i);
            try {
                List<Response> responses = Database.read("Response", new Response(criticism.getEmail(), criticism.getIssn(), criticism.getSubmissionID(), criticism.getNum(), null));
                if(responses.size() == 0)
                    return false;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        responsePanel = new javax.swing.JPanel();
        responseAddPanel = new javax.swing.JPanel();
        responseLabel = new javax.swing.JLabel();
        AddScrolPanel = new javax.swing.JScrollPane();
        responseTextArea = new javax.swing.JTextArea();
        responseSaveBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        responsePanel.setLayout(new java.awt.BorderLayout());

        responseAddPanel.setMinimumSize(new java.awt.Dimension(120, 45));
        responseAddPanel.setLayout(new java.awt.BorderLayout());

        responseLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        responseLabel.setText("Select an cirticsim and response here");
        responseAddPanel.add(responseLabel, java.awt.BorderLayout.NORTH);

        responseTextArea.setColumns(20);
        responseTextArea.setRows(5);
        AddScrolPanel.setViewportView(responseTextArea);

        responseAddPanel.add(AddScrolPanel, java.awt.BorderLayout.CENTER);

        responseSaveBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        responseSaveBtn.setText("Save");
        responseSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responseSaveBtnActionPerformed(evt);
            }
        });
        responseAddPanel.add(responseSaveBtn, java.awt.BorderLayout.LINE_END);
        responseAddPanel.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        responsePanel.add(responseAddPanel, java.awt.BorderLayout.CENTER);

        add(responsePanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void cirticsimListValueChanged(ListSelectionEvent evt) {
        currentCriticism = cirticsimList.getSelectedValue();
        if(currentCriticism != null){
            try {
                List<Response> responses = Database.read("Response", new Response(currentCriticism.getEmail(), currentCriticism.getIssn(), currentCriticism.getSubmissionID(), currentCriticism.getNum(), null));
                if(responses.size() > 0){
                    responseTextArea.setText(responses.get(0).getContent());
                }
                else{
                    responseTextArea.setText(null);
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else{
            responseTextArea.setText(null);
        }
    }

    private void responseSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_responseSaveBtnActionPerformed
        if(currentCriticism == null){
            JOptionPane.showMessageDialog(this, "Please select an criticism", "Save response", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            List<Response> responses = Database.read("Response", new Response(currentCriticism.getEmail(), currentCriticism.getIssn(),currentCriticism.getSubmissionID(), currentCriticism.getNum(), null));
            if(responses.size() > 0){
                Database.update("Response", responses.get(0), new Response(currentCriticism.getEmail(), currentCriticism.getIssn(),currentCriticism.getSubmissionID(), currentCriticism.getNum(), responseTextArea.getText()));
            }
            else{
                Database.write("Response", new Response(currentCriticism.getEmail(), currentCriticism.getIssn(),currentCriticism.getSubmissionID(), currentCriticism.getNum(), responseTextArea.getText()));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }//GEN-LAST:event_responseSaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AddScrolPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel responseAddPanel;
    private javax.swing.JLabel responseLabel;
    private javax.swing.JPanel responsePanel;
    private javax.swing.JButton responseSaveBtn;
    private javax.swing.JTextArea responseTextArea;
    // End of variables declaration//GEN-END:variables
}
