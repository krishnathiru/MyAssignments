package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Call my number");
	}
	public void sendMessage() {
		System.out.println("Send a message to my number");
	}
	
	public static void main(String[] args) {
		Mobile phone=new Mobile();
		phone.makeCall();
		phone.sendMessage();
	}
}
