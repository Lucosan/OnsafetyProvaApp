package com.lucca.provaonsafety;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProvaonsafetyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaonsafetyApplication.class, args);

		String urlConnection = "jdbc:mysql:PORTA_LOCALHOST_E_NOME_DB";
        Connection conn = null;


        try {
            conn = DriverManager.getConnection(urlConnection, "USUARIO_DB", "SENHA_DB");
            System.out.println("Sucesso!");
        } catch (SQLException e) {
            System.out.println("Falha na conexão!");
            e.printStackTrace();
        }
	}

}
