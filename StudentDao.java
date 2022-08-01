import java.sql.*;
public class StudentDao {

	
    public static void showAllStudents() {
		
		try {
			Connection conn=ConnectionProvider.createC();
			String q="select * from students";
			Statement stmt=conn.createStatement();
			ResultSet set=stmt.executeQuery(q);
			System.out.println("id     "+"name     "+"phone    "+"city   ");
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city =set.getString(4);
				System.out.print(id);
				System.out.print("     ");
				System.out.print(name);
				System.out.print("   ");
				System.out.print(phone);
				System.out.print(" ");
				System.out.print(city);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
}

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

