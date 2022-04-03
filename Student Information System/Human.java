import java.lang.*;
public class Human extends LoginInfo
{
	private double Hight;
	private double Weight;
	
	
	public Human()
	{
		
	}
	
	public void setHight(double Hight)
	{
		this.Hight=Hight;
	}
	public void setWeight(double Weight)
	{
		this.Weight=Weight;
	}
	
	
	public double getHight()
	{
		return Hight;
	}
	public double getWeight()
	{
		return Weight;
	}
	
}