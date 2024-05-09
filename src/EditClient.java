import javax.swing.*;
import java.awt.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author creui
 */
public class EditClient extends javax.swing.JPanel {
	JPanel contentPane;
	AMS AMS;
	CardLayout layout;
	int ID;
	Client client;

	/**
	 * Creates new form EditClient
	 */
	public EditClient(JPanel contentPane, AMS AMS) {
		this.AMS = AMS;
		this.contentPane = contentPane;
		layout = (CardLayout) contentPane.getLayout();
	
		initComponents();
	}

	public void edit(int ID) {
		this.ID = ID;
		this.client = AMS.getClient(ID);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {
                java.awt.GridBagConstraints gridBagConstraints;

                fNameLabel = new javax.swing.JLabel();
                fNameField = new javax.swing.JTextField();
                lNameLabel = new javax.swing.JLabel();
                lNameField = new javax.swing.JTextField();
                emailLabel = new javax.swing.JLabel();
                emailField = new javax.swing.JTextField();
                contactNoLabel = new javax.swing.JLabel();
                contactNoField = new javax.swing.JTextField();
                confirmButton = new javax.swing.JButton();
                backButton = new javax.swing.JButton();

                setMaximumSize(new java.awt.Dimension(720, 576));
                setMinimumSize(new java.awt.Dimension(720, 576));
                setPreferredSize(new java.awt.Dimension(720, 576));
                addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentShown(java.awt.event.ComponentEvent evt) {
                                formComponentShown(evt);
                        }
                });
                setLayout(new java.awt.GridBagLayout());

                fNameLabel.setText("First Name");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 10);
                add(fNameLabel, gridBagConstraints);

                fNameField.setColumns(36);
                fNameField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fNameFieldActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
                add(fNameField, gridBagConstraints);

                lNameLabel.setText("Last Name");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 10);
                add(lNameLabel, gridBagConstraints);

                lNameField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 20);
                add(lNameField, gridBagConstraints);

                emailLabel.setText("E-Mail");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(10, 20, 10, 10);
                add(emailLabel, gridBagConstraints);

                emailField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 20);
                add(emailField, gridBagConstraints);

                contactNoLabel.setText("Contact Number (+639)");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 10);
                add(contactNoLabel, gridBagConstraints);

                contactNoField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
                add(contactNoField, gridBagConstraints);

                confirmButton.setText("Confirm");
                confirmButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                confirmButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 4;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 20);
                add(confirmButton, gridBagConstraints);

                backButton.setText("Cancel");
                backButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 4;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
                add(backButton, gridBagConstraints);
        }// </editor-fold>//GEN-END:initComponents

        private void fNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_fNameFieldActionPerformed

        private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
		Client updatedClient = new Client(ID);

		updatedClient.fName = fNameField.getText();
		updatedClient.lName = lNameField.getText();
		updatedClient.email = emailField.getText();
		updatedClient.contactNo = Integer.parseInt(contactNoField.getText());

		AMS.updateClient(ID, updatedClient);

		layout.show(contentPane, "Appointments");

		ID = 0;
		fNameField.setText("");
		lNameField.setText("");
		emailField.setText("");
		contactNoField.setText("");
        }//GEN-LAST:event_confirmButtonActionPerformed

        private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
                layout.show(contentPane, "Appointments");

		ID = 0;
		fNameField.setText("");
		lNameField.setText("");
		emailField.setText("");
		contactNoField.setText("");
        }//GEN-LAST:event_backButtonActionPerformed

        private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
		fNameField.setText(client.fName);
		lNameField.setText(client.lName);
		emailField.setText(client.email);
		contactNoField.setText(String.valueOf(client.contactNo));
        }//GEN-LAST:event_formComponentShown


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton backButton;
        private javax.swing.JButton confirmButton;
        private javax.swing.JTextField contactNoField;
        private javax.swing.JLabel contactNoLabel;
        private javax.swing.JTextField emailField;
        private javax.swing.JLabel emailLabel;
        private javax.swing.JTextField fNameField;
        private javax.swing.JLabel fNameLabel;
        private javax.swing.JTextField lNameField;
        private javax.swing.JLabel lNameLabel;
        // End of variables declaration//GEN-END:variables
}
