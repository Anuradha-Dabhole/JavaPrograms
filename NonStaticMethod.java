package basicprogram;

public class NonStaticMethod {
	void addition()
	{
	System.out.println("Hii");
	}

	public static void main(String[] args) {
		NonStaticMethod n1 = new NonStaticMethod();
		n1.addition();
		System.out.println("Hello");
		
	}

}
