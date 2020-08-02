/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package worksheet;
import java.util .Scanner;
public class student
{
    String name,dept,status;
    double m1,m2,m3,avg;
    void getdata()
    {
        Sanner obj=new Scanner(System.in);
        name=obj.next();
        dept=obj.next();
        m1=obj.nextDouble();
        m2=obj nextDouble();
        m3=objmnextDouble();
    }
    void markcal()
    {
        avg=(m1+m2+m3)/3;
        if(m1<50||m2<50||m3<50)
        {
            Status="Fail";
        }
        else
        {
            if(arg>=80)
            status="first class";
            if(avg>=70&&avg<=79)
            status="second class";
            if(avg>=50&&avg<=69)
            status="third class";
        }
    }
	void dispaly()
	{
		System.out.println("Name:"+name+"\nDept:"+dept+"\nM1:"m1:"+m1+"\nM2:"+m2+"\nM3:"+m3+"\nAverage:"+avg+\nStatus:"+stqtus);
	}
}
