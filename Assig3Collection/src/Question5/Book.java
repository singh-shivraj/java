package Question5;
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
*/

public class Book 
{
	String name;
	int price;
	String authorName;
	int ISBNO;
	String publication;
	
	public Book(String name, int price, String authorName, int iSBNO, String publication) {
		super();
		this.name = name;
		this.price = price;
		this.authorName = authorName;
		ISBNO = iSBNO;
		this.publication = publication;
	}
	public void Display()
	{
		System.out.println("Book [name=" + name + ", price=" + price + ", authorName=" + authorName + ", ISBNO=" + ISBNO
				+ ", publication=" + publication + "]");
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", authorName=" + authorName + ", ISBNO=" + ISBNO
				+ ", publication=" + publication + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getISBNO() {
		return ISBNO;
	}
	public void setISBNO(int iSBNO) {
		ISBNO = iSBNO;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	
}
