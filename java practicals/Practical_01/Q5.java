
package com.mycompany.Q5;


public class Q5 {

    public static void main(String[] args) {
        	/*char grade ='A';
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
        Excellent!
        break;
	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	break;
	default :
	System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);*/
                
        char grade ='A';
        if(grade=='A')
        {
           System.out.println("Excellent!");  
        }
        else if(grade=='D')
                {
                  System.out.println("You passed");  
                }
        else if(grade=='F')
        {
            System.out.println("You passed");
        }
        
        else
        {
            System.out.println("Invalid grade");	

        }




    }
}
/*Answer
Excellent!
You passed
Better try again
Your grade is A*/

