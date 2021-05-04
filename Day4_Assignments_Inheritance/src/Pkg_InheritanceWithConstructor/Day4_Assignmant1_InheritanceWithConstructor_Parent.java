package Pkg_InheritanceWithConstructor;

public class Day4_Assignmant1_InheritanceWithConstructor_Parent 
{
	public Day4_Assignmant1_InheritanceWithConstructor_Parent()
	{
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	
	public Day4_Assignmant1_InheritanceWithConstructor_Parent(int a)
	{
		this();
		System.out.println("Parent One parameterized constructor");
	}

	public Day4_Assignmant1_InheritanceWithConstructor_Parent(int a, int b)
	{
		this(12,13,14,15);
		System.out.println("Parent Two parameterized constructor");
	}

	public Day4_Assignmant1_InheritanceWithConstructor_Parent(int a, int b, int c)
	{
		
		System.out.println("Parent Three parameterized constructor");
	}

	public Day4_Assignmant1_InheritanceWithConstructor_Parent(int a, int b, int c, int d)
	{
		this(34);
		System.out.println("Parent Four parameterized constructor");
	}
	

}
