package week1.day2;

public class MissingElement {

	public static void main(String[] args) 
	{
		int array[] = {1,2,3,4,7,6,8};
		for(int i=0;i<array.length;i++)
		{
			int num = i+1;
			if(array[i]!=num)
			{
				System.out.println("Missed number is "+num);
				break;
			
			}
		}
	}

}
