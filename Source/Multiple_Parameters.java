import java.util.*;

class Multiple
{
	public static int[] Parameters(int... parameters)
	{
		for(int i = 0; i < parameters.length; i++)
		{
			parameters[i] *= 100;
		}

		return parameters;
	}
}

class MultipleParameters
{
	public static void main(String args[])
	{
		int[] array = Multiple.Parameters(1,2,3,4,5,6,7,8,9,10);

		for(int x : array)
		{
			System.out.print(x + " ");
		}
	}
}