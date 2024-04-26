import java.sql.*;

public class Scheduler {
    Connection connection;
    String url;
    String user;
    String password;

    public Scheduler(){
        url = "jdbc:mariadb://localhost:3306/scheduler";
        user = "creui";
        password = "....";

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
            connection = DriverManager.getConnection(url, user, password);
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
            connection = DriverManager.getConnection(url, user, password);
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

    public boolean validateCustomer(String username, String password) {
	    String query = "SELECT * FROM customer WHERE username = ? AND password = ?";

	    try {
		connection = DriverManager.getConnection(url, user, password);
		PreparedStatement statement = connection.prepareStatement(query);

		statement.setString(1, username);
		statement.setString(2, password);

		ResultSet result = statement.executeQuery();

		if (result.next()){
			System.out.println("Success");
		} else
			System.out.println("Credentials Incorrect");
	    } catch (SQLException e) {
		    System.out.println(e.getMessage());
	    }

	    return true;
    }
}
