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

                fNameLabel1 = new javax.swing.JLabel();
                fNameField = new javax.swing.JTextField();
                lNameLabel1 = new javax.swing.JLabel();
                lNameField = new javax.swing.JTextField();
                emailLabel1 = new javax.swing.JLabel();
                contactNoLabel1 = new javax.swing.JLabel();
                contactNoField = new javax.swing.JTextField();
                confirmButton = new javax.swing.JButton();
                cancelButton = new javax.swing.JButton();
                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLayeredPane1 = new javax.swing.JLayeredPane();
                jLayeredPane2 = new javax.swing.JLayeredPane();
                jLayeredPane3 = new javax.swing.JLayeredPane();
                jLayeredPane4 = new javax.swing.JLayeredPane();
                jPanel4 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                userLabel = new javax.swing.JLabel();
                logoutButton = new javax.swing.JButton();
                jPanel6 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel7 = new javax.swing.JPanel();
                emailField = new javax.swing.JTextField();

                setMaximumSize(new java.awt.Dimension(720, 576));
                setMinimumSize(new java.awt.Dimension(720, 576));
                setPreferredSize(new java.awt.Dimension(720, 576));
                addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentShown(java.awt.event.ComponentEvent evt) {
                                formComponentShown(evt);
                        }
                });

                fNameLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                fNameLabel1.setText("First Name");

                fNameField.setBackground(new java.awt.Color(204, 204, 204));
                fNameField.setColumns(36);
                fNameField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fNameFieldActionPerformed(evt);
                        }
                });

                lNameLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                lNameLabel1.setText("Last Name");

                lNameField.setBackground(new java.awt.Color(204, 204, 204));
                lNameField.setColumns(36);
                lNameField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                lNameFieldActionPerformed(evt);
                        }
                });

                emailLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                emailLabel1.setText("E-Mail");

                contactNoLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
                contactNoLabel1.setText("Contact Number (+63)");

                contactNoField.setBackground(new java.awt.Color(204, 204, 204));
                contactNoField.setColumns(36);
                contactNoField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                contactNoFieldActionPerformed(evt);
                        }
                });

                confirmButton.setText("Add");
                confirmButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                confirmButtonActionPerformed(evt);
                        }
                });

                cancelButton.setText("Cancel");
                cancelButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cancelButtonActionPerformed(evt);
                        }
                });

                jPanel4.setBackground(new java.awt.Color(153, 153, 153));

                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO.png"))); // NOI18N

                jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("EASE-STATE");

                userLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                userLabel.setForeground(new java.awt.Color(255, 255, 255));
                userLabel.setText("USER INFO");

                logoutButton.setBackground(new java.awt.Color(153, 153, 153));
                logoutButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                logoutButton.setForeground(new java.awt.Color(255, 255, 255));
                logoutButton.setText("Log out");
                logoutButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                logoutButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(logoutButton)
                                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logoutButton)
                                .addGap(89, 89, 89))
                );

                jPanel6.setBackground(new java.awt.Color(241, 218, 125));

                jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 56)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));
                jLabel1.setText("CLIENT");

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel1)
                                .addContainerGap(424, Short.MAX_VALUE))
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30))
                );

                jPanel7.setBackground(new java.awt.Color(241, 218, 125));

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 743, Short.MAX_VALUE)
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 138, Short.MAX_VALUE)
                );

                emailField.setBackground(new java.awt.Color(204, 204, 204));
                emailField.setColumns(36);
                emailField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                emailFieldActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(86, 86, 86)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, 0)
                                                                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(fNameField)
                                                        .addComponent(fNameLabel1)
                                                        .addComponent(lNameLabel1)
                                                        .addComponent(lNameField)
                                                        .addComponent(emailLabel1)
                                                        .addComponent(contactNoLabel1)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(cancelButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(confirmButton))
                                                        .addComponent(contactNoField)
                                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)
                                                .addComponent(fNameLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lNameLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(emailLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(contactNoLabel1)
                                                .addGap(2, 2, 2)
                                                .addComponent(contactNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(confirmButton)
                                                        .addComponent(cancelButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
		fNameField.setText(client.fName);
		lNameField.setText(client.lName);
		emailField.setText(client.email);
		contactNoField.setText(String.valueOf(client.contactNo));
        }//GEN-LAST:event_formComponentShown

        private void fNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_fNameFieldActionPerformed

        private void lNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_lNameFieldActionPerformed

        private void contactNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_contactNoFieldActionPerformed

        private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
                AMS.insertClient(
                        fNameField.getText(),
                        lNameField.getText(),
                        emailField.getText(),
                        Integer.parseInt(contactNoField.getText())
                );
        }//GEN-LAST:event_confirmButtonActionPerformed

        private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
                layout.show(contentPane, "Appointments");
        }//GEN-LAST:event_cancelButtonActionPerformed

        private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
                Main.sessionAgent = null;
                Main.sessionAgentID = 0;
                layout.show(contentPane, "Log in");
        }//GEN-LAST:event_logoutButtonActionPerformed

        private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_emailFieldActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton cancelButton;
        private javax.swing.JButton confirmButton;
        private javax.swing.JTextField contactNoField;
        private javax.swing.JLabel contactNoLabel1;
        private javax.swing.JTextField emailField;
        private javax.swing.JLabel emailLabel1;
        private javax.swing.JTextField fNameField;
        private javax.swing.JLabel fNameLabel1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLayeredPane jLayeredPane1;
        private javax.swing.JLayeredPane jLayeredPane2;
        private javax.swing.JLayeredPane jLayeredPane3;
        private javax.swing.JLayeredPane jLayeredPane4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JTextField lNameField;
        private javax.swing.JLabel lNameLabel1;
        private javax.swing.JButton logoutButton;
        private javax.swing.JLabel userLabel;
        // End of variables declaration//GEN-END:variables
}
