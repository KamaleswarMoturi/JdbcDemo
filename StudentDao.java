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

	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		try {
			Connection conn=ConnectionProvider.createC();
			String q="insert into students(name,phone,city) values(?,?,?)";
			PreparedStatement pstmt=conn.prepareStatement(q);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());

			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}