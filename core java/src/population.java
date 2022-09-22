
public class population {
	public static void main(String[] args)
	{
		float beginning = 175000;
		float current=262500;
		float time = 10;
		float difference = current - beginning;
		float PG= difference/beginning*100;
		float PGR= PG/time;
		System.out.println("The Population Growth Rate is "+PGR+"% per year");
		
		
		
	}

}
