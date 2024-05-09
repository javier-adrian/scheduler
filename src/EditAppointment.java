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
public class EditAppointment extends javax.swing.JPanel {
	JPanel contentPane;
	AMS AMS;
	CardLayout layout;
	int ID;
	Appointment appointment;
	Client[] clients;
	Property[] properties;

	/**
	 * Creates new form EditAppointment
	 */
	public EditAppointment(JPanel contentPane, AMS AMS) {
		this.AMS = AMS;
		this.contentPane = contentPane;
		layout = (CardLayout) contentPane.getLayout();
	
		initComponents();
	}

	public void edit(int ID) {
		this.ID = ID;
		appointment = AMS.getAppointment(ID);
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

                clientLabel = new javax.swing.JLabel();
                clientChooser = new javax.swing.JComboBox<>();
                propertyLabel = new javax.swing.JLabel();
                propertyChooser = new javax.swing.JComboBox<>();
                scheduleLabel = new javax.swing.JLabel();
                dateSpinner = new javax.swing.JSpinner();
                yearSpinner = new javax.swing.JSpinner();
                dateComma = new javax.swing.JLabel();
                yearPrefix = new javax.swing.JLabel();
                hourSpinner = new javax.swing.JSpinner();
                timeSeparator = new javax.swing.JLabel();
                minuteSpinner = new javax.swing.JSpinner();
                confirmButton = new javax.swing.JButton();
                backButton = new javax.swing.JButton();
                meridiemChooser = new javax.swing.JComboBox<>();
                monthChooser = new javax.swing.JComboBox<>();

                setMaximumSize(new java.awt.Dimension(720, 576));
                setMinimumSize(new java.awt.Dimension(720, 576));
                setPreferredSize(new java.awt.Dimension(720, 576));
                addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentShown(java.awt.event.ComponentEvent evt) {
                                formComponentShown(evt);
                        }
                });
                setLayout(new java.awt.GridBagLayout());

                clientLabel.setText("Client");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
                add(clientLabel, gridBagConstraints);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 0;
                gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
                add(clientChooser, gridBagConstraints);

                propertyLabel.setText("Property");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
                add(propertyLabel, gridBagConstraints);

                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 1;
                gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 20);
                add(propertyChooser, gridBagConstraints);

                scheduleLabel.setText("Schedule");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
                add(scheduleLabel, gridBagConstraints);

                dateSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 2;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
                add(dateSpinner, gridBagConstraints);

                yearSpinner.setModel(new javax.swing.SpinnerNumberModel(24, 24, 25, 1));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 5;
                gridBagConstraints.gridy = 2;
                add(yearSpinner, gridBagConstraints);

                dateComma.setText(",");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 3;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(10, 3, 0, 10);
                add(dateComma, gridBagConstraints);

                yearPrefix.setText("20");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 4;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 3);
                add(yearPrefix, gridBagConstraints);

                hourSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 6;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
                add(hourSpinner, gridBagConstraints);

                timeSeparator.setText(":");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 7;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
                add(timeSeparator, gridBagConstraints);

                minuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 8;
                gridBagConstraints.gridy = 2;
                add(minuteSpinner, gridBagConstraints);

                confirmButton.setText("Confirm");
                confirmButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                confirmButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 9;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
                add(confirmButton, gridBagConstraints);

                backButton.setText("Cancel");
                backButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backButtonActionPerformed(evt);
                        }
                });
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 3;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
                add(backButton, gridBagConstraints);

                meridiemChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 9;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
                add(meridiemChooser, gridBagConstraints);

                monthChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 1;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 10);
                add(monthChooser, gridBagConstraints);
        }// </editor-fold>//GEN-END:initComponents

        private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
		Appointment updatedAppointment = new Appointment(ID);

		updatedAppointment.client = clients[clientChooser.getSelectedIndex()].id;
		updatedAppointment.property = properties[propertyChooser.getSelectedIndex()].id;
		updatedAppointment.year = (int) yearSpinner.getValue();
		updatedAppointment.month = monthChooser.getSelectedIndex();
		updatedAppointment.date = (int) dateSpinner.getValue();
		updatedAppointment.hour = (int) hourSpinner.getValue();
		updatedAppointment.minute = (int) minuteSpinner.getValue();
		updatedAppointment.meridiem = meridiemChooser.getSelectedIndex();

		AMS.updateAppointment(ID, updatedAppointment);

		layout.show(contentPane, "Appointments");

		ID = 0;
		clientChooser.removeAllItems();
		propertyChooser.removeAllItems();
		monthChooser.setSelectedIndex(0);
		dateSpinner.setValue(1);
		yearSpinner.setValue(24);
		hourSpinner.setValue(1);
		minuteSpinner.setValue(0);
		meridiemChooser.setSelectedIndex(0);
        }//GEN-LAST:event_confirmButtonActionPerformed

        private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
                layout.show(contentPane, "Appointments");

		ID = 0;
		clientChooser.removeAllItems();
		propertyChooser.removeAllItems();
		monthChooser.setSelectedIndex(0);
		dateSpinner.setValue(1);
		yearSpinner.setValue(24);
		hourSpinner.setValue(1);
		minuteSpinner.setValue(0);
		meridiemChooser.setSelectedIndex(0);
        }//GEN-LAST:event_backButtonActionPerformed

        private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
		clients = AMS.getClients();

		for (int i = 0; i < clients.length; i++){
			clientChooser.addItem(clients[i].name);

			if (clients[i].id == ID) {
				clientChooser.setSelectedIndex(i);
			}
		}

		properties = AMS.getProperties();

		for (int i = 0; i < properties.length; i++){
			propertyChooser.addItem(properties[i].address);

			if (properties[i].id == ID) {
				propertyChooser.setSelectedIndex(i);
			}
		}

		yearSpinner.setValue(appointment.year);
		monthChooser.setSelectedIndex(appointment.month);
		dateSpinner.setValue(appointment.date);
		hourSpinner.setValue(appointment.hour);
		minuteSpinner.setValue(appointment.minute);
		meridiemChooser.setSelectedIndex(appointment.meridiem);
        }//GEN-LAST:event_formComponentShown


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton backButton;
        private javax.swing.JComboBox<String> clientChooser;
        private javax.swing.JLabel clientLabel;
        private javax.swing.JButton confirmButton;
        private javax.swing.JLabel dateComma;
        private javax.swing.JSpinner dateSpinner;
        private javax.swing.JSpinner hourSpinner;
        private javax.swing.JComboBox<String> meridiemChooser;
        private javax.swing.JSpinner minuteSpinner;
        private javax.swing.JComboBox<String> monthChooser;
        private javax.swing.JComboBox<String> propertyChooser;
        private javax.swing.JLabel propertyLabel;
        private javax.swing.JLabel scheduleLabel;
        private javax.swing.JLabel timeSeparator;
        private javax.swing.JLabel yearPrefix;
        private javax.swing.JSpinner yearSpinner;
        // End of variables declaration//GEN-END:variables
}
