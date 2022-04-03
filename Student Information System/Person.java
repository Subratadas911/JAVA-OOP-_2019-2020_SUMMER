import java.lang.*;
public class Person extends LoginInfo
{
	private String Gender;
	private double Age;
	
	public Person()
	{
		
	}
	public void setGender(String Gender)
	{
		this.Gender=Gender;
	}
	public void setAge(double Age)
	{
		this.Age=Age;
	}
	public String getGender()
	{
		return Gender;
	}
	public double getAge()
	{
		return Age;
	}
	 public void NameOfParentClassStudent()
	 {
		 System.out.println("Users Name is:"+getStudentName());
	 }
}  
