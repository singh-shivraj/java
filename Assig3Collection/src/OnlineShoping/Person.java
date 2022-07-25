package OnlineShoping;

import java.util.ArrayList;

/*
A shopping cart is a collection of items 
selected by a customer for purchase. A user can 
add items to the cart, remove them, empty the cart, 
view the items in the cart, view the items in the shop, 
and end shopping and proceed to checkout.(using arraylist) 
*/

public class Person 
{
	
	
	public static ArrayList<String> addToCart(ArrayList<String> cart,String product)
	{
		
		cart.add(product);
		return cart;
	}
	public static ArrayList<String> remove(ArrayList<String> al,String s)
	{
		al.remove(s);
		return al;
	}
	public static void ShowCart(ArrayList<String> al)
	{
		System.out.println(al.toString());
	}
	public static ArrayList<String> emptyCart(ArrayList<String> al)
	{
		al.removeAll(al);
		return al;
	}
	
}
