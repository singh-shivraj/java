package Question5;

import java.util.HashMap;

public class MainClass {
	public static void main(String[] args)
	{
		System.out.println("Displaying all elements in hash");
		HashMap<Integer,Book> hm;
		hm= BookManagement.CreateBook();
		BookManagement.Display(hm);
		System.out.println(" ");
		
		System.out.println("Showing index 3 book");
		BookManagement.viewBook(3,hm);
		
//		System.out.println(" ");
//		System.out.println("Removing 2nd index book");
//		BookManagement.removeByKey(2, hm);
//		BookManagement.Display(hm);
////		
		System.out.println(" ");
		System.out.println("reducting price of book of shivraj");
		hm=BookManagement.reducePriceByPublication("shivraj", hm);
		//Display(hm);
		
		System.out.println(" ");
		System.out.println("Removing shivraj  book");
		hm = BookManagement.RemoveByName("shivraj", hm);
		BookManagement.Display(hm);
	}

}
