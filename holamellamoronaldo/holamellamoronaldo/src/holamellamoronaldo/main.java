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
	public void InsertarDato() throws SQLException{
		String SQL = "Insert into user (nombre,apellido) values (?,?)";
		
		try(PreparedStatement ps = hola.conectar().prepareStatement(SQL)) {
			ps.setString(1, "Santiago");
			ps.setString(2, "Molina");
			System.out.println("funciono");
		}
		
	}
}
