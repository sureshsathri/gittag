//program to check if a given number is Positive negative or zero
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=s.nextInt();
		if(num>0) {
			System.out.println("The number is positive");
		}
		else if(num<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
		
		

	}

}
