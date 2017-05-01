package finalProject;

import java.util.Comparator;

public class ComparePersonByValue implements Comparator<Person>{

	/**
	 * compares by the compared value
	 */
	@Override
	public int compare(Person p1, Person p2) {
		
		return Integer.compare(p2.getValue(), p1.getValue());
	}

}
