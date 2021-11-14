import java.util.Scanner;

public class MainEncap {

	public static void main(String[] args) {
		
		System.out.println("Welcome to MeGram");
		
		VezbanjeEncap encap1 = new VezbanjeEncap();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Create an account!");
		
		System.out.println("Create a username:");
		
		encap1.setUserName(scan.nextLine());
		
		System.out.println("Create a password:");
		
		encap1.setPassword(scan.nextLine());
		encap1.loginAccount();
		
	
		
		
	}

}
