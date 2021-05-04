package Pkg_InheritanceWithConstructor;

public class Day4_Assignmant1_InheritanceWithConstructor_Child extends Day4_Assignmant1_InheritanceWithConstructor_Parent
{
	public Day4_Assignmant1_InheritanceWithConstructor_Child()
	{
		super(1,2);
		System.out.println("Child default constructor");
	}
	
	public Day4_Assignmant1_InheritanceWithConstructor_Child(int a)
	{
		this(1,2,3);
		System.out.println("Child One parameterized constructor");
	}

	public Day4_Assignmant1_InheritanceWithConstructor_Child(int a, int b)
	{
		this(1);
		System.out.println("Child Two parameterized constructor");
	}

	public Day4_Assignmant1_InheritanceWithConstructor_Child(int a, int b, int c)
	{
		this();
		System.out.println("Child Three parameterized constructor");
	}

	public Day4_Assignmant1_InheritanceWithConstructor_Child(int a, int b, int c, int d)
	{
		
		this(4,5);
		
		System.out.println("Child Four parameterized constructor");
	}
	
	public static void main(String[] args) {
		Day4_Assignmant1_InheritanceWithConstructor_Child aks = new Day4_Assignmant1_InheritanceWithConstructor_Child(1,2,4,8);
	}
}
