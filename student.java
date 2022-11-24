package books;
import java.io.IOException;
import java.util.*;
public class student {
	
	
	{
	Scanner s = new Scanner(System.in);
	public  int age;
	int phone;
	public int sal;
	public String addr ,name;
	}
	class Employee extends student
	{
	String spec,dept;
	public void input()
	{
		int age,phone, sal;
		 String addr,name;
		Scanner s = new Scanner(System.in);
	System.out.println("Enter the Employee FirstName :");
	name=s.next();
	System.out.println("Enter the Employee LastName :");
	name=s.next();
	System.out.println("Enter the Employee Age : ");
	age=s.nextInt();
	System.out.println("Enter the Employee Salary : ");
	sal=s.nextInt();
	System.out.println("Enter the Employee Specialization : ");
	spec=s.next();
	System.out.println("Enter the Employee Department : ");
	dept=s.next();
	System.out.println("Enter the Employee Address : ");
	addr=s.next();
	}
	public void show()
	{
	int age,phone, sal;
		String addr,name;
	System.out.println("The Employee Details are :");
	System.out.println("Employee Name : "+name);
	System.out.println("Employee Age : "+age);
	System.out.println("Employee Salary : "+sal);
	System.out.println("Employee Department name : "+dept);
	System.out.println("Employee Specialization : "+spec);
	}
	}

	class Manager extends student
	{
	String spec,dept;
	public void input()
	{
		int age,phone, sal;
		 String addr,name;
		 Scanner s = new Scanner(System.in);
	System.out.println("Enter the Manager Name :");
	name=s.next();
	System.out.println("Enter the Manager Age : ");
	age=s.nextInt();
	System.out.println("Enter the Manager Salary : ");
	sal=s.nextInt();
	System.out.println("Enter the Manager Specialization : ");
	spec=s.next();
	System.out.println("Enter the Manager Department : ");
	dept=s.next();
	System.out.println("Enter the Manager Address : ");
	addr=s.next();
	}
	public void show()
	{
	int age,phone, sal;
	String addr,name ;
	System.out.println("The Manager Details are :");
	System.out.println("Manager Name : "+name);
	System.out.println("Manager Age : "+age);
	System.out.println("Manager Salary : "+sal);
	System.out.println("Manager Department name : "+dept);
	System.out.println("Manager Specialization : "+spec);
	}public class EManager {
	}
	

	public static void main(String[] args) throws IOException{
	// TODO Auto-generated method stub
	Employee e = new Employee();
	Manager m = new Manager();
	e.input();
	System.out.println();
	System.out.println();
	m.input();
	System.out.println();
	System.out.println();
	e.show();
	System.out.println();
	System.out.println();
	m.show();
	}

	}
}
