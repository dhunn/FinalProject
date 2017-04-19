package finalProject;

import java.util.Arrays;

public class Queue {
	
	
	private int size =3;
	private int nEle =0;
	private Person people[]= new Person[size];
	BinHeap heap = new BinHeap();
	
	
	public void add(Person person, Person me){
		
		if(size>=nEle){
		 people=heap.add(person, me, nEle);
		 nEle++;
		}else{
			people =Arrays.copyOf(people, (int)(size*1.5));
			size *= 1.5;
			people = heap.add(person, me, nEle);
		}
	}
	public Person peek(){
		return people[0] != null ? people[0]: null;
	}
	public Person remove(){
		Person person= null;
		if(people[0]!= null){
			person = people[0];
			 people= heap.remove(people);
			 return person;
		}else{
			return null;
		}
	}
}
