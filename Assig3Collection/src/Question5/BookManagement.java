package Question5;

import java.util.*;
public class BookManagement {
	
	/*
	 * Create a class called Book with the following instance variable 

	name 
	price 
	author name 
	isbn no; 
	publication 

	* Create 5 Objects of book class 
	* Add all the object in to the Map using key as integer(book id) and value as Book Object 
	* Display all the map object using for each 
	* Read any key from the user and display the particular book object based on key 
	* Reduce the price by 10% for a particular publication books and display all object with reduced price. 
	Book(String name, int price, String authorName, int iSBNO, String publication)
	*/
	public static HashMap<Integer,Book> RemoveByName(String aname,HashMap<Integer,Book> hm) 
	{
		int index =0;
		for(Map.Entry<Integer,Book> ele:hm.entrySet())
		{
			
			if(ele.getValue().authorName.equals(aname))
			{
				index= ele.getKey();
				
			}
			
		}
		hm.remove(index);
		return hm;
	}
	
	
	public static HashMap<Integer,Book> reducePriceByPublication(String s, HashMap<Integer,Book>hm) 
	{
		for(Map.Entry<Integer,Book> ele: hm.entrySet())
		{
			
			if(ele.getValue().publication.equals(s))
			{
				int pay= ele.getValue().price;
				int incremented = pay -((pay*10)/100);
				ele.getValue().setPrice(incremented);
				ele.getValue().Display();
			}
		}
		return hm;
		
	}
	
	
	public static HashMap<Integer,Book> CreateBook() 
	{
		Book [] obj = new Book[5];
		HashMap<Integer,Book>hm = new HashMap<>();
		obj[0] = new Book("the ocean", 2000, "b.linkon", 221300, "suraj");
		obj[1] = new Book("the Avenger", 2000, "b.linkon", 221300, "The American");
		obj[2] = new Book("the Carnival", 2000, "shivraj", 221300, "The American");
		obj[3] = new Book("the spiderman", 2000, "b.linkon", 221300, "shivraj");
		obj[4] = new Book("the hulk", 2000, "b.linkon", 221300, "The American");
		
		hm.put(0,obj[0]);
		hm.put(1,obj[1]);
		hm.put(2,obj[2]);
		hm.put(3,obj[3]);
		hm.put(4,obj[4]);
		
		return hm;
	}
	
	
	
	public static void Display(HashMap<Integer,Book > hm) 
	{
		
		for(Map.Entry<Integer,Book> ele :hm.entrySet())
		{
			//Employee obj;
			//obj = ele.getValue();
			System.out.print(ele.getKey()+" ");
			ele.getValue().Display();
			//obj.ShowBook();
		}
		
		//System.out.println(hm.toString());
	}
	
	
	public static void viewBook(int key, HashMap<Integer,Book > hm) 
	{
		System.out.println(hm.get(key));
		
	}
	
	
	public static HashMap<Integer, Book> removeByKey(int key,HashMap<Integer, Book>hm)
	{
		hm.remove(key);
		return hm;	
	}

	
	
}
