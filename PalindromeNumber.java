package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		int num = 34343;
		int rem,sum = 0;
		int temp = num;
		while(num>0)
		{
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(temp==sum)
			System.out.println("Palindrome number");
		else
			System.out.println("It's not a palindrome number");
	}

}
