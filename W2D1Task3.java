package week2day1;

import java.util.Arrays;

public class W2D1Task3 {

	public static void main(String[] args) {
		
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=array.length;
		Arrays.sort(array);

		for (int i = 0; i < array.length-1; i++) {
			if(array[i]==array[i+1]) {
				System.out.println("The Duplicates are :"+array[i]);
			}
		}
	}
	

}
