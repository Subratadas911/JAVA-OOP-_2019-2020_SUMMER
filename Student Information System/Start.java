import java.util.Scanner;
import InterfaceC.*;
import java.util.*;


public class Start 
{
	public static void main(String args[])
	{
	
	Scanner input=new Scanner(System.in);
	String StudentName;
    int StudentId;
	double Hight;
	double Weight;
	String Dept;
	
	
	
	
	LoginInfo li=new LoginInfo();
	System.out.println("WELCOME TO YOUR **STUDENT INFORMATION SYSTEM**");
	System.out.println("________-------------____________");
	
    System.out.println("Give Your Student ID");	
	StudentId=input.nextInt();
    li.setStudentId( StudentId);
	System.out.println("Give Your Student Name");
	input.nextLine();
	StudentName=input.nextLine();
	li.setStudentName(StudentName);
	
	li.confirmation();
    
    System.out.println("YOUR NAME IS:"+li.getStudentName())	;
	System.out.println("YOUR ID IS:"+li.getStudentId());
	
	
	
	Human h=new Human();
	System.out.println("Give your Hight in cm");
	Hight=input.nextDouble();
	h.setHight(Hight);
	
	System.out.println("GIVE YOUR WEIGHT IN KG");
	Weight=input.nextDouble();
	h.setWeight(Weight);
	
	 System.out.println("YOUR HIGHT IS:"+h.getHight());
	System.out.println("YOUR WEIGHTIS:"+h.getWeight());
	
	
	CSE cs=new CSE();
	System.out.println("Give your Department");
	input.nextLine();
	Dept=input.nextLine();
	cs.setDept(Dept);
	cs.DisplayDepartment();
	
	Final f1=new Final();
	IslashLine.Disp();
	f1.DisplayInterface();
	
	CourseEnrolled c1=new CourseEnrolled("OOP1");
	CourseEnrolled c2=new CourseEnrolled("Physics2");
	CourseEnrolled c3=new CourseEnrolled("Math4");
	CourseEnrolled c4=new CourseEnrolled("Accounting");
	
	
	ByStudent bs=new ByStudent();
	
	bs.insertCourseEnrolled(c1);
	bs.insertCourseEnrolled(c2);
	bs.insertCourseEnrolled(c3);
	bs.insertCourseEnrolled(c4);
	
	//bs.ShowCourseName();
	
	StudentInfo SI1=new StudentInfo("20-09-1999","NGD","RMG",01313131313,"Dhaka",21);
	
	//SI1.DisplayAllInfo();
	
	Faculty FT1=new Faculty("SIFAT RAHMAN AHONA","PSir","ASir","MMam");
	
	//FT1.showFacultiesName();
	
	
	Semester smstr=new Semester(5);
	
	//smstr.ShowSemesterNo();
	
	
	Validity vdt=new Validity("VALID");
	
	//vdt.ShowValidity();
	
	CGPA cg=new CGPA (4.00);
	//cg.ShowCGPA();
	
	boolean choice = true;
	
	while(choice)
	{
		System.out.println("Choose from the following options: ");
			System.out.println("-----------------------------------------------------------------------------------------------------");
			System.out.println("1. Basic Student Information");
			System.out.println("2. Validity ");
			System.out.println("3. Semester Completed");
			System.out.println("4. The Name of The Enrolled Courses For Current Semester");
			System.out.println("5. The Name Of the Faculty");
			System.out.println("6. Your Current CGPA");
			System.out.println("7. Exit");
			System.out.println("---------------------------------------------------------------------------------------------------\n");
			
			System.out.print("You have choosed: ");
			
			int option = input.nextInt();
			
			switch(option)
			{
				case 1:
				
				System.out.println("*********************************************************************************************************");
				
				
				System.out.println("WELCOME TO YOUR BASIC INFORMATION");
				System.out.println("---------------------------------");
				    SI1.DisplayAllInfo();
				     System.out.println("1. Go Back");
                    System.out.println("*****************************************************************************************************");
                    
					System.out.print("Enter your option: ");
					int input1 = input.nextInt();
					
					switch(input1)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
							
							default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid Choice");
						    System.out.println("#######################");
						    break;
					}
					
					System.out.println("*********************");
				    break;
				
				     

                 case 2:
				 
				 System.out.println("*********************************************************************************************************");
				
				
				System.out.println("WELCOME TO VALIDITY CHECKING SYSTEM");
				System.out.println("---------------------------------");
				 
				      vdt.ShowValidity();
					  
					   System.out.println("1. Go Back");
                    System.out.println("*****************************************************************************************************");
                    
					System.out.print("Enter your option: ");
					int input2 = input.nextInt();
					
					switch(input2)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
							
							default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid Choice");
						    System.out.println("#######################");
						    break;
					}
					
					System.out.println("*********************");
				    break;
					  
					  
					  
					  
					  
				case 3:

                System.out.println("*********************************************************************************************************");
				
				
				System.out.println("WELCOME TO YOUR COMPLETED SEMESTER COUNTING SYSTEM");
				System.out.println("---------------------------------");

				
					smstr.ShowSemesterNo();
					
					
					 System.out.println("1. Go Back");
                    System.out.println("*****************************************************************************************************");
                    
					System.out.print("Enter your option: ");
					int input3 = input.nextInt();
					
					switch(input3)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
							
							default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid Choice");
						    System.out.println("#######################");
						    break;
					}
					
					System.out.println("*********************");
				    break;




				case 4:
				
				
                     System.out.println("*********************************************************************************************************");
				
				
				System.out.println("WELCOME TO YOUR ENROLLED COURSE DISPLAYING SYSTEM");
				System.out.println("---------------------------------");

                    

                     bs.ShowCourseName();
					 
					 
					  System.out.println("1. Go Back");
                    System.out.println("*****************************************************************************************************");
                    
					System.out.print("Enter your option: ");
					int input4 = input.nextInt();
					
					switch(input4)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
							
							default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid Choice");
						    System.out.println("#######################");
						    break;
					}
					
					System.out.println("*********************");
				    break;
					 
					 
					 
					 
				case 5:

                     System.out.println("*********************************************************************************************************");
				
				
				System.out.println("WELCOME TO YOUR FACUTIES NAME DISPLAYING SYSTEM");
				System.out.println("---------------------------------");



                     FT1.showFacultiesName();	


					  System.out.println("1. Go Back");
                    System.out.println("*****************************************************************************************************");
                    
					System.out.print("Enter your option: ");
					int input5 = input.nextInt();
					
					switch(input5)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
							
							default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid Choice");
						    System.out.println("#######################");
						    break;
					}
					
					System.out.println("*********************");
				    break;
				     
				
				
				
				
				
				case 6:
				
				
				System.out.println("*********************************************************************************************************");
				
				
				System.out.println("WELCOME TO CGPA DISPLAYING SYSTEM");
				System.out.println("---------------------------------");
				
				
				
				
				     cg.ShowCGPA();
					 
					 
					  System.out.println("1. Go Back");
                    System.out.println("*****************************************************************************************************");
                    
					System.out.print("Enter your option: ");
					int input6 = input.nextInt();
					
					switch(input6)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
							
							default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid Choice");
						    System.out.println("#######################");
						    break;
					}
					
					System.out.println("*********************");
				    break;
					
					case 7:
					
				    System.out.println("*********************");
				    System.out.println("Exit");
					choice = false;
				    System.out.println("*********************");
				    break;
					
				default:
				    
					System.out.println("*********************");
				    System.out.println("Invalid option");
				    System.out.println("*********************");
				    break;
				    
				
			}
	}
	
	
	     FileReadWrite fd = new FileReadWrite();
	
		System.out.println("*************************************************************************************");
		
		fd.writeInFile("STUDENT INFORMATION SYSTEM");
		
		fd.readFromFile();
		
		System.out.println("*************************************************************************************");
		
		fd.writeInFile(" THANK YOU FOR VISITING STUDENT INFORMATION SYSTEM");
		
		fd.readFromFile();
	
	
	
	
	
	}
	
}