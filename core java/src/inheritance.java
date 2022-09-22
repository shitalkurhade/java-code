
public class inheritance {
	class A
	{
       int x = 30;
       void display()
       {
    	   System.out.println("X");
       }
	}
	class C extends A
	{
		int b = 50;
		void display()
		{
			System.out.println("Y");
		}
	}
	class CChild extends C
	{
		int c = 70;
		void show()
		{
			System.out.println("Z");
		}
	}
	class MultipleInheritance
	{
		public static void main(String args[])
		{
			CChild obj= new CChild();
			System.out.println(obj.c)
			obj.show();
		
		
	
		}
    }
}   


