
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "Manjunath S", "Suresh", "Bhuvan", "Kamlesh", "Vignesh" };
        int marks[] = { 87, 58, 73, 77, 63 };
        char sections[] = { 'c', 'B', 'c', 'A', 'B' };
        
        for(int i = 0; i < names.length; i++)
        {
            System.out.println( names[i] + " in section " + sections[i] + " got " + marks[i] + " marks." );
        }    
	}

}
