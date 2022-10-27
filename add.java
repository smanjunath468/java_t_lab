/**
 * 
 */
package books;
import java.util.*;
/**
 * @author Selfie
 *
 */
public class add {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner(System.in);
		System.out.println("enter a number");
		int num1= a.nextInt();
		double num= (((num1+8)/3)%5)*5;
		System.out.println("the result is"+num);
	}

}
