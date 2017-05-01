package finalProject;

public class Person {

	private String fName;
	private String lName;
	private int attributes = 0;
	private int height;
	private int age;
	private int value;
	
	 /**
	  * Default Constructor 
	  * initializes no variables
	  */
	Person() {
	}
	/**
	 * Sets all listed param vars
	 * @param fName
	 * @param lName
	 * @param age
	 * @param height
	 */
	Person(String fName, String lName, int age, int height) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.height = height;
	}
	/**
	 * sets all listed param vars
	 * @param fName
	 * @param lName
	 * @param attributes
	 * @param age
	 * @param height
	 */
	Person(String fName, String lName, int attributes, int age, int height) {
		this.fName = fName;
		this.lName = lName;
		this.attributes = attributes;
		this.age = age;
		this.height = height;
	}

	/**
	 * compares the number of bits and is set to the number of simular bits 
	 * @param them
	 */
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

	/**
	 * used to set the bit(s) for eye color
	 * @param num
	 */
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
	
	/**
	 * used to set the bit(s) for hair color
	 * @param num
	 */
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
	
	/**
	 * used to set the bit(s) for race
	 * @param num
	 */
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
	
	/**
	 * sets bit for sex 1 is male 0 female cause of the naughty bits
	 * @param num
	 */
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
	
	/**
	 * sets the bit if corrective lenses are need 1 is needs corrective lenses
	 * @param num
	 */
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

	/**
	 * sets the ethnic back ground of the person
	 * @param num
	 */
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
	
	/**
	 * sets the primary language of the person 
	 * @param num
	 */
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
	
	/**
	 * returns first name
	 * @return
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * set first name
	 * @param fName
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * returns last name
	 * @return
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * sets last name
	 * @param lName
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * returns an it of attributes
	 * @return
	 */
	public int getAttributes() {
		return attributes;
	}
	/**
	 * allows an int to be used to set attributes
	 * @param attributes
	 */
	public void setAttributes(int attributes) {
		this.attributes = attributes;
	}
	/**
	 * returns height
	 * @return
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * sets height
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * returns age
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * sets age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;

	
	}
	/**
	 * returns the compared value
	 * @return
	 */
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
