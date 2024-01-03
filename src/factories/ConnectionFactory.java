package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection getConnection() throws Exception {
		
		// Parâmetros para conexão com o banco de dados
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/bd_projetojava04postg";
		String user = "postgres";
		String password = "coti";
		
		// Abrindo conexão com o banco de dados
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);

	}
}