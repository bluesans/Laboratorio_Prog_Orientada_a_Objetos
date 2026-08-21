package holamellamoronaldo;

import java.sql.*;

public class main {

	public static void main(String[] args) {
		try {
			hola.conectar();
			System.out.println("Conectado!");
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}

	}

}
