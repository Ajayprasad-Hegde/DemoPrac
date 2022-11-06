package package1;

public class Prac2 extends Prac1
{

	@Override
	String abMethod() 
	{
		return ("OverRidden");
	}
	
	public static void main(String[] args) 
	{
		Prac1 p1 = new Prac2();
		Prac2 p2 = new Prac2();
		p2.nonAbMethod();
		p2.abMethod();
		
		p1.abMethod();
		p1.nonAbMethod();
		
		int y = p1.x;
		
	}

}
