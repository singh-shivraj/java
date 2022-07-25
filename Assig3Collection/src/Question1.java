import java.util.*;  
/*
a)	Add element
b)	Remove a particular element
c)	Modify
d)	View All elements(Use Iterator)
e)	View a Particular element (get() )
f)	Sort (Collections.sort)
*/

public class Question1 { 
	
	public static ArrayList<Integer> Modify (ArrayList<Integer> al)
	{
		int i=0;
		for(int ele: al)
		{
		
			int value=ele+100;
			al.set(i,value);
			i++;
		}
		return al;
	}

	
	public static void view(ArrayList<Integer> al) 
	{
		for(int ele: al)
		{
			System.out.println(ele);
		}
	}
	public static void showElement(ArrayList<Integer> al,int index)
	{
		int element = al.get(index);
		System.out.println("showing the 3rd Elemnt :" + element);
	}
	
	public static ArrayList<Integer> sortArray(ArrayList<Integer> al)
	{
		Collections.sort(al);
		return al;
	
	}
	
	public static ArrayList<Integer> insertAt(ArrayList<Integer> al,int num,int data)
	{
		al.add(al.indexOf(num)+1,data);
		return al;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<>();
		al.add(10);
		al.add(99);
		al.add(30);
		al.add(35);
		al.add(60);
		
		System.out.println("Elements are added");
		view(al);
				
//		System.out.println("Removing element");
//		al.remove(3);
//		System.out.println("element Removed");
		
		view(al);
		showElement( al,3);
		
		System.out.println();
		System.out.println("Elements are sorted");
		sortArray(al);
		
		view(al);
		
		System.out.println("After update");
		Modify(al);
		view(al);
		
		System.out.println();
		System.out.println("adding 60 after 30");
		 insertAt(al,130,60);
		 view(al);
	}

}
