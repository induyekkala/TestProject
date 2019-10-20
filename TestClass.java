package Exercise5_0;
import java.util.Scanner;
public class TestClass {


	
	public static void main(String args[]) {  
		  
		EmployeeReg ts=new EmployeeReg();
		Scanner y=new Scanner(System.in);
		 char p=' ';
		//int p=0;
			  
			  do {
				  System.out.println("----MENU-----");
					System.out.println("1.insert"+"\n"+ "2.delete"+"\n"+"3.display"+"\n"+"4.search"+"\n" +"5.update");
					System.out.println("Enter your choice ");
					
					 int ch=y.nextInt();
					
					switch(ch)
					{
					case 1:ts.insert();
							break;
					case 2:ts.delete();
							break;
					case 3:ts.display();
							break;
					case 4:ts.search();
							break;
					case 5:ts.update();
							break;
					default:System.out.println("wrong choice");
					break;
					
					}
				System.out.println("\nwould want to continue or not press Y to continue else N to exit");
				 
				p=y.next().charAt(0);	
				 
				System.out.println("\n");
					
				}while(p!='n');
		
		
	}
		    
		    
		}


