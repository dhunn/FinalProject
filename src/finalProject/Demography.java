package finalProject;

import java.util.Comparator;

public class Demography implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		return Integer.compare(p2.getAttributes(), p1.getAttributes());
	}

}
