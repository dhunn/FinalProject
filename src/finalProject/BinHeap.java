package finalProject;

public class BinHeap {
	
	private Person people[];

	public Person[] add(Person pArray[],Person person, Person me, int nEle) {
		this.people = pArray;
		people[nEle]= person;
		int temp = person.compairTo(me);
		int count = 0;
		while(temp>0){
			temp &= (temp-1);
			count++;
		}
		person.setCompatability(count);
		
		
		
		return null;
	}

	public Person[] remove(Person[] people) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Person[] perculateUp(int nEle){
		
		int current = nEle;
		
		if(people[current] == null){
				
		}else{
			if(people[current].getCompatability()> people[current/2].getCompatability()){
				swap(current, current/2);
				return perculateUp(current/2);
			}
		}
		
		
		return people;
		
	}

	private void swap(int current, int halfCurrent) {
		Person temp = people[current];
		people[current] = people[halfCurrent];
		people[halfCurrent]= temp;
		
	}

}
