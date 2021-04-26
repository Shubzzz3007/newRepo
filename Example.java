class A
 {   
	public void f1()
    {
		System.out.println("I'm in A");
	}	
 } 
 
 class B extends A
 {   
	
	/*public static void f1()
    {
		System.out.println("I'm in A");
	}*/
	
	
	public void f2()
    {
		System.out.println("I'm in B");
	}	
 } 
 
public class Example
{
	public static void main(String[] args)
	{
		B b = new B();
		b.f1();
		
	}
}
 
 
 
 
 
 
 
 