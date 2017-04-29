package finalProject;

public class Person {

	private String fName;
	private String lName;
	private int attributes = 0;
	private int height;
	private int age;
	private int value;
	Person() {
	}
	Person(String fName, String lName, int age, int height) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.height = height;
	}
	
	Person(String fName, String lName, int attributes, int age, int height) {
		this.fName = fName;
		this.lName = lName;
		this.attributes = attributes;
		this.age = age;
		this.height = height;
	}

	public void setValue(Person them) {
		Integer count = 0;
		int i = 0;
		while(i<32){
			if ((them.getAttributes() & (1 << i))== (this.attributes & (1 << i))) {
				count++;

			}
					
			i++;
		}
		this.value = count;
	}

	public int compare(Person them) {
		Integer count = 0;
		int i = 0;
		while(i<32){
			if ((them.getAttributes() & (1 << i))== (this.attributes & (1 << i))) {
				count++;

			}
					
			i++;
		}
		return count;
	}
	public void setEyeColor(int num) {
		switch (num) {
		case 1:
			this.attributes |= Attribute.Eyes_Blue;
			break;
		case 2:
			this.attributes |= Attribute.Eyes_Brown;
			break;
		case 3:
			this.attributes |= Attribute.Eyes_Green;
			break;
		case 4:
			this.attributes |= Attribute.Eyes_Grey;
			break;
		case 5:
			this.attributes |= Attribute.Eyes_Hazel;
			break;

		default:
			break;
		}
	}
	
	public void setHairColor(int num){
		switch (num) {
		case 1:
			this.attributes |= Attribute.Hair_Black;
			break;
		case 2:
			this.attributes |= Attribute.Hair_Blond;
			break;
		case 3:
			this.attributes |= Attribute.Hair_Brown;
			break;
		case 4:
			this.attributes |= Attribute.Hair_Grey;
			break;
		case 5:
			this.attributes |= Attribute.Hair_Red;
			break;

		default:
			break;
		}
		
	}
	public void setRace(int num){
		switch (num) {
		case 1:
			this.attributes |= Attribute.Race_Asain;
			break;
		case 2:
			this.attributes |= Attribute.Race_Black;
			break;
		case 3:
			this.attributes |= Attribute.Race_NativeAmerican;
			break;
		case 4:
			this.attributes |= Attribute.Race_White;
			break;
		case 5:
			this.attributes |= Attribute.Race_PacificIslander;
			break;

		default:
			break;
		}
	}
	public void setSex(int num){
		switch (num) {
		case 1:
			this.attributes |= Attribute.Sex;
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
			this.attributes |= Attribute.Corrective_Lenses;
			break;
		case 2:
			
			break;

		default:
			break;
		}
	}

	public void setEthnicity(int num){
		switch (num) {
		case 1:
			this.attributes |= Attribute.Ethnic_Arabs;
			break;
		case 2:
			this.attributes |= Attribute.Ethnic_Bengalis;
			break;
		case 3:
			this.attributes |= Attribute.Ethnic_British;
			break;
		case 4:
			this.attributes |= Attribute.Ethnic_English;
			break;
		case 5:
			this.attributes |= Attribute.Ethnic_French;
			break;
		case 6:
			this.attributes |= Attribute.Ethnic_German;
			break;
		case 7:
			this.attributes |= Attribute.Ethnic_Han_Chinese;
			break;
		case 8:
			this.attributes |= Attribute.Ethnic_Hispanic;
			break;
		case 9:
			this.attributes |= Attribute.Ethnic_Japanese;
			break;
		case 10:
			this.attributes |= Attribute.Ethnic_Javanese;
			break;
		case 11:
			this.attributes |= Attribute.Ethnic_Punjabi;
			break;
		case 12:
			this.attributes |= Attribute.Ethnic_Russian;
			break;
		default:
			break;
		}
	}
	
	public void setFrancaLingua(int num){
		switch (num) {
		case 1:
			this.attributes |= Attribute.Language_English;
			break;
		case 2:
			this.attributes |= Attribute.Language_Mandarin;
			break;
		case 3:
			this.attributes |= Attribute.Language_Spanish;
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
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
