import com.sun.tools.javac.util.Names;
import java.sql.*;
import java.time.Instant;
import javax.swing.table.DefaultTableModel;

public class AMS {
    Connection connection;
    String url;
    String user;
    String password;

    public AMS(String database, String user, String password){
        url = "jdbc:mariadb://localhost:3306/" + database + "?user=" + user + "&password=" + password;
        this.user = user;
        this.password = password;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getException());
        }
    }

    public int getAgentID(String username){
	    String query = "SELECT * FROM agent WHERE username = ?";
	    String name = "Error";

	    int id = 0;

	    try {
		connection = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, username);

		ResultSet result = statement.executeQuery();

	        statement.close();
	        connection.close();

		if (result.next()){
			id = result.getInt("id");
		}
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return id;
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

		    statement.close();
		    connection.close();

		if (result.next()){
			success = true;
		}
	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    }

	    return success;
    }

    public void insertAgent(
            String fName,
            String lName,
            int contactNo,
            String email,
            String username,
            String password
    ) {
        String query = "INSERT INTO agent " +
                "(fName, lName, contactNo, email, username, password) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            connection = DriverManager.getConnection(url);
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, fName);
            statement.setString(2, lName);
            statement.setInt(3, contactNo);
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

    public void insertClient(String fName, String lName, String email, int contactNo){
	    String query = "INSERT INTO client (agent, fName, lName, email, contactNo) values(?, ?, ?, ?, ?)";

	    try {
		    connection = DriverManager.getConnection(url, user, password);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, Main.sessionAgentID);
		    statement.setString(2, fName);
		    statement.setString(3, lName);
		    statement.setString(4, email);
		    statement.setInt(5, contactNo);

		    statement.executeUpdate();

	            statement.close();
	            connection.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
    }

    public void insertProperty(String region, String province, String city, String barangay, String village, String street, String hNumber){
	    String query = "INSERT INTO property (agent, region, province, city, barangay, village, street, hNumber) values(?, ?, ?, ?, ?, ?, ?, ?)";

	    try {
		    connection = DriverManager.getConnection(url, user, password);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, Main.sessionAgentID);
		    statement.setString(2, region);
		    statement.setString(3, province);
		    statement.setString(4, city);
		    statement.setString(5, barangay);
		    statement.setString(6, village);
		    statement.setString(7, street);
		    statement.setString(8, hNumber);

		    statement.executeUpdate();

	            statement.close();
	            connection.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
    }

    public void insertAppointment(int client, int property, int year, int month, int date, int hour, int minute) {
	    String query = "INSERT into appointment (agent, client, property, schedule) values (?, ?, ?, ?)";

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, Main.sessionAgentID);
		    statement.setInt(2, client);
		    statement.setInt(3, property);
		    statement.setTimestamp(4, new Timestamp(year, month, date, hour, minute, 0, 0));

		    statement.executeUpdate();

		    statement.close();
		    connection.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
    }

    public String getAgentName(String username){
	    String query = "SELECT * FROM agent WHERE username = ?";
	    String name = "Error";

	    try {
		connection = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, username);

		ResultSet result = statement.executeQuery();

	        statement.close();
	        connection.close();

		if (result.next()){
			name = result.getString("fName") + " " + result.getString("lName");
		}
	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    }

	    return name;
    }

    public int getNClients(){
	    String query = "SELECT COUNT(*) FROM client WHERE agent = ?";
	    int count = 0;

	    try {
		    connection = DriverManager.getConnection(url);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);

		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()){
			    count = result.getInt(1);
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return count;
    }

    public int getNProperties(){
	    String query = "SELECT COUNT(*) FROM property WHERE agent = ?";
	    int count = 0;

	    try {
		    connection = DriverManager.getConnection(url);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);

		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()){
			    count = result.getInt(1);
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return count;
    }

    public Property[] getProperties() {
	    String query = "SELECT * FROM property WHERE agent = ?";
	    Property[] properties = new Property[getNProperties()];

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);

		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()){
			    properties[result.getRow() - 1] = new Property(
				    result.getInt("id"),
				    "Lot " + result.getString("hNumber") + ", " +
				    result.getString("street") + " St., " +
				    result.getString("village") + ", " +
				    result.getString("barangay") + ", " +
				    result.getString("city") + ", " +
				    result.getString("province")
			    );
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return properties;
    }

    public Client[] getClients() {
	    String query = "SELECT * FROM client WHERE agent = ?";
	    Client[] clients = new Client[getNClients()];

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);

		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()){
			    clients[result.getRow() - 1] = new Client(
				    result.getInt("id"),
				    result.getString("fName") + " " + result.getString("lName")
			    );
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return clients;
    }

    public DefaultTableModel getAppointments(DefaultTableModel model, int agentID) {
	    String query = "SELECT * FROM appointment WHERE agent = ?";

	    DefaultTableModel newModel = model;

	    try {
		    connection = DriverManager.getConnection(url, user, password);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, agentID);
		    ResultSet result = statement.executeQuery();

	            statement.close();
	            connection.close();

		    while (result.next()){
			    String row = 
				    result.getTimestamp("schedule") + "," +
				    result.getInt("property") + "," +
				    result.getInt("client");
 
	 		    String tuple[] = row.split(",");
			    newModel.addRow(tuple);
		    }
	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    }

	    return newModel;
    }
}
