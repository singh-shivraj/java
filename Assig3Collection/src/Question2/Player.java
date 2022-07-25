package Question2;

public class Player {
	String name;
	int run; 
	int wicket; 
	int matches; 
	String country; 
	int century; 
	char Category;
	
	public Player(String name, int run, int wicket, int matches, String country, int century) 
	{
		this.name = name;
		this.run = run;
		this.wicket = wicket;
		this.matches = matches;
		this.country = country;
		this.century = century;

	} 
	@Override
	public String toString() {
		return "Player [name=" + name + ", run=" + run + ", wicket=" + wicket + ", matches=" + matches + ", country="
				+ country + ", century=" + century + ", Category=" + Category + "]";
	}
	
	
	public void Display() {
		System.out.println(name+", "+run+", "+wicket+", "+matches+", "+country+", "+century+","+Category);
	

	}

}
