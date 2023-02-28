package week2day1;

import java.util.Arrays;

public class W2D1Task2 {

	public static void main(String[] args) {
		int [] array= {1,2,3,4,7,6,8};
		Arrays.sort(array);
		for (int i=array[0]; i<=array.length-1; i++) {
			array[i]=array[i]+1;
			if(i!=array[i]) {
				
			}
			System.out.println(i);
		}
	}
}
