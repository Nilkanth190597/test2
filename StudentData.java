import java.util.Scanner;

 class Student 
{
	
	int id;
	String name;
	String collage;

	
	 void getdata()
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter emp. id :");
		 id = sc.nextInt();
		 System.out.println("enter the name :");
		 sc.nextLine();
		 name=sc.nextLine();
		 System.out.println("enter the collage :"); 
		 collage =sc.next();
		 
	 }
	 void showdata()
	 {
		 System.out.println("Employee id :"+id);
		 System.out.println("Employee name :"+name);
		 System.out.println("Employee designation :" +collage);
		  
	 }
}
class StudentData
{
	static
	{
		System.out.println("student information");
		
	}
 public static void main(String args[])
 {
	 Student e[] = new Student[2];
     

     for(int i=0;i<2;i++)
     {
    	 e[i] =  new Student();  
         e[i].getdata();
     }
     System.out.println("\n Details of Empl\n");
     for(int i=0;i<2;i++)
         e[i].showdata();
     
     
	 
 }
}
