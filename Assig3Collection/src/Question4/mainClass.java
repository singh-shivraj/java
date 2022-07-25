package Question4;
import java.util.LinkedList;

public class mainClass {
	
	public static LinkedList<Integer> CreateLinkedlist()
	{
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(10);
		ll.add(70);
		ll.add(5);
		ll.add(50);
		ll.add(20);
		
		System.out.println("Adding data to linked list is sucessfull");
		return ll;
	}
	
	
	public static void ViewLinkedlist(LinkedList<Integer> ll)
	{
		System.out.println("Showing linked list");
		int i=0;
		for(Integer ele:ll)
		{
			System.out.println(ele);
			i++;
		}
		
	}
	
	 public static LinkedList<Integer> InsertBeginning(LinkedList<Integer> ll,int data)
	 {
		 ll.addFirst(data);
		 return ll;
	 }
	
	 public static LinkedList<Integer> InsertAt(LinkedList<Integer> ll ,int index,int data)
	 {
		 System.out.println("adding at: "+index+" data: "+data);
		 ll.add(index, data);
		 return ll; 
	 }
	 
	 public static LinkedList<Integer> InsertAfter(LinkedList<Integer> ll,int var,Integer data)
	 {
		 int index=0;
		 for(Integer ele:ll)
		 {
			 if(ele==var)
			 {
				 
				 ll.add(index,var);
			 }
			 index++;
		
		 }
		 return ll;
	 }
	 public static LinkedList<Integer> DeleteFirst(LinkedList<Integer> ll)
	 {
		 int count = ll.removeFirst();
		 System.out.println("first data removed:" +count);
		 return ll;
	 }
	 
	 public static LinkedList<Integer> DeleteNode(LinkedList<Integer> ll,int index)
	 {
		 
		 int data=ll.remove(index);
		 System.out.println("data rmoved at: "+index+"Data: "+data);
		 return ll;
	 }
	 
	 public static LinkedList<Integer> DeleteAfter(LinkedList<Integer> ll ,Integer node)
	 {
		 for(Integer ele:ll)
		 {
			 if(ele.equals(node))
			 {
				 ll.remove(node);
			 }
		 }
		 return ll;
	 }
	 
	 
	public static void main(String[] args) {
		
		LinkedList<Integer> ll;
		ll=CreateLinkedlist();
		
		System.out.println();
		ViewLinkedlist(ll);
		
//		System.out.println();
//		System.out.println("Adding data 30 at first");
//		InsertBeginning(ll,30);
//		ViewLinkedlist(ll);
//		
//		
//		System.out.println();
//		InsertAt(ll, 3, 55);
//		ViewLinkedlist(ll);
//		
////		System.out.println("Adding data");
////		InsertAfter(ll,70,66);
////		ViewLinkedlist(ll);
//		
//		System.out.println();
//		DeleteFirst(ll);
//		ViewLinkedlist(ll);
//		
//		System.out.println();
//		DeleteNode(ll, 3);
//		ViewLinkedlist(ll);
		
		DeleteAfter(ll,70);
		ViewLinkedlist(ll);
		
	}

}
