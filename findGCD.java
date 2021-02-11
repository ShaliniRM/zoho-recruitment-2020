
public class findGCD {
	public static int GCD(int num1, int num2)
	{
		if(num1 == num2)
			return num1;
		for(int i = Math.min(num1, num2)/2 ; i>1 ; i-- )
		{
			if((num1 % i == 0) && (num2 % i == 0))
				return i;
		}
		return 1;
	}
	public static void main(String[] args)
	{
		int num1 = 18, num2 = 18;
		System.out.println(GCD(num1, num2));
	}
}
