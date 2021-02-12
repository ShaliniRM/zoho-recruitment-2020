import java.util.*;
public class PatternPrint {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//Input String
		String input = in.nextLine();
		
		//Find middle position
		int mid = input.length()/2;
		//Length of the string
		int length = input.length();
		for(int i=0;i<length;i++)
		{
			//Print space
			for(int j=0;j<(length-(i+1));j++)
				System.out.print(" ");
			//Print letter
			for(int k=mid, l=0;l<(i+1);k++,l++)
			{
				//Wrap the index 
				if(k>=length)
					k=k%length;
				System.out.print(input.charAt(k) );
			}
			//Go to new line
			System.out.println();
		}
	}
}
