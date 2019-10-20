package Exercise5_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmployeeReg {
		
	 List<Employee> list=new ArrayList<Employee>();
	 Scanner input = new Scanner(System.in);
	 
	void insert() {
	
	    
	    	System.out.println("Enter Employee SSn: ");
		    int ssn = input.nextInt();
		    System.out.println("Enter Employee Name ");
		    String sname = input.next();
		    System.out.println("Enter Employee address ");
		    String address = input.next();
		    	 
		    list.add(new Employee(ssn,sname,address));
			
		  
	}
	void display() {
		
		for(Employee emp1:list) { 
			  System.out.println("Employee Details are:");
		   
			  System.out.print(emp1.getSsn()+" "+emp1.getSname()  +" "+emp1.getAddress());
		  }
		System.out.println("\n");
	}
	
	void search() {
		Employee e;
		  Scanner s=new Scanner(System.in);
		  System.out.println("ENTER THE EMPLOYEE NUMBER TO FIND");
		  boolean find=false;
		  int i=0;
		 int  id=s.nextInt();
		 while(i<list.size() && find==false) {
				e=list.get(i);
				if(e.getSsn()==id)
				{
					System.out.print(e.getSsn()+" "+e.getSname()+ " "+e.getAddress() ); 		
					find=true;
					 break;
		    	  }
				
				i++;
		 }
				
					if(find==false)
					{
						System.out.println("Record does'nt exist");
					}
		 
		
	}
		  
		  
		  void delete()
		  {
			  Employee e;
			  Scanner s=new Scanner(System.in);
			  System.out.println("Enter the employee id to delete");
			 int  id=s.nextInt();
			 
			 /*int idCheck = list.indexOf(id);*/
			 int i=0;
			 boolean find=false;
			 //list.removeIf( name -> name.equals("alex"));
			 while(i<list.size() && find==false) {
				e=list.get(i);
				if(e.getSsn()==id)
				{
					list.remove(i);
					find=true;
				}
				i++;
				 
			 }
			  
		/*
		 * System.out.println(idCheck); if (idCheck > 0){ //id = list.indexOf(id);
		 * 
		 * list.remove(id); } else { System.out.println("employee not exist"); }
		 */
		  }

		public void update() {
			Employee e;
			int i=0;
			  Scanner s=new Scanner(System.in);
			  System.out.println("enter the SSN to be updated");
			 int  id=s.nextInt();
			 System.out.println("enter the name to update");
				String name=s.next();
			 while(i<list.size() ) {
					e=list.get(i);
					if(e.getSsn()==id) {
						
						e.setSname(name);
						break;
					}
			 }
			 
			
		}
}

	    		

	




