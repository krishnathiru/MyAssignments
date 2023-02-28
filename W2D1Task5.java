package week2day1;

public class W2D1Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Test="changeme";
		char[]text=Test.toCharArray();
		for (int i = 0; i<text.length; i++) {
			int j=i+1;
			if(!(j%2==0)) {
				text[i]=Character.toUpperCase(text[i]);
				
			}
		}
		System.out.println(text);

	}

}
