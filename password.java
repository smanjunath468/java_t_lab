/**
 * 
 */
package books;
import java.util.Scanner;
/**
 * @author Selfie
 *
 */
public class password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcom to Password Verification \n" );
		
		Scanner pa=new Scanner(System.in);
		System.out.println("eneter the password \n");
		
		String pass=pa.next();
		System.out.println("Confirm password \n");
		String confs=pa.next();
		if(pass.equals(confs)) {
			System.out.println("Password is same " );
		}
		else
		{
			System.out.println("password is not same" );
		}
	}

}
