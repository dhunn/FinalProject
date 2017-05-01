package finalProject;

import java.util.Comparator;

public class Demography implements Comparator<Person>{

	/**
	 * compares by the value of the int attrributes
	 */
	@Override
	public int compare(Person p1, Person p2) {
		
		return Integer.compare(p2.getAttributes(), p1.getAttributes());
	}

}
