package package1;

public class Prac5 implements Prac3,Prac4
{

	@Override
	public String sound() 
	{
		
		return "Bow Bow";
	}

	@Override
	public int legs() 
	{
		return 4;
	}
	
	public static void main(String[] args) 
	{
		Prac4 p4 = new Prac5();
	}
	//---------------Change------------------------//

}
