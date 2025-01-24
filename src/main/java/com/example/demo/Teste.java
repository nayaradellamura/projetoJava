package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {
	public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/aralar";
        String user = "postgres";  
        String password = "1924";  

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Conexão bem-sucedida com o banco de dados!");
            }
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
    }
}
