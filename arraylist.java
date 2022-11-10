import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// create ArrayList list1
        ArrayList<String>
           array1= new ArrayList<String>();
  
        // Add values in ArrayList
        array1.add("Mango");
        array1.add("Apple");
        array1.add("Orange");
        array1.add("Greps");
        
        System.out.println("List1 : " +array1);
        
        ArrayList<String>
        array2 = new ArrayList<String>();
        
        // Add values in ArrayList
        array2.add("123");
        array2.add("Apple");
        array2.add("456");
       
        System.out.println("List2 : " +array2);
        
     // Find the common elements
        array1.retainAll(array2);
  
        // print list 1
        System.out.println("Common elements: " + array1);
	}
}
