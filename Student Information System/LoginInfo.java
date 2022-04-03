import java.lang.*;

public class LoginInfo

{
	private String StudentName;
	private int StudentId;
	
	public LoginInfo()
	{
		
	}
	public void setStudentName(String StudentName)
	{
		this.StudentName=StudentName;
	}
	public void setStudentId(int StudentId)
	{
		this.StudentId=StudentId;
	}
	public String getStudentName()
	{
		return StudentName;
	}
	public int getStudentId()
	{
		return StudentId;
	}
	public void confirmation()
	{
		if (StudentName != null )
			{
				System.out.println("Your Login Information is added now you can see and customize further");
				
			}
	}
}