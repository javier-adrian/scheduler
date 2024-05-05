
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author creui
 */
public class Main extends javax.swing.JFrame {
	Login loginPane;
	Register registerPane;
	Appointments appointmentsPane;
	AddClient addClientPane;
	AddProperty addPropertyPane;
	AddAppointment addAppointmentPane;
	JPanel contentPane;

	AMS AMS;
	CardLayout layout;

	static String sessionAgent;
	static int sessionAgentID;

	/**
	 * Creates new form Main
	 */
	public Main() {
		AMS = new AMS("AMS", "creui", "....");
		contentPane = new JPanel(new CardLayout());

		loginPane = new Login(contentPane, AMS);
		registerPane = new Register(contentPane, AMS);
		appointmentsPane = new Appointments(contentPane, AMS);
		addClientPane = new AddClient(contentPane, AMS);
		addPropertyPane = new AddProperty(contentPane, AMS);
		addAppointmentPane = new AddAppointment(contentPane, AMS);

		contentPane.add("Log in", loginPane);
		contentPane.add("Register", registerPane);
		contentPane.add("Appointments", appointmentsPane);
		contentPane.add("Add Client", addClientPane);
		contentPane.add("Add Property", addPropertyPane);
		contentPane.add("Add Appointment", addAppointmentPane);

		layout = (CardLayout) contentPane.getLayout();

		layout.show(contentPane, "Log in");
		
		getContentPane().add(contentPane);

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

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(720, 576));
                setSize(new java.awt.Dimension(720, 576));
                getContentPane().setLayout(new java.awt.CardLayout());

                pack();
        }// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set look and feel */
		try {
			UIManager.setLookAndFeel(new FlatLightLaf());
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        // End of variables declaration//GEN-END:variables
}
