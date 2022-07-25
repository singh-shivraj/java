package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

//public Player(String name, int run, int wicket, int matches, String country) 

public class playerManagement{
	
	public static ArrayList<Player> createPlayer()
	{
		ArrayList<Player> objArrayList = new ArrayList<>();
		
		Player objPlayer1 = new Player("pranjul"   ,110, 10, 20,"uk", 10);
		Player objPlayer2 = new Player("akshay",200, 10, 20,"uk", 30);
		Player objPlayer3 = new Player("pranjul",160, 10, 20,"uk", 10);
		Player objPlayer4 = new Player("suraj", 170,10, 20,"uk", 50);
		Player objPlayer5 = new Player("Rituraj",10, 10, 20,"uk", 30);
		  
		
		objArrayList.add(objPlayer1);
		objArrayList.add(objPlayer2);
		objArrayList.add(objPlayer3);
		objArrayList.add(objPlayer4);
		objArrayList.add(objPlayer5);
		
		return objArrayList;

	}
	 public static void ShowRecord(ArrayList<Player> al) 
	 {
		// TODO Auto-generated method stub
		 for(Player ele : al)
		 {
			 ele.Display();;
		 }
		 

		 
		 
		 
	}
	 
	public static void DisplayPlayerMaxRun(ArrayList<Player> al)
	{
		int maxrun=0;
		String ename = new String();
		for(Player ele:al)
		{
			if (ele.run > maxrun)
			{
				maxrun = ele.run;
				ename= ele.name;
			}
		}
		System.out.println("Max run is"+ maxrun+ "name is : "+ ename );
	}
	
	
	
	public static ArrayList<Player> sortByName(ArrayList<Player> al)
	{
		SortByName obj = new SortByName();
		Collections.sort(al,obj);
		return al;
	}
	
	public static ArrayList<Player> sortByRun(ArrayList<Player> al)
	{
		SortByRun obj = new SortByRun();
		Collections.sort(al,obj);
		return al;
	}
	
	public static ArrayList<Player> DeleteLessRun(ArrayList<Player> al)
	{
		ArrayList<Player> tempArrayList = new ArrayList<>();
		for(Player ele:al)
		{
			if(ele.run<100)
			{
				tempArrayList.add(ele);
			}
		}	
		
		al.removeAll(tempArrayList);
		return al;
	}
	
//	Update Category ‘A’ if player has got 10 century else update Grade ‘ B’ 
	public static ArrayList<Player> updatebyCentury(ArrayList<Player> al) 
	{
		for(Player ele : al)
		{
			if(ele.century>10)
			{
				ele.Category ='A';
			}
			else {
				ele.Category ='B';
			}
		}
		return al;
		
	}

	public static void searchByName(ArrayList<Player> al)
	{
		Scanner inputScanner =new Scanner(System.in);
		String name = inputScanner.next();
		int Count = 0;
		for(Player ele : al)
		{
			if(ele.name.equals(name))
			{
				Count++;
			}
			
	     }
		System.out.println("pranjul is prents "+Count +"Times");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
