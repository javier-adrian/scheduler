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
public class EditProperty extends javax.swing.JPanel {
	JPanel contentPane;
	AMS AMS;
	CardLayout layout;
	int ID;
	Property property;

	/**
	 * Creates new form EditProperty
	 */
	public EditProperty(JPanel contentPane, AMS AMS) {
		this.AMS = AMS;
		this.contentPane = contentPane;
		layout = (CardLayout) contentPane.getLayout();
	
		initComponents();
	}

	public void edit(int ID) {
		this.ID = ID;
		property = AMS.getProperty(ID);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                regionLabel1 = new javax.swing.JLabel();
                regionField = new javax.swing.JTextField();
                provinceLabel1 = new javax.swing.JLabel();
                provinceField = new javax.swing.JTextField();
                cityLabel1 = new javax.swing.JLabel();
                cityField = new javax.swing.JTextField();
                barangayLabel1 = new javax.swing.JLabel();
                barangayField = new javax.swing.JTextField();
                villageLabel1 = new javax.swing.JLabel();
                villageField = new javax.swing.JTextField();
                streetLabel1 = new javax.swing.JLabel();
                streetField = new javax.swing.JTextField();
                hNumberLabel1 = new javax.swing.JLabel();
                hNumberField = new javax.swing.JTextField();
                confirmButton = new javax.swing.JButton();
                cancelButton = new javax.swing.JButton();
                jPanel1 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                userLabel = new javax.swing.JLabel();
                logoutButton = new javax.swing.JButton();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();

                setMaximumSize(new java.awt.Dimension(720, 576));
                setMinimumSize(new java.awt.Dimension(720, 576));
                setPreferredSize(new java.awt.Dimension(720, 576));
                addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentShown(java.awt.event.ComponentEvent evt) {
                                formComponentShown(evt);
                        }
                });

                regionLabel1.setText("Region");

                regionField.setBackground(new java.awt.Color(204, 204, 204));
                regionField.setColumns(36);

                provinceLabel1.setText("Province");

                provinceField.setBackground(new java.awt.Color(204, 204, 204));
                provinceField.setColumns(36);

                cityLabel1.setText("City");

                cityField.setBackground(new java.awt.Color(204, 204, 204));
                cityField.setColumns(36);

                barangayLabel1.setText("Barangay");

                barangayField.setBackground(new java.awt.Color(204, 204, 204));
                barangayField.setColumns(36);

                villageLabel1.setText("Village");

                villageField.setBackground(new java.awt.Color(204, 204, 204));
                villageField.setColumns(36);

                streetLabel1.setText("Street");

                streetField.setBackground(new java.awt.Color(204, 204, 204));
                streetField.setColumns(36);

                hNumberLabel1.setText("House Number");

                hNumberField.setBackground(new java.awt.Color(204, 204, 204));
                hNumberField.setColumns(36);

                confirmButton.setText("Confirm");
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

                jPanel1.setBackground(new java.awt.Color(153, 153, 153));

                jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("EASE-STATE");

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO.png"))); // NOI18N

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

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(logoutButton)
                                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logoutButton)
                                .addGap(49, 49, 49))
                );

                jPanel2.setBackground(new java.awt.Color(241, 218, 125));

                jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 56)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));
                jLabel1.setText("PROPERTY");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel1)
                                .addContainerGap(125, Short.MAX_VALUE))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24))
                );

                jPanel4.setBackground(new java.awt.Color(241, 218, 125));

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 128, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cancelButton)
                                                        .addComponent(regionLabel1)
                                                        .addComponent(regionField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(provinceLabel1)
                                                        .addComponent(provinceField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(cityLabel1)
                                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                        .addComponent(barangayLabel1)
                                                        .addComponent(barangayField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(hNumberLabel1)
                                                                .addComponent(villageLabel1)
                                                                .addComponent(streetLabel1)
                                                                .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                .addComponent(villageField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addComponent(hNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(confirmButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(villageLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(villageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(streetLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(regionLabel1)
                                                                .addGap(5, 5, 5)
                                                                .addComponent(regionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(provinceLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(provinceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(cityLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(hNumberLabel1))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(hNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(barangayLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(barangayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(cancelButton)
                                                                        .addComponent(confirmButton))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                );
        }// </editor-fold>//GEN-END:initComponents

        private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
		userLabel.setText(AMS.getAgentName(Main.sessionAgent));
		regionField.setText(property.region);
		provinceField.setText(property.province);
		cityField.setText(property.city);
		barangayField.setText(property.barangay);
		villageField.setText(property.village);
		streetField.setText(property.street);
		hNumberField.setText(property.hNumber);
        }//GEN-LAST:event_formComponentShown

        private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
		Property updatedProperty = new Property(ID, "");
		updatedProperty.region = regionField.getText();
		updatedProperty.province = provinceField.getText();
		updatedProperty.city = cityField.getText();
		updatedProperty.barangay = barangayField.getText();
		updatedProperty.village = villageField.getText();
		updatedProperty.street = streetField.getText();
		updatedProperty.hNumber = hNumberField.getText();

		AMS.updateProperty(ID, updatedProperty);

		layout.show(contentPane, "Appointments");

		ID = 0;
		regionField.setText("");
		provinceField.setText("");
		cityField.setText("");
		barangayField.setText("");
		villageField.setText("");
		streetField.setText("");
		hNumberField.setText("");
        }//GEN-LAST:event_confirmButtonActionPerformed

        private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
                layout.show(contentPane, "Appointments");

		ID = 0;
		regionField.setText("");
		provinceField.setText("");
		cityField.setText("");
		barangayField.setText("");
		villageField.setText("");
		streetField.setText("");
		hNumberField.setText("");
        }//GEN-LAST:event_cancelButtonActionPerformed

        private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
                Main.sessionAgent = null;
                Main.sessionAgentID = 0;
                layout.show(contentPane, "Log in");
        }//GEN-LAST:event_logoutButtonActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextField barangayField;
        private javax.swing.JLabel barangayLabel1;
        private javax.swing.JButton cancelButton;
        private javax.swing.JTextField cityField;
        private javax.swing.JLabel cityLabel1;
        private javax.swing.JButton confirmButton;
        private javax.swing.JTextField hNumberField;
        private javax.swing.JLabel hNumberLabel1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JButton logoutButton;
        private javax.swing.JTextField provinceField;
        private javax.swing.JLabel provinceLabel1;
        private javax.swing.JTextField regionField;
        private javax.swing.JLabel regionLabel1;
        private javax.swing.JTextField streetField;
        private javax.swing.JLabel streetLabel1;
        private javax.swing.JLabel userLabel;
        private javax.swing.JTextField villageField;
        private javax.swing.JLabel villageLabel1;
        // End of variables declaration//GEN-END:variables
}
