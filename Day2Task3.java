package week1.day2;

public class Day2Task3 {
	


	public static void main(String[] args) {
		int range=8;
		
		int firstNum=0;
		int secondNum=1;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for(int i=1; i<=8; i++) {
			int thirdNum=firstNum +secondNum ;
			System.out.println(thirdNum);
			firstNum=secondNum;
			secondNum=thirdNum;
		
		}
		
	}
}
