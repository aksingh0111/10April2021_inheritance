package Pkg_InheritanceWithMethod;

public class Day4_Assignment2_inheritanceWithMethod_Child extends Day4_Assignment2_inheritanceWithMethod_Parent
{
	public void method()
	{
		super.method();
		System.out.println("Child Default method");
		this.method4(1, 2, 3, 4);
		this.method3(4, 5, 9);
		this.method1(8);
		this.method2(9, 10);
	}
	
	public void method1(int a)
	{
		System.out.println("Child 1 Parameterized method");
	}
	
	public void method2(int a, int b)
	{
		System.out.println("Child 2 parameterized method");
	}
	
	public void method3(int a, int b, int c)
	{
		System.out.println("Child 3 parameterized method");
	}
	
	public void method4(int a, int b,int c,int d)
	{
		System.out.println("Child 4 parameterized method");
	}
	
	public static void main(String[] args) {
		Day4_Assignment2_inheritanceWithMethod_Child aks = new Day4_Assignment2_inheritanceWithMethod_Child();
		aks.method();
	}
}
