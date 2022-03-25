import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String[] emails = {"one@gmail.com","two@gmail.com","three@gmail.com","four@gmail.com",
				"five@gmail.com","six@gmail.com","seven@gmail.com","eight@gmail.com"};
		
		ArrayList<String> emailList = new ArrayList<>(Arrays.asList(emails));
		
		String regex="^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{3})$";      
		
		Pattern p= Pattern.compile(regex);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an email to search: ");
		String check = sc.next();
		
		Matcher matcher=p.matcher(check);
		
		if(matcher.find())
			System.out.println(emailList.contains(check));
		else {
			System.out.println("Invalid Email");
		}
		
		sc.close();

	}

}