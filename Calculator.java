import java.util.*;
class Calci
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
}
class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		Calci obj=new Calci();
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
				case 1 : System.out.println("Addition of "+a+" and "+b+" is "+obj.Add(a,b));
						 break;
				case 2 : System.out.println("Subtraction of "+a+" and "+b+" is "+obj.Sub(a,b));
						 break;
				case 3 : System.out.println("Multiplication of "+a+" and "+b+" is "+obj.Mul(a,b));
						 break;
				case 4 : System.out.println("Division of "+a+" and "+b+" is "+obj.Div(a,b));
						 break;
				default: System.out.println("Invalid Choice");
						 flag=true;
						 return;
			}
		}
	}
}
