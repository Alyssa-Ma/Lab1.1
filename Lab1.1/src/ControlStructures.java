//Alyssa Ma
//Period 2
//Lab 1.1
//Patch 10/1/17

public class ControlStructures 
{
	public static void main (String [] args)
	{
		primePrinter();
		fooBarBaz();
		System.out.println("Fishy save me!");
	}
	public static boolean isPrime(int x)
	{
		if(x % 2 == 0 && x != 2)
		{
			return false;
		}
		if(x % 3 == 0 && x != 3)
		{
			return false;
		}
		if(x % 5 == 0 && x != 5)
		{
			return false;
		}
		if(x % 7 == 0 && x != 7)
		{
			return false;
		}
		if(x % 11 == 0 && x != 11)
		{
			return false;
		}
		return true;
	}
	public static void primePrinter()
	{
		int count = 0;
		for(int a = 2; count <= 50; a++)
		{
			if(isPrime(a) == true)
			{
				System.out.println(a + " ");
			}
			{
				count++;
			}
		}
			
	}
	public static String fooBarBazString(int f)
	{
		String foopls = "";
		if(f % 3 == 0)
		{
			foopls += "foo";
		}
		if(f % 7 == 0)
		{
			foopls += "Bar";
		}
		if(f % 10 == 0)
		{
			foopls += "Baz";
		}
		return foopls;
	}
	public static void fooBarBaz()
	{
		for(int y = 1; y <= 500; y++)
		{
			if(fooBarBazString(y).length() == 0)
			{
				System.out.println(y + " ");
			}
			else
			{
				System.out.println(fooBarBazString(y) + " ");
			}
	}
	
}
}
