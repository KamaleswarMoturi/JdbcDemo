import java.sql.*;
public class StudentDao {
	public static boolean deleteStudent(int userId) {
		
		boolean f=false;
		try {
			Connection conn=ConnectionProvider.createC();
			String q="delete from students where id=?";
			PreparedStatement pstmt=conn.prepareStatement(q);
			pstmt.setInt(1,userId);
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
}
 