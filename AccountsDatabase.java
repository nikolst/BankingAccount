package bank;

import java.sql.*;

public class AccountsDatabase {
    Account account = new Account();

    private final String URL = "jdbc:sqlite:PATH_TO_FILE";
    private final String FILE_NAME = "/users.db";
    private final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS users (" +
            "id INTEGER PRIMARY KEY, " +
            "number TEXT NOT NULL," +
            "pin TEXT NOT NULL," +
            "balance INTEGER DEFAULT 0)";
    private final String INSERT = "INSERT INTO users (number, pin, balance) VALUES (?, ?, ?)";

    public void connect() {
        try (Connection con = DriverManager.getConnection(URL + FILE_NAME)){
            Statement statement = con.createStatement();
            if (con.isValid(5)) {
                statement.execute(CREATE_TABLE);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void insertDataIntoTable(String cardNumber, String cardPin, int cardBalance) {
        try (Connection con = DriverManager.getConnection(URL + FILE_NAME);
             PreparedStatement ps = con.prepareStatement(INSERT)) {
                ps.setString(1, cardNumber);
                ps.setString(2, cardPin);
                ps.setInt(3, cardBalance);
                ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isAccountExisting(String cardNumber, String cardPin) {
        boolean accountExists = false;

        try (Connection con = DriverManager.getConnection(URL + FILE_NAME);
            Statement statement = con.createStatement()) {
            final String CHECK = "SELECT * FROM users WHERE number = " + cardNumber
                    + " AND pin = " + cardPin;
            ResultSet resultSet = statement.executeQuery(CHECK);
            accountExists = resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountExists;
    }
}
