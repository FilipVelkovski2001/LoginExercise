import java.util.Scanner;

public class VezbanjeEncap {
	private String username;
	private String password;
	
	
	public void setUserName (String username) {
		this.username = username;
			
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void loginAccount() {
		
		System.out.println("Login to your account!");
		
		Scanner scanner1 = new Scanner(System.in);
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter your username:");
				
				if( scanner.nextLine().equals(this.username)) {
					System.out.println("Correct username!");
					
					System.out.println("Enter your password:");
					
					if( scanner1.nextLine().equals(this.password)) {
					System.out.println("Correct password!");
					System.out.println("Welcome to your account!!!");
				}
				else  {
				System.err.println("Incorrect password");
				}
				
				}
				else {
					System.err.println("Incorrect username");
					
					System.out.println("Enter password:");
					
					if( scanner1.nextLine().equals(this.password)) {
						
						System.err.println("Incorrect username, correct password try again!");
					}
					else  {
					System.err.println("Incorrect password and username!");
					
					}
				}
				 
	}
}



