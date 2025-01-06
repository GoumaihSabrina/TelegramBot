import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/strumenti";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connessione al database riuscita!");
        } catch (ClassNotFoundException e) {
            System.out.println("Errore: Driver MySQL non trovato.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Errore: impossibile connettersi al database.");
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        Connection conn = DatabaseConnection.getConnection();
        if (conn != null) {
            System.out.println("Connessione stabilita con successo!");
        }
    }
}