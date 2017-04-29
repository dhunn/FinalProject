package finalProject;

import java.util.PriorityQueue;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Attribute.Hair_Grey);
		Random random = new Random(System.currentTimeMillis());
		PriorityQueue<Person> queue;
		Person personToCompairTo = new Person("John", "Doe", Attribute.Hair_Black | Attribute.Eyes_Grey | Attribute.Sex
				| Attribute.Race_White | Attribute.Ethnic_German | Attribute.Language_English, 25, 74);
		int male = Attribute.Sex;

		String[] fNamesMale = { "John", "Joe", "Jim", "Dan", "Rod", "Jake", "Mike", "Dustin", "Adam", "Ben" };
		String[] fNamesFemale = { "Jane", "Jessica", "Jenna", "Dannette", "Rebecca", "Jill", "Mickey", "Dusty",
				"Alexis", "Betty" };
		String[] lNames = { "Doe", "Smith", "Jones", "Johnson", "Stevenson", "Garcia", "Page", "Pope", "Abbas",
				"Powell" };
//		System.out.println(fNamesMale.length);
//		System.out.println(lNames.length);

		int rand = random.nextInt(10) +1 ;
		queue = new PriorityQueue<Person>(rand, new ComparePersonByValue());
		for (int i = 0; i < rand; i++) {
			Person temp = new Person();
			temp.setSex(random.nextInt(2) + 1);
			temp.setAge(random.nextInt(62) + 18);
			System.out.println();
			if((temp.getAttributes()&male) != 0){
				temp.setfName(fNamesMale[random.nextInt(10)]);
			}else{
		
				temp.setfName(fNamesFemale[random.nextInt(10)]);
			}
			

			temp.setlName(lNames[random.nextInt(10)]);
			System.out.println(temp.getfName()+" " + temp.getlName());
			temp.setHeight(random.nextInt(50) + 30);
			temp.setEthnicity(random.nextInt(11) + 1);
		
			temp.setCorrectiveLenses(random.nextInt(2) + 1);
			temp.setEyeColor(random.nextInt(5) + 1);
			temp.setHairColor(random.nextInt(5) + 1);
			temp.setFrancaLingua(random.nextInt(3) + 1);
			temp.setRace(random.nextInt(5) + 1);
			temp.setValue(personToCompairTo);
			queue.add(temp);
			Thread.sleep(100);
			showAtt(temp);
			
		}
		
		showAtt(personToCompairTo);
		System.out.println(Integer.toBinaryString(personToCompairTo.getAttributes()));
		System.out.println();
		Person somePerson= new Person();
		while(rand>0){
			Thread.sleep(10);
		System.out.println(somePerson.getfName() + " " + somePerson.getlName());
		System.out.println("Age: " + somePerson.getAge());
		somePerson = queue.poll();
		showAtt(somePerson);
		System.out.println(somePerson.getValue());
		System.out.println();
		rand--;
		}
		
		rand = random.nextInt(20) + 10;
		queue = new PriorityQueue<Person>(rand, new Demography());
		for (int i = 0; i < rand; i++) {
			Person temp = new Person();
			temp.setSex(random.nextInt(2) + 1);
			temp.setAge(random.nextInt(62) + 18);
			temp.setfName(male == (temp.getAttributes() & male) ? fNamesMale[random.nextInt(10)]
					: fNamesFemale[random.nextInt(10)]);
			temp.setlName(lNames[random.nextInt(10)]);
			temp.setHeight(random.nextInt(50) + 30);
			temp.setEthnicity(random.nextInt(11) + 1);
			temp.setCorrectiveLenses(random.nextInt(2) + 1);
			temp.setEyeColor(random.nextInt(5) + 1);
			temp.setHairColor(random.nextInt(5) + 1);
			temp.setFrancaLingua(random.nextInt(2) + 1);
			temp.setRace(random.nextInt(5) + 1);
			temp.setValue(personToCompairTo);
			queue.add(temp);
			
		}
		
		System.out.println(personToCompairTo.getfName() + " " + personToCompairTo.getlName());
		System.out.println("Age: " + personToCompairTo.getAge());
		showAtt(personToCompairTo);
		System.out.println();
		while(rand>0){
		somePerson = queue.poll();
		System.out.println(somePerson.getfName() + " " + somePerson.getlName());
		System.out.println("Age: " + somePerson.getAge());
		showAtt(somePerson);
		System.out.println(somePerson.getValue());
		System.out.println();
		rand--;
		}
	}
	public static void showAtt(Person per){
		int j = 0;
		while(j< 32){
			Attribute.att(per.getAttributes(), j);
			j++;
		}
		}

}
