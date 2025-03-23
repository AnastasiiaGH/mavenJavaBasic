package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String URL = "jdbc:postgresql://localhost:5432/students_db";
    public static final String USER = "postgres";
    public static final String PASSWORD = "admin";

    public static class main {
        public main(String[] args) {
            try (Connection conn = DriverManager.getConnection(Config.URL, Config.USER, Config.PASSWORD)) {
                System.out.println("✅ Підключення до PostgreSQL успішне!");
            } catch (SQLException e) {
                System.out.println("❌ Помилка підключення: " + e.getMessage());
            }
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
