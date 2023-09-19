package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection connect() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:8081/java_jdbc?user=root&password=root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
