// Find the reverse of the string

package selfLearning;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.next();
		
		String rev = "";
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

	}

}
