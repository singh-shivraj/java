package Question2;

import java.util.Comparator;

public class SortByRun implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if(o1.run>o2.run)
		{
			return 1;
		}
		else 
		{
		return -1;
		}

	
	}

}
