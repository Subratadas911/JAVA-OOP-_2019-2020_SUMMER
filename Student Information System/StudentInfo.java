import java.lang.*;
public class StudentInfo extends LoginInfo
{
	private String DOB;
	private String FathersName;
	private String MothersName;
	private int MobNO;
	private String Address;
	private String gender;
	private int age;
	
	
	public StudentInfo()
	{
		
	}
	public StudentInfo(String DOB,String FathersName,String MothersName,int MobNO,String Address,int age)
	{
		this.DOB=DOB;
		this.FathersName=FathersName;
		this.MothersName=MothersName;
		this.MobNO=MobNO;
		this.Address=Address;
		this.age=age;
	}
	public void setDOB(String DOB)
	{
		this.DOB=DOB;
	}
	public void setFathersName(String FathersName)
	{
		this.FathersName=FathersName;
	}
	public void setMothersName(String MothersName)
	{
		this.MothersName=MothersName;
	}
	
	public void setMobNO(int MobNO)
	{
		this.MobNO=MobNO;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	public String getDOB()
	{
		return DOB;
	}
	public String getFathersName()
	{
		return FathersName;
	}
	public String getMothersName()
	{
		return MothersName;
	}
	
	public int getMobNO()
	{
		return MobNO;
	}
	public String getAddress()
	{
		return Address;
	}
	public void DisplayAllInfo()
	{
		System.out.println("YOUR DATE OF BIRTH IS:"+DOB);
		System.out.println("YOUR FATHERS NAME  IS:"+FathersName);
		System.out.println("YOUR MOTHERS NAME  IS:"+MothersName);
		System.out.println("YOUR MOBILE NUMBER IS:"+MobNO);
		System.out.println("YOUR ADDRESS  IS:"+Address);
		System.out.println("YOUR AGE  IS:"+age);
	}
	
}