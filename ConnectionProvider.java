import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection conn;
	public static Connection createC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			String url=  "jdbc:mysql://localhost:3306/student_manage";
			String username="root";
			String password="9441753360K@m@l";
			 conn=DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}  
}
