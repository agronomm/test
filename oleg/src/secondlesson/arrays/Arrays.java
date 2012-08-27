package secondlesson.arrays;

public class Arrays {
	public static void main(String[] args) {
		String[] stringsArray = new String[7]; // иницыализация на одной строке, так как ты это в одном месте делаешь, нет смысла разделять
		stringsArray[0] = "Monday";
		stringsArray[1] = "Tuesday";
		stringsArray[2] = "Wednesday";
		stringsArray[3] = "Thursday";
		stringsArray[4] = "Friday";
		stringsArray[5] = "Saturday";
		stringsArray[6] = "Sunday";
		System.out.println("Days of week:");
		System.out.println(stringsArray[6]);
		System.out.println(stringsArray[0]);
		System.out.println(stringsArray[1]);
		System.out.println(stringsArray[2]);
		System.out.println(stringsArray[3]);
		System.out.println(stringsArray[4]);
		System.out.println(stringsArray[5]);
		System.out.println("Days in Russian week:");
		System.out.println(stringsArray[0]);
		System.out.println(stringsArray[1]);
		System.out.println(stringsArray[2]);
		System.out.println(stringsArray[3]);
		System.out.println(stringsArray[4]);
		System.out.println(stringsArray[5]);
		System.out.println(stringsArray[6]);
	}
}
