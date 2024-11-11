import java.util.*;

class Product
{
    public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);

        int Pnum;
        String Pname;
        float Pcost;
        float Pqty;
        System.out.println("Enter the product name:");
         sc.nextInt();
        System.out.println("Enter the product number:");
	 sc.nextInt();
        System.out.println("Enter the product cost:");
	 sc.nextFloat();
	System.out.println("Enter the product quantity:");
	 sc.nextFloat();
	float Pbill=pcost*pqty;
	System.out.println("the product name is:"+Pname);
	System.out.println("the product number is:"+Pnum);
	System.out.println("the product cost is:"+Pcost);
 	System.out.println("the product quantity is:"+Pqty);
	System.out.println("the product bill is:"+Pbill);
	
    }
}