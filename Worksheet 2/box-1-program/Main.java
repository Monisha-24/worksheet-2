/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
package Worksheet;
import java .util.Scanner;

class box
{
    double height;
    double width ;
    double depth ;
}
public class test
{
	public static void main(String[] args) 
	{
	    box obj=new box();
	    obj.depth=10;
	    obj.width=20;
	    obj.height=30;
	    double vol= obj.depth*obj.width*obj.heighr;
	}
	box obj1=new box();
	obj1.depth=6;
	obj1.width=9;
	obj1.height=8;
	vol=obj1.depth*obj1.width*obj1.height;
		System.out.println("Volume "+vol);
	}
}
