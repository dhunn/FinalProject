package finalProject;

public class Person {
	
	private String fName;
	private String lName;
	private int age;
	private char sex;
	private int zipCode;
	private String race;
	private char seeking;
	private int heightInches;
	private String eyeColor;
	
	public Person(String fName, String lName, int age, char sex, int zipCode, String race, char seeking,
			int heightInches, String eyeColor) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.sex = sex;
		this.zipCode = zipCode;
		this.race = race;
		this.seeking = seeking;
		this.heightInches = heightInches;
		this.eyeColor = eyeColor;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public char getSeeking() {
		return seeking;
	}

	public void setSeeking(char seeking) {
		this.seeking = seeking;
	}

	public int getHeightInches() {
		return heightInches;
	}

	public void setHeightInches(int heightInches) {
		this.heightInches = heightInches;
	}

	public String getRace() {
		return race;
	}

	public String getEyeColor() {
		return eyeColor;
	}
	private int setByte(int b, int pos){
		b |= 1 << pos;
		return b;
	}
	private int clearByte(int b, int pos){
		b &= ~(1 << pos);
		return b;
	}
	public int compairTo(Person p){
		int same = 0;
		
		if(this.age == p.age) setByte(same, 0) ;
		if(this.sex==p.sex) setByte(same, 1);
		if(this.zipCode == p.zipCode) setByte(same, 2);
		if(this.race.equals(p.race)) setByte(same, 3);
		if(this.seeking == p.seeking) setByte(same, 4);
		if(this.heightInches == p.heightInches) setByte(same, 5);
		if(this.eyeColor.equals(p.eyeColor)) setByte(same, 6);
		
		
		
		
		return same;
	}

}
