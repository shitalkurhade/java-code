import java.io.Console;

public class ConsoleClassDemo {
public static void main(String[] args) {
	Console c = System.console();
	System.out.println("Enter the desired password: ");
	char[] ch=c.readPassword();
	//converting all the character values of array into string
	String pass=String.valueOf(ch);
	//Then printing all the values
	System.out.println("password is: "+pass);
	
   }

}
