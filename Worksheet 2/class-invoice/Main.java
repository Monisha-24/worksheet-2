/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package worksheet .pkg1;
import java.util.Scanner;
public class worksheet 
{
	public static void main(String[] args) 
	{
	    customer c1= new.customer (100,"AAA",10");
		System.out.println(c1.getid());
		System.out.println(c1.getname());
		System.out.println(c1.getdiscount());
		c1.setdiscount(15);
		System.out.println(c1.getdiscount());
		System.out.println(c1());
		invoice in=new invoice(1000,c1,2000);
		System.out.println(c1.getid());
		System.out.println(c1.getcustomer());
		customerc2=new customer(101,"BBB",15);
		System.out.println(c1.getamount());
		in.setamount(2500);
		System.out.println(in.getcustomer());
		System .out.println(in.getamountafterdiscount());

	}
}
class customer 
{
    int id;
    string name;
    int discount ;
    customer (int I,string n,int d);
    {
        id=i;
        name=n;
        discount=d;
    }
    int getid()
    {
        return id;
    }
    string getname()
    {
        return name;
    }
    int getdiscount()
    {
        return discount;
    }
    void setdiscount(int d1)
    {
        discount=d1;
    }
    public String toString()
    {
        return"Name:"+name+"\nID:"+id;
    }
}
class invoice 
{
    int id;
    customer o;
    double amount ;
    invoice (int I,customer o1,double a)
{
    id=i;
    o=o1;
    amount =a;
}
int getid()
{
    return id;
}

customergetcustomer()
{
    return o
}
void setcustomer (customer o2)

    {
        o=o2;
    }
    double getamount()
    {
        return amount;
    }
    void setamount (double a)
    {
        amount =a;
    }
    string getcustomername()
    {
        return o.name;
    }
    double getamountafterdiscount()
    {
        return amount -(amount *o.discount)/100;
    }
}



