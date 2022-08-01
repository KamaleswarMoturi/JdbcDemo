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
				
			}else if(choice==2)
			{
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
