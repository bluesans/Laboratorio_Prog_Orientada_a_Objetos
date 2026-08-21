package holamellamoronaldo;

import java.sql.*;

public class hola {
	
	private static final String url = "jdbc:mysql://localhost:3306/holamellamoronaldo?useSSL=False&serverTimezone=UTC";
	private static final String user = "root";
	private static final String password = "";

	public static Connection conectar() throws SQLException{
		return DriverManager.getConnection(url, user , password);
	}
}
