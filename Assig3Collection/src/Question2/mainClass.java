package Question2;

import java.util.ArrayList;

/*
* Create 5 Players  add into the Array List 
* Display the player details who has scored maximum no of runs 
* Sort the players by name 
* Remove the player who has scored less than 100 runs 
* Update Category ‘A’ if player has got 10 century else update Grade ‘ B’ 
*/

public class mainClass {
	public static void main(String [] args)
	{
	ArrayList<Player> obj;
	obj = playerManagement.createPlayer();
	System.out.println("Object is Created");
	
	
	System.out.println("Displaying scored less than run 100");
	playerManagement.DisplayPlayerMaxRun(obj);
	
	System.out.println(" ");
	playerManagement.ShowRecord(obj);
	
	System.out.println(" ");
	System.out.println("After deletion of 100 less runs");
	playerManagement.DeleteLessRun(obj);
	
	playerManagement.ShowRecord(obj);
	
	playerManagement.updatebyCentury(obj);
	System.out.println(" ");
	playerManagement.ShowRecord(obj);
	System.out.println(" ");
	
	System.out.println("searching name");
	playerManagement.searchByName(obj);
	
//	System.out.println("after sort");
//	playerManagement.sortByRun(obj);
////	playerManagement.sortByName(obj);
//	
//	playerManagement.ShowRecord(obj);
//	
	}

}


















