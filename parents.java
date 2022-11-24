package books;

 class parents {


public void p()
{
System.out.println("This is a parents class");
}
}
class child extends parents
{
public void c()
{
System.out.println("This is a child class");
}
public class employe {
}

 

public static void main(String[] args) {
// TODO Auto-generated method stub
parents bc = new parents();
child cc = new child();
parents bcb = new child();
System.out.println("calling the parents method using Parent Object");
bc.p();
System.out.println();
System.out.println("calling the child method using Child Object");
cc.c();
System.out.println();
System.out.println("calling the Parents method using Child Object");
bcb.p();

}

}
