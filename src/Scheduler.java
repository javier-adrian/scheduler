import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Scheduler {
    Connection connection;
    String url;
    String user;
    String password;

    public Scheduler(String database, String user, String password){
        url = "jdbc:mariadb://localhost:3306/" + database + "?user=" + user + "&password=" + password;
        this.user = user;
        this.password = password;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getException());
        }
    }

    public void insertAgent(
            String fName,
            String lName,
            int contact,
            String email,
            String username,
            String password
    ) {
        String query = "INSERT INTO agent " +
                "(fName, lName, contact, email, username, password) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, fName);
            statement.setString(2, lName);
            statement.setInt(3, contact);
            statement.setString(4, email);
            statement.setString(5, username);
            statement.setString(6, password);

            statement.executeUpdate();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertCustomer(
            String fName,
            String lName,
            int contact,
            String email,
            String username,
            String password
    ) {
        String query = "INSERT INTO customer " +
                "(fName, lName, contact, email, username, password) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            connection = DriverManager.getConnection(url, user, this.password);
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, fName);
            statement.setString(2, lName);
            statement.setInt(3, contact);
            statement.setString(4, email);
            statement.setString(5, username);
            statement.setString(6, password);

            statement.executeUpdate();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean validateAgent(String username, String password) {
	    String query = "SELECT * FROM agent WHERE username = ? AND password = ?";
	    boolean success = false;

	    try {
		connection = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, username);
		statement.setString(2, password);

		ResultSet result = statement.executeQuery();

		if (result.next()){
			success = true;
		}
	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    }

	    return success;
    }

    public String getAgentName(String username){
	    String query = "SELECT * FROM agent WHERE username = ?";
	    String name = "Error";

	    try {
		connection = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, username);

		ResultSet result = statement.executeQuery();

		if (result.next()){
			name = result.getString("fName") + " " + result.getString("lName");
		}
	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    }

	    return name;
    }

    public DefaultTableModel getAppointments(DefaultTableModel model, int agentID) {
	    String query = "SELECT * FROM appointment WHERE agent = ?";

	    DefaultTableModel newModel = model;

	    try {
		    connection = DriverManager.getConnection(url, user, password);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, agentID);
		    ResultSet result = statement.executeQuery();

		    while (result.next()){
			    String row = 
				    result.getTimestamp("schedule") + "," +
				    result.getInt("property") + "," +
				    result.getInt("customer");

	 		    String tuple[] = row.split(",");
			    newModel.addRow(tuple);
		    }
	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    }

	    return newModel;
    }
}
