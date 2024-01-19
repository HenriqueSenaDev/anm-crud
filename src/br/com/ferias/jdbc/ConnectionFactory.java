package br.com.ferias.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                            System.getenv("DB_URL"),
                            System.getenv("DB_USER"),
                            System.getenv("DB_PASS"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
