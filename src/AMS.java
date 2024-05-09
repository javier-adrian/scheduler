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

    public void removeAppointment(int ID) {
	    String query = "DELETE FROM appointment WHERE id = ?";

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, ID);

		    statement.executeUpdate();

		    statement.close();
		    connection.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
    }

    public void removeProperty(int ID) {
	    String query = "DELETE FROM property WHERE id = ?";

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, ID);

		    statement.executeUpdate();

		    statement.close();
		    connection.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
    }

    public void removeClient(int ID) {
	    String query = "DELETE FROM client WHERE id = ?";

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, ID);

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

    public DefaultTableModel getAppointments(DefaultTableModel model) {
	    String query = "SELECT DATE_FORMAT(appointment.schedule, '%b %d, %x %l:%i %p') as schedule, " + 
		    "CONCAT('Lot ', property.hNumber, ', ', property.street, ' St., ', property.village, ', ', property.barangay) AS address, " +
		    "CONCAT(client.fName, ' ', client.lName) AS client " + 
		    "FROM appointment " + 
		    "JOIN agent ON agent.id = appointment.agent " +
		    "JOIN property ON property.id = appointment.property " +
		    "JOIN client ON client.id = appointment.client " +
		    "WHERE appointment.agent = ? " + 
		    "ORDER BY schedule ASC";

	    DefaultTableModel newModel = model;

	    try {
		    connection = DriverManager.getConnection(url, user, password);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);
		    ResultSet result = statement.executeQuery();

	            statement.close();
	            connection.close();

		    String currentSchedule = "";

		    while (result.next()){
			    String client = result.getString("client");
			    String address = result.getString("address");
			    String schedule = result.getString("schedule");

			    if (address == null)
				    address = " ";
			    if (client == null)
				    client = " ";

			    if (schedule.equals(currentSchedule))
				    schedule = " ";

			    String row = 
				    schedule + ",," +
				    address + ",," +
				    client;
 
	 		    String tuple[] = row.split(",,");
			    newModel.addRow(tuple);

			    currentSchedule = schedule;
		    }
	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    }

	    return newModel;
    }

    public DefaultTableModel getProperties(DefaultTableModel model){
	    String query = 
		    "SELECT CONCAT('Lot ', property.hNumber, ', ', property.street, ' St., ', property.village, ', ', property.barangay) AS address, " +
		    "DATE_FORMAT(appointment.schedule, '%b %d, %x %l:%i %p') as schedule, " + 
		    "CONCAT(client.fName, ' ', client.lName) AS client " + 
		    "FROM property " +
		    "LEFT JOIN appointment ON property.id = appointment.property " +
		    "LEFT JOIN client ON appointment.client = client.id " +
		    "WHERE property.agent = ?";

	    DefaultTableModel newModel = model;

	    try {
		    connection = DriverManager.getConnection(url, user, password);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);
		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    String currentProperty = "";

		    while (result.next()) {
			    String client = result.getString("client");
			    String address = result.getString("address");
			    String schedule = result.getString("schedule");

			    if (schedule == null)
				    schedule = " ";
			    if (client == null)
				    client = " ";

			    if (address.equals(currentProperty))
				    address = " ";

			    String row = 
				    address + ",," +
				    schedule + ",," +
				    client;
			    String[] tuple = row.split(",,");
			    newModel.addRow(tuple);

			    currentProperty = address;
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return newModel;
    }

    public DefaultTableModel getClients(DefaultTableModel model){
	    String query = 
		    "SELECT CONCAT(client.fName, ' ', client.lName) AS client, " + 
		    "CONCAT('Lot ', property.hNumber, ', ', property.street, ' St., ', property.village, ', ', property.barangay) AS address, " +
		    "DATE_FORMAT(appointment.schedule, '%b %d, %x %l:%i %p') as schedule " + 
		    "FROM client " +
		    "LEFT JOIN appointment ON client.id = appointment.client " +
		    "LEFT JOIN property ON appointment.property = property.id " +
		    "WHERE client.agent = ?";

	    DefaultTableModel newModel = model;

	    try {
		    connection = DriverManager.getConnection(url, user, password);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);
		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    String currentClient = "";

		    while (result.next()) {
			    String client = result.getString("client");
			    String address = result.getString("address");
			    String schedule = result.getString("schedule");

			    if (address == null)
				    address = " ";
			    if (schedule == null)
				    schedule = " ";

			    if (client.equals(currentClient))
				    client = " ";

			    String row = 
				    client + ",," +
				    address + ",," +
				    schedule;

			    String[] tuple = row.split(",,");
			    newModel.addRow(tuple);

			    currentClient = client;
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return newModel;
    }

    public DefaultTableModel getClientsIDs(DefaultTableModel model){
	    String query = 
		    "SELECT client.id, " + 
		    "property.id, " + 
		    "appointment.id " + 
		    "FROM client " +
		    "LEFT JOIN appointment ON client.id = appointment.client " +
		    "LEFT JOIN property ON appointment.property = property.id " +
		    "WHERE client.agent = ?";

	    DefaultTableModel newModel = model;

	    try {
		    connection = DriverManager.getConnection(url, user, password);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);
		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()) {
			    String client = result.getString("client.id");
			    String property = result.getString("property.id");
			    String appointment = result.getString("appointment.id");

			    String row = 
				    client + ",," +
				    property + ",," +
				    appointment;

			    String[] tuple = row.split(",,");
			    newModel.addRow(tuple);
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return newModel;
    }

    public DefaultTableModel getPropertyIDs(DefaultTableModel model){
	    String query = 
		    "SELECT property.id, " + 
		    "appointment.id, " + 
		    "client.id " + 
		    "FROM property " +
		    "LEFT JOIN appointment ON property.id = appointment.property " +
		    "LEFT JOIN client ON appointment.client = client.id " +
		    "WHERE property.agent = ?";

	    DefaultTableModel newModel = model;

	    try {
		    connection = DriverManager.getConnection(url, user, password);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);
		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()) {
			    int client = result.getInt("client.id");
			    int property = result.getInt("property.id");
			    int appointment = result.getInt("appointment.id");

			    String row = 
				    property + ",," +
				    appointment + ",," +
				    client;
			    String[] tuple = row.split(",,");
			    newModel.addRow(tuple);
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return newModel;
    }

    public DefaultTableModel getAppointmentIDs(DefaultTableModel model){
	    String query = 
		    "SELECT appointment.id, " + 
		    "property.id, " + 
		    "client.id " + 
		    "FROM property " +
		    "LEFT JOIN appointment ON property.id = appointment.property " +
		    "LEFT JOIN client ON appointment.client = client.id " +
		    "WHERE appointment.agent = ?";

	    DefaultTableModel newModel = model;

	    try {
		    connection = DriverManager.getConnection(url, user, password);

		    PreparedStatement statement = connection.prepareStatement(query);
		    statement.setInt(1, Main.sessionAgentID);
		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()) {
			    int client = result.getInt("client.id");
			    int property = result.getInt("property.id");
			    int appointment = result.getInt("appointment.id");

			    String row = 
				    appointment + ",," +
				    property + ",," +
				    client;
			    String[] tuple = row.split(",,");
			    newModel.addRow(tuple);
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return newModel;
    }

    public Property getProperty(int ID) {
	    String query = "SELECT * FROM property where id = ?";
	    Property property = new Property(ID, "");

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, ID);

		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()) {
			    property.region = result.getString("region");
			    property.province = result.getString("province");
			    property.city = result.getString("city");
			    property.barangay = result.getString("barangay");
			    property.village = result.getString("village");
			    property.street = result.getString("street");
			    property.hNumber = result.getString("hNumber");
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return property;
    }

    public Appointment getAppointment(int ID) {
	    String query = "SELECT * FROM appointment where id = ?";
	    Appointment appointment = new Appointment(ID);

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, ID);

		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()) {
			    Timestamp schedule = result.getTimestamp("schedule");
			    appointment.year = schedule.getYear() - 100;
			    appointment.month = schedule.getMonth();
			    appointment.date = schedule.getDate();
			    if (schedule.getHours() > 11) {
				    appointment.hour = schedule.getHours() - 12;
				    appointment.meridiem = 1;
			    } else {
				    appointment.hour = schedule.getHours();
				    appointment.meridiem = 0;
			    }
			    appointment.minute = schedule.getMinutes();
			    appointment.client = result.getInt("client");
			    appointment.property = result.getInt("property");
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return appointment;
    }

    public Client getClient(int ID) {
	    String query = "SELECT * FROM client where id = ?";
	    Client client = new Client(ID);

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, ID);

		    ResultSet result = statement.executeQuery();

		    statement.close();
		    connection.close();

		    while (result.next()) {
			    client.fName = result.getString("fName");
			    client.lName = result.getString("lName");
			    client.email = result.getString("email");
			    client.contactNo = result.getInt("contactNo");
		    }
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }

	    return client;
    }

    public void updateAppointment(int ID, Appointment appointment) {
	    String query = "UPDATE appointment set client = ?, property = ?, schedule = ? WHERE id = ?";
	    int hour = 0;

	    if (appointment.meridiem == 1) {
		    hour = appointment.hour + 12;
	    } else
		    hour = appointment.hour;

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setInt(1, appointment.client);
		    statement.setInt(2, appointment.property);
		    statement.setTimestamp(3, new Timestamp(appointment.year + 100, appointment.month, appointment.date, hour, appointment.minute, 0, 0));
		    statement.setInt(4, ID);

		    statement.executeUpdate();

		    statement.close();
		    connection.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
    }

    public void updateProperty(int ID, Property property){
	    String query = "UPDATE property set region = ?, province = ?, city = ?, barangay = ?, village = ?, street = ?, hNumber = ? WHERE id = ?";

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setString(1, property.region);
		    statement.setString(2, property.province);
		    statement.setString(3, property.city);
		    statement.setString(4, property.barangay);
		    statement.setString(5, property.village);
		    statement.setString(6, property.street);
		    statement.setString(7, property.hNumber);
		    statement.setInt(8, ID);

		    statement.executeUpdate();

		    statement.close();
		    connection.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
    }

    public void updateClient(int ID, Client client) {
	    String query = "UPDATE client set fName = ?, lName = ?, email = ?, contactNo = ? WHERE id = ?";

	    try {
		    connection = DriverManager.getConnection(url);
		    PreparedStatement statement = connection.prepareStatement(query);

		    statement.setString(1, client.fName);
		    statement.setString(2, client.lName);
		    statement.setString(3, client.email);
		    statement.setInt(4, client.contactNo);
		    statement.setInt(5, ID);

		    statement.executeUpdate();

		    statement.close();
		    connection.close();
	    } catch (SQLException e) {
		    e.printStackTrace();
	    }
    }
}
