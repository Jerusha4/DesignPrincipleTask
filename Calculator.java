import java.util.*;
class Calculator
{
	public static int Add(int a,int b)
	{
		return a+b;
	}
	public static int Sub(int a,int b)
	{
		return a-b;
	}
	public static int Mul(int a,int b)
	{
		return a*b;
	}
	public static int Div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		System.out.println("=====Simple Calculator=====");
		while(true)
		{
			System.out.println("Enter First Number : ");
			int a=sc.nextInt();
			System.out.println("Enter Second Number : ");
			int b=sc.nextInt();
			System.out.println("1.Addition\t2.Subtraction\t3.Multiplication\t4.Division\t5.exit");
			System.out.println("Enter your choice : ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1 : System.out.println("Addition of "+a+" and "+b+" is "+Add(a,b));
						 break;
				case 2 : System.out.println("Subtraction of "+a+" and "+b+" is "+Sub(a,b));
						 break;
				case 3 : System.out.println("Multiplication of "+a+" and "+b+" is "+Mul(a,b));
						 break;
				case 4 : System.out.println("Division of "+a+" and "+b+" is "+Div(a,b));
						 break;
				default: System.out.println("Invalid Choice");
						 flag=true;
						 return;
			}
		}
	}
}