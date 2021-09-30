import java.util.Scanner;
public class LengthLine {
	public static void main (String[] args)	{

	Scanner input = new Scanner(System.in);
	System.out.println("Enter value for x1:");
	int x1 = input.nextInt();
	System.out.println("Enter value for x2:");
	int x2 = input.nextInt();
        System.out.println("Enter value for y1:");
        int y1 = input.nextInt();
        System.out.println("Enter value for y2:");
        int y2 = input.nextInt();
	input.close();
	double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	System.out.println("Length of the line: " + length);
	
	}
}
