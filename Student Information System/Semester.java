import java.lang.*;

public class Semester extends LoginInfo
{
	private int SemesterNo;
	
	public Semester()
	{
		
	}
	public Semester(int SemesterNo)
	{
		this.SemesterNo=SemesterNo;
	}
	public void setSemesterNo(int SemesterNo)
	{
		this.SemesterNo=SemesterNo;
	}
	public int getSemesterNo()
	{
		return SemesterNo;
	}
	public void ShowSemesterNo()
	{
		System.out.println("YOUR IN SEMESTER NUMBER:"+SemesterNo);
	}
}