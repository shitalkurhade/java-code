/**
 * 
 */
 import java.util.*;
 public class StudentList{
	public static void main(String[] args)
	{
		ArrayList<String> arrlist = new ArrayList<String>();
		
		//adding elements  to arrlist
		arrlist.add("I");
		arrlist.add("love");
		arrlist.add("playing");
		arrlist.add("games");
		
		
		//using listIterator()method
		ListIterator<String> iterator = arrlist.listIterator();
		
		//printing the elements value in forward direction
		while (iterator.hasnext()){
			System.out.println("value are : " + iterator.next());
		}
		ListIterator<String> iterator2 = arrlist.listIterator();
		
		
		//printing the elements value in reverse direction
		while (iterator.hasnext()){
			System.out.println("value are : " + iterator.next());
		}
	}
}