package week1.day2;

import java.util.Arrays;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testNum[]= {305,783,5623,298,902,24,252};
		Arrays.sort(testNum);
		
		System.out.println("The second largest Element is :" +testNum [testNum.length-2]);
	}

}
