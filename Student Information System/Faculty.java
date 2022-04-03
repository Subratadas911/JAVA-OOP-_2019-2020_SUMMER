import java.lang.*;

public class Faculty
{
	private String FacultyOfJava;
	private String FacultyOfPhy;
	private String FacultyOfAccounting;
	private String FacultyOfMath;
	
	public Faculty()
	{
		
	}
	public Faculty(String FacultyOfJava,String FacultyOfPhy,String FacultyOfAccounting,String FacultyOfMath)
	{
		this.FacultyOfJava=FacultyOfJava;
		this.FacultyOfPhy=FacultyOfPhy;
		this.FacultyOfAccounting=FacultyOfAccounting;
		this.FacultyOfMath=FacultyOfMath;
	}
	public void FacultyOfJavaIS()
	{

	}
	public void setFacultyOfJavaIS(String FacultyOfJava)
	{
		this.FacultyOfJava=FacultyOfJava;
	}
	public String getFacultyOfJavaIS()
	{
		return FacultyOfJava;
	}
	public void showFacultiesName()
	{
		System.out.println("YOUR OOP1(JAVA) FACUTIES NAME IS:"+FacultyOfJava);
				System.out.println("YOUR PHYSICS FACUTIES NAME IS:"+FacultyOfPhy);
				System.out.println("YOUR ACCOUNTING FACUTIES NAME IS:"+FacultyOfAccounting);
				System.out.println("YOUR MATH FACUTIES NAME IS:"+FacultyOfMath);
	}
}