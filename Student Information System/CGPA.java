import java.lang.*;

public class CGPA extends LoginInfo
{
	private double cgpa;
	
	public CGPA()
	{
		
	}
	public CGPA(double cgpa)
	{
		this.cgpa=cgpa;
	}
	public void setCGPA(double cgpa)
	{
		this.cgpa=cgpa;
	}
	public double getCGPA()
	{
		return cgpa;
	}
	public void ShowCGPA()
	{
		System.out.println("YOUR CURRENT CGPA IS :"+cgpa);
	}
}