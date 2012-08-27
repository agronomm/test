package secondlesson.arrays;

public class Arrays2 {
	public static void main(String[] args) {
		int[] intArray = new int[10]; // иницыализация на одной строке, так как ты это в одном месте делаешь
		intArray[0] = 2;// убрал лишние пробелы перед ";"
		intArray[1] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 7;
		intArray[6] = 8;
		intArray[7] = 4;
		intArray[8] = 6;
		intArray[9] = 6;
		System.out.println(intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4] + intArray[5] + intArray[6] + intArray[7]
				+ intArray[8] + intArray[9]);// выделил "+" пробелами
		// так intArray[0] + intArray[1] + intArray[2] лучше смотрится  чем 
		// так intArray[0]+intArray[1]+intArray[2]
	}
}