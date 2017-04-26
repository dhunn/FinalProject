package finalProject;

public class Person {

	private String fName;
	private String lName;
	private int attributes;
	private int height;
	private int age;

	Person(String fName, String lName, int attributes, int age, int height) {
		this.fName = fName;
		this.lName = lName;
		this.attributes = attributes;
		this.age = age;
		this.height = height;
	}

	public int compareTo(Person them) {
		int count = 0;
		int temp = them.getAttributes();
		while (temp > 0) {
			temp &= (temp - 1);
			count++;
		}

		if (them.getAge() == this.age)
			count++;
		if (them.getHeight() == this.height)
			count++;
		return count;
	}

	public void setEyeColor(int num) {
		switch (num) {
		case 1:
			this.attributes += Attribute.Brown_Eyes;
			break;
		case 2:
			this.attributes += Attribute.Blue_Eyes;
			break;
		case 3:
			this.attributes += Attribute.Green_Eyes;
			break;
		case 4:
			this.attributes += Attribute.Hazel_Eyes;
			break;
		case 5:
			this.attributes += Attribute.Grey_Eyes;
			break;

		default:
			break;
		}
	}
	
	public void setHairColor(int num){
		switch (num) {
		case 1:
			this.attributes += Attribute.Brown_Hair;
			break;
		case 2:
			this.attributes += Attribute.Blond_Hair;
			break;
		case 3:
			this.attributes += Attribute.Red_Hair;
			break;
		case 4:
			this.attributes += Attribute.Grey_Hair;
			break;
		case 5:
			this.attributes += Attribute.Black_Hair;
			break;

		default:
			break;
		}
		
	}
	public void setRace(int num){
		switch (num) {
		case 1:
			this.attributes += Attribute.Race_Asain;
			break;
		case 2:
			this.attributes += Attribute.Race_Black;
			break;
		case 3:
			this.attributes += Attribute.Race_NativeAmerican;
			break;
		case 4:
			this.attributes += Attribute.Race_White;
			break;
		case 5:
			this.attributes += Attribute.Race_PacificIslander;
			break;

		default:
			break;
		}
	}
	public void setSex(int num){
		switch (num) {
		case 1:
			this.attributes += Attribute.Sex;
			break;
		case 2:
			
			break;

		default:
			break;
		}
	}
	public void setCorrectiveLenses(int num){
		switch (num) {
		case 1:
			this.attributes += Attribute.Corrective_Lenses;
			break;
		case 2:
			
			break;

		default:
			break;
		}
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

	public int getAttributes() {
		return attributes;
	}

	public void setAttributes(int attributes) {
		this.attributes = attributes;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
