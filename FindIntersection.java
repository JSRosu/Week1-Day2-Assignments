package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int teamA[]= {3,2,11,4,6,7};
		int teamB[]= {1,2,8,4,9,7};
		
		for (int i = 0; i < teamA.length; i++) {
			for (int j = 0; j < teamB.length; j++) {
			
				
				if (teamA[i]==teamB[j]) {
					System.out.println("This is the intersection : " +teamA[i]);
				}
			}
			
		}
	}

}
