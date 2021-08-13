package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// change odd index to upper case
		
		String test = "changeme";
		int length = test.length();
		
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			if (i%2 != 0) {
			
				System.out.println (Character.toUpperCase(charArray[i]));
			}
			else
				System.out.println(charArray[i]);
		}
	}

}
