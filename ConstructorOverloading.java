package basicprogram;

public class ConstructorOverloading {
	
	ConstructorOverloading()
	{
		System.out.println("Constructor");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("2nd");
	}
	public static void main(String[] args) 
	{
		new ConstructorOverloading();
		 new ConstructorOverloading(300);

	}

}
