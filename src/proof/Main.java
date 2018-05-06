package proof;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number [] = new int [100];
		for (int i=1;i<=100;i++)
		{
			number[i-1] = i;
		}
		String answer [] = Multiples.multiplesThreeFive(number);
		
		System.out.println(Arrays.toString(answer));
	}
}
