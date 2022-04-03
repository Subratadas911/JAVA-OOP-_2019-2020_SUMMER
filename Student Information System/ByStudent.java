import java.lang.*;

public class ByStudent
{
	CourseEnrolled ce[]=new CourseEnrolled[4];
	
	public ByStudent()
	{
		
	}
	public void insertCourseEnrolled(CourseEnrolled course)
	{
		for(int i=0;i<ce.length;i++)
		{
			if(ce[i]==null)
			{
				ce[i]=course;
				
				break;
				
			}
		}
	}
	public void ShowCourseName()
	{
		for(int i=0;i<ce.length;i++)
		{
			if (ce[i]!=null)
			{
				
				System.out.println("Course name is : "+ce[i].getCourseName());
			}
		}
	}	
}