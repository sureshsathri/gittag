import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
	    System.out.println("enter Alphabet:");
	    char c = s.next().charAt(0);   
	    int k = (int)c;
	    if (k>=65 && k<=90)
	    {
	    	System.out.println("Alphabet");
	    }
	    else if(k>=48 && k<=57)
	    {
	    	System.out.println("Digit");
	    }
	    else
	    {
	    	System.out.println("special charecter");
	    }
	    s.close();                                                          
		
		
	}

}
