/**
 * 
 */
package books;
import java.util.Scanner;

/**
 * @author Selfie
 *
 */
public class evenodd {	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner odd= new Scanner(System.in);
		System.out.println("Welcom \n" );
		System.out.println("Enter the number to be checked: ");
		n=odd.nextInt();
		if(n%2==0)
		{
			System.out.println(+n+ ": The given number is Even ");
		}
		else
		{
			System.out.println(+n+": The given Number is odd");
		}
	}

}
