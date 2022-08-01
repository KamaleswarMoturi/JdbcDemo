import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class Start {

	public static void main(String[] args)throws IOException  {
		System.out.println("welocome to student Management app"); 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.println("press 1 to Add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit student app"); 
			int choice=Integer.parseInt(br.readLine());
			if(choice==1)
			{
				System.out.println("Enter student name : ");
				String name=br.readLine();
				System.out.println("Enter student phone : ");
				String   phone=br.readLine();
				System.out.println("Enter student city : ");
				String city=br.readLine();
				Student st=new Student(name, phone, city);
				boolean ans=StudentDao.insertStudentToDB(st);
				System.out.println(st);
				System.out.println(ans +" query performed");
			
				
			}else if(choice==2)
			{
				System.out.println("enter student id who you want to delete");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				System.out.println("deleted succcesfully  "+f);
			}else if(choice==3)
			{
				
			}else if(choice==4)
			{
				break;
			}else
			{
				System.out.println("please enter valid choice");
			}
			
		}
		System.out.println("you exited the program ");

	}

}
