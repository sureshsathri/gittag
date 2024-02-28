import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Male are Female:");
		char ch1  = s.next().charAt(0);
		System.out.println("Enter the Age:");
		int k = s.nextInt();
		if(ch1 == 'F' && (k>=1 || k<=58))
		{
			System.out.println("Interest==8.2%");
			System.out.println("Gender ==> Female");
			System.out.println("Age 1 to 58");
		}
		else if(ch1 == 'F' && (k>=59 || k<=120))
		{
			System.out.println("Interest==7.6%");
			System.out.println("Gender ==> Female");
			System.out.println("Age 59 to 120");
		}
		else if(ch1 == 'M' && (k>=1 || k<=60))
		{
			System.out.println("Interest==9.2%");
			System.out.println("Gender ==> Male");
			System.out.println("Age 1 to 60");
		}
		else if(ch1 == 'M' && (k>=61 || k<=120))
		{
			System.out.println("Interest==8.3%");
			System.out.println("Gender ==> Male");
			System.out.println("Age 61 to 120");
		}
		else
		{
			System.out.println("Invalid");
		}
			
				
		s.close();
	}
}
