import java.lang.*;

public class CSE extends Department
{
	public String Dept;
	
	public CSE()
	{
		
	}
	public void setDept(String Dept)
	{
		this.Dept=Dept;
	}
	public String getDept()
	{
		return Dept;
	}
	public void DisplayDepartment()
	{
		System.out.println("Your Department is:"+Dept);
	}
}