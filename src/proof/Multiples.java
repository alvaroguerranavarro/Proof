package proof;

public class Multiples {

	public static String [] multiplesThreeFive(int number [])
	{
		String result [] = new String [number.length];
		for (int i=0;i<number.length;i++)
		{
			String aux ="";
			if (number[i]%3==0)
			{
				aux +="Fizz";
			}
			if (number[i]%5==0)
			{
				aux +="Buzz";
			}
			if (aux.equals(""))
			{
				aux = Integer.toString(number[i]);
			}
			result[i]=aux;
		}
		return result; 
	}
}
