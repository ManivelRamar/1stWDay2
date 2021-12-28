package week1.day2;

import java.util.Arrays;

public class SecondSmallNumber {

	public static void main(String[] args) 
	{
		int newArray[] = {23,45,67,32,89,22};
		Arrays.sort(newArray);
		System.out.println("The second smallest number from the array is "+newArray[1]);
	}

}
