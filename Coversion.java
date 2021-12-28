package week1.day2;

public class Coversion {

	public static void main(String[] args) 
	{
		int negNum = -56;
		if(negNum<0)
		{
			int negNum1 = negNum * -1;
			System.out.println("This is negative number");
			System.out.println("The number "+negNum+" converted to positive number "+negNum1);
		}
		else if(negNum>0)
		{
			System.out.println("The number "+negNum+" is a positive one");	
		}
		else
		{
			System.out.println("The number is neither positive or negative");
		}
	}

}
