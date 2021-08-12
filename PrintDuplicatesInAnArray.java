package week1.day2;

public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
int count=0;
int lengthArr= arr.length;
System.out.println("This is the length of the array : " +lengthArr);
for (int i = 0; i <= arr.length-1; i++) {
	for (int j = i+1; j < arr.length; j++) {
		
		if (arr[i]==arr[j]) {
			System.out.println("This is the duplicate number : " +arr[j]);
			count++;
		}
		
	}
}
if (count>0) {
	System.out.println("This is the total number of duplicates : " +count);
	
}
	
}
	}
