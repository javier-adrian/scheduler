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
public class Appointments extends javax.swing.JPanel {

	JPanel contentPane;
	Scheduler scheduler;

	/**
	 * Creates new form Appointments
	 */
	public Appointments(JPanel contentPane, Scheduler scheduler) {
		this.contentPane = contentPane;
		this.scheduler = scheduler;

		initComponents();

		sortBy.addItem("Property");
		sortBy.addItem("Customer");
		sortBy.addItem("Schedule");
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

                userLabel = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                filterBy = new javax.swing.JComboBox<>();
                filterByLabel = new javax.swing.JLabel();
                sortByLabel = new javax.swing.JLabel();
                sortBy = new javax.swing.JComboBox<>();
                addPropertyButton = new javax.swing.JButton();
                addLabel = new javax.swing.JLabel();
                addCustomerButton = new javax.swing.JButton();
                addAppointmentButton = new javax.swing.JButton();
                logoutButton = new javax.swing.JButton();
                listByLabel = new javax.swing.JLabel();
                listBy = new javax.swing.JComboBox<>();

                setMinimumSize(new java.awt.Dimension(640, 640));
                setLayout(new java.awt.GridBagLayout());

                userLabel.setText("[User]");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(40, 20, 0, 0);
                add(userLabel, gridBagConstraints);

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null}
                        },
                        new String [] {
                                "Property", "Customer", "Schedule"
                        }
                ));
                jScrollPane1.setViewportView(jTable1);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.gridwidth = 6;
                gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
                gridBagConstraints.weighty = 1.0;
                gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
                add(jScrollPane1, gridBagConstraints);

                filterBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 3;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 20);
                add(filterBy, gridBagConstraints);

                filterByLabel.setText("Filter by...");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 20);
                add(filterByLabel, gridBagConstraints);

                sortByLabel.setText("Sort by...");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 4;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 20);
                add(sortByLabel, gridBagConstraints);

                sortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 5;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 20);
                add(sortBy, gridBagConstraints);

                addPropertyButton.setText("Property");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 3;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 40, 20);
                add(addPropertyButton, gridBagConstraints);

                addLabel.setText("Add...");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 40, 20);
                add(addLabel, gridBagConstraints);

                addCustomerButton.setText("Customer");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 4;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 40, 20);
                add(addCustomerButton, gridBagConstraints);

                addAppointmentButton.setText("Appointment");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 5;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 40, 20);
                add(addAppointmentButton, gridBagConstraints);

                logoutButton.setText("Log out");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.weightx = 1.0;
                gridBagConstraints.insets = new java.awt.Insets(40, 20, 0, 20);
                add(logoutButton, gridBagConstraints);

                listByLabel.setText("List...");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 4;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
                add(listByLabel, gridBagConstraints);

                listBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                listBy.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                listByActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 5;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
                add(listBy, gridBagConstraints);
        }// </editor-fold>//GEN-END:initComponents

        private void listByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listByActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_listByActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addAppointmentButton;
        private javax.swing.JButton addCustomerButton;
        private javax.swing.JLabel addLabel;
        private javax.swing.JButton addPropertyButton;
        private javax.swing.JComboBox<String> filterBy;
        private javax.swing.JLabel filterByLabel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JComboBox<String> listBy;
        private javax.swing.JLabel listByLabel;
        private javax.swing.JButton logoutButton;
        private javax.swing.JComboBox<String> sortBy;
        private javax.swing.JLabel sortByLabel;
        private javax.swing.JLabel userLabel;
        // End of variables declaration//GEN-END:variables
}
