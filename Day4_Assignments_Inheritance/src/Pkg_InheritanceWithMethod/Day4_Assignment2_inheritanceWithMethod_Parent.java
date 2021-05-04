package Pkg_InheritanceWithMethod;

public class Day4_Assignment2_inheritanceWithMethod_Parent 
{
	public void method()
	{
		System.out.println("Parent Default method");
		this.method4(1,2,3,4);
		this.method1(23);
		this.method2(2, 4);
		this.method3(45, 65, 34);
	}
	
	public void method1(int a)
	{
		System.out.println("Parent 1 parameterized method");
	}
	
	public void method2(int a, int b)
	{
		System.out.println("Parent 2 paramterized method");
	}
	
	public void method3(int a, int b, int c)
	{
		System.out.println("Parent 3 parameterized method");
	}
	
	public void method4(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 parameterized method");
	}
	
}
