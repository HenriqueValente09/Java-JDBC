package br.com.alura.bytebank;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    public static void main(String[] args) {
        try {
            DriverManager.getConnection("jdbc:mysql://localhost:8081/java_jdbc?user=root&password=root");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
