package Question2;

import java.util.Comparator;

public class SortByName implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		int value = o1.name.compareTo(o2.name);
		return value;
	}
	

}
