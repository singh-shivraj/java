package OnlineShoping;

import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class mainClass 
{
	Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
	
		System.out.println("hello shivraj");
		
		Shop shop =new Shop();
		
		System.out.println("Adding apple and banana");
		ArrayList<String> cart= new ArrayList<>();
		Person.addToCart(cart,shop.apple);
		
		Person.addToCart(cart,shop.banana);
		
		System.out.println(" ");
		System.out.println("showing cart");
		Person.ShowCart(cart);
		
		System.out.println(" ");
		Person.remove(cart,shop.banana);
		
		System.out.println("showing cart");
		Person.ShowCart(cart);
		
		System.out.println(" ");
		System.out.println("emptying ");
		Person.emptyCart(cart);
		System.exit(0);
	
}
}