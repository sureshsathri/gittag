import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Code:");
		char ch = s.next().charAt(0);
		switch(ch)
		{
		case 'R':
		case 'r':
			System.out.println("Red");
			break;
		case'B':
		case 'b':
			System.out.println("Blue");
			break;
		case'G':
		case 'g':
			System.out.println("Green");
			break;
		case'O':
		case 'o':
			System.out.println("Orange");
			break;
		case'Y':
		case 'y':
			System.out.println("Yellow");
			break;
		case'W':
		case 'w':
			System.out.println("White");
			break;
		default:
				System.out.println("Invalid Code");
		};
		
		

	}

}
