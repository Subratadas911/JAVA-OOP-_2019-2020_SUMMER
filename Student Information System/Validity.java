import java.lang.*;
public class Validity extends LoginInfo
{
	private String ValidOrNot;
	
	public Validity()
	{
		
	}
	public Validity(String ValidOrNot)
	{
		this.ValidOrNot=ValidOrNot;
	}
	public void chkValidity(String ValidOrNot)
	{
		this.ValidOrNot=ValidOrNot;
	}
	public String getValidity()
	{
		return ValidOrNot;
	}
	public void ShowValidity()
	{
		System.out.println("YOU ARE "+ValidOrNot);
	}
}