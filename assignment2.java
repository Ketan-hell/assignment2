import java.util.*;
public class assignment2 {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> email = new ArrayList<>();
		email.add("ajay@gmail.com");
		email.add("kiran@gmail.com");
		email.add("pooja@hotmail.com");
		email.add("mohit@hotmail.com");
		email.add("rohan21@gmail.com");
		email.add("aditya1@rediffmail.com");
		email.add("palak@rediffmail.com");
		email.add("Sanam@yahoo.com");
		email.add("rashmi1991@yahoo.com");
		
		System.out.println("Enter your mail to search");
		sc = new Scanner(System.in);
		String stringInput = sc.nextLine();
		
		
		for (int i = 0; i < email.size(); i++) {
			if (email.contains(stringInput)) {
				System.out.println("Your email address is present in the list");
				break;
			}
			else {
				System.out.println("Your email address is not present in the list");
				break;
			}
		}

	}

}
