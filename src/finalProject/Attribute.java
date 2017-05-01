package finalProject;

public class Attribute {
/**
 * boilerplate
 */
	public static final int Eyes_Brown = 1;
	public static final int Eyes_Blue = 1 << 1;
	public static final int Eyes_Green = 1 << 2;
	public static final int Eyes_Hazel = 1 << 3;
	public static final int Eyes_Grey = 1 << 4;
	public static final int Hair_Brown = 1 << 5;
	public static final int Hair_Blond = 1 << 6;
	public static final int Hair_Red = 1 << 7;
	public static final int Hair_Grey = 1 << 8;
	public static final int Hair_Black = 1 << 9;
	public static final int Race_White = 1 << 10;
	public static final int Race_Asain = 1 << 11;
	public static final int Race_NativeAmerican = 1 << 12;
	public static final int Race_Black = 1 << 13;
	public static final int Race_PacificIslander = 1 << 14;
	public static final int Sex = 1 << 15; // 1 for male 0 for female
											// cause of the naughty bits
	public static final int Corrective_Lenses = 1 << 16; // 1 is uses lenses
	public static final int Ethnic_Arabs = 1 << 17;
	public static final int Ethnic_Hispanic = 1 << 18;
	public static final int Ethnic_British = 1 << 19;
	public static final int Ethnic_Han_Chinese = 1 << 20;
	public static final int Ethnic_Bengalis = 1 << 21;
	public static final int Ethnic_Russian = 1 << 22;
	public static final int Ethnic_Japanese = 1 << 23;
	public static final int Ethnic_Punjabi = 1 << 24;
	public static final int Ethnic_Javanese = 1 << 25;
	public static final int Ethnic_English = 1 << 26;
	public static final int Ethnic_French = 1 << 27;
	public static final int Ethnic_German = 1 << 28;
	public static final int Language_English = 1 << 29;
	public static final int Language_Mandarin = 1 << 30;
	public static final int Language_Spanish = 1 << 31;

	/**
	 * shows set values of boilerplate in english
	 * @param att
	 * @param pos
	 */
	public static void att(int att, int pos) {

		switch (att & (1 << pos)) {
		case Eyes_Blue:
			System.out.println("Blue Eyes");

			break;
		case Eyes_Brown:
			System.out.println("Brown Eyes");

			break;
		case Eyes_Green:
			System.out.println("Green Eyes");

			break;
		case Eyes_Grey:
			System.out.println("Grey Eyes");

			break;
		case Eyes_Hazel:
			System.out.println("Hazel Eyes");

			break;
		case Hair_Black:
			System.out.println("Black Hair");

			break;
		case Hair_Blond:
			System.out.println("Blond Hair");

			break;
		case Hair_Brown:
			System.out.println("Brown Hair");

			break;
		case Hair_Grey:
			System.out.println("Grey Hair");

			break;
		case Hair_Red:
			System.out.println("Red Hair");

			break;
		case Corrective_Lenses:
			System.out.println("Uses Corrective lenses");

			break;
		case Ethnic_Arabs:
			System.out.println("Arab");

			break;
		case Ethnic_Bengalis:
			System.out.println("Bengalis");

			break;
		case Ethnic_British:
			System.out.println("British");

			break;
		case Ethnic_English:
			System.out.println("English");

			break;
		case Ethnic_French:
			System.out.println("French");

			break;
		case Ethnic_German:
			System.out.println("German");

			break;
		case Ethnic_Han_Chinese:
			System.out.println("Han Chinese");

			break;
		case Ethnic_Hispanic:
			System.out.println("Hispanic");

			break;
		case Ethnic_Japanese:
			System.out.println("Japanese");

			break;
		case Ethnic_Javanese:
			System.out.println("Javanese");

			break;
		case Ethnic_Russian:
			System.out.println("Russian");

			break;

		case Language_English:
			System.out.println("Speaks English");

			break;
		case Language_Mandarin:
			System.out.println("Speaks Mandarin");

			break;
		case Race_Asain:
			System.out.println("Asain");

			break;

		case Race_Black:
			System.out.println("Black");

			break;
		case Race_NativeAmerican:
			System.out.println("Native American");

			break;
		case Race_PacificIslander:
			System.out.println("Pacific Islander");

			break;
		case Race_White:
			System.out.println("White");

			break;
		default:

			break;
		}
		if (pos == 15) {
			if ((att & (1 << pos)) !=0) {
				System.out.println("It's a boy");
			}else{
				System.out.println("It's a girl");
			}
		}

	}
}