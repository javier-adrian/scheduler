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
public class AddProperty extends javax.swing.JPanel {
	JPanel contentPane;
	AMS AMS;
	CardLayout layout;

	/**
	 * Creates new form AddProperty
	 */
	public AddProperty(JPanel contentPane, AMS scheduler) {
		this.contentPane = contentPane;
		this.AMS = scheduler;
		layout = (CardLayout) contentPane.getLayout();

		initComponents();
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

                regionLabel = new javax.swing.JLabel();
                regionField = new javax.swing.JTextField();
                provinceLabel = new javax.swing.JLabel();
                provinceField = new javax.swing.JTextField();
                cityLabel = new javax.swing.JLabel();
                cityField = new javax.swing.JTextField();
                barangayLabel = new javax.swing.JLabel();
                barangayField = new javax.swing.JTextField();
                villageLabel = new javax.swing.JLabel();
                villageField = new javax.swing.JTextField();
                streetLabel = new javax.swing.JLabel();
                streetField = new javax.swing.JTextField();
                hNumberLabel = new javax.swing.JLabel();
                hNumberField = new javax.swing.JTextField();
                addButton = new javax.swing.JButton();
                backButton = new javax.swing.JButton();

                setMaximumSize(new java.awt.Dimension(720, 576));
                setMinimumSize(new java.awt.Dimension(720, 576));
                setPreferredSize(new java.awt.Dimension(720, 576));
                setLayout(new java.awt.GridBagLayout());

                regionLabel.setText("Region");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
                add(regionLabel, gridBagConstraints);

                regionField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 20);
                add(regionField, gridBagConstraints);

                provinceLabel.setText("Province");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
                add(provinceLabel, gridBagConstraints);

                provinceField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
                add(provinceField, gridBagConstraints);

                cityLabel.setText("City");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
                add(cityLabel, gridBagConstraints);

                cityField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
                add(cityField, gridBagConstraints);

                barangayLabel.setText("Barangay");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
                add(barangayLabel, gridBagConstraints);

                barangayField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
                add(barangayField, gridBagConstraints);

                villageLabel.setText("Village");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 4;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
                add(villageLabel, gridBagConstraints);

                villageField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 4;
                gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
                add(villageField, gridBagConstraints);

                streetLabel.setText("Street");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 5;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
                add(streetLabel, gridBagConstraints);

                streetField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 5;
                gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 20);
                add(streetField, gridBagConstraints);

                hNumberLabel.setText("House Number");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 6;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 0);
                add(hNumberLabel, gridBagConstraints);

                hNumberField.setColumns(36);
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 6;
                gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 20);
                add(hNumberField, gridBagConstraints);

                addButton.setText("Add");
                addButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 7;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
                add(addButton, gridBagConstraints);

                backButton.setText("Cancel");
                backButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 7;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
                add(backButton, gridBagConstraints);
        }// </editor-fold>//GEN-END:initComponents

        private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
                layout.show(contentPane, "Appointments");
        }//GEN-LAST:event_backButtonActionPerformed

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
//		scheduler.insertProperty("IV-A", "Cavite", "Dasmariñas", "Salawag", "Phase 3 Golden city", "Milkita", "45");
		AMS.insertProperty(regionField.getText(), provinceField.getText(), cityField.getText(), barangayField.getText(), villageField.getText(), streetField.getText(), hNumberField.getText());
        }//GEN-LAST:event_addButtonActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addButton;
        private javax.swing.JButton backButton;
        private javax.swing.JTextField barangayField;
        private javax.swing.JLabel barangayLabel;
        private javax.swing.JTextField cityField;
        private javax.swing.JLabel cityLabel;
        private javax.swing.JTextField hNumberField;
        private javax.swing.JLabel hNumberLabel;
        private javax.swing.JTextField provinceField;
        private javax.swing.JLabel provinceLabel;
        private javax.swing.JTextField regionField;
        private javax.swing.JLabel regionLabel;
        private javax.swing.JTextField streetField;
        private javax.swing.JLabel streetLabel;
        private javax.swing.JTextField villageField;
        private javax.swing.JLabel villageLabel;
        // End of variables declaration//GEN-END:variables
}
