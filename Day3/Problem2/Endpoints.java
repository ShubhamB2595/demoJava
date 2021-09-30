import java.util.Scanner;
public class Endpoints {
	public static void main (String[] args)	{

	Scanner input = new Scanner(System.in);
	System.out.println("Enter details for 1st line");
	System.out.println("Enter value for x1:");
	int x1 = input.nextInt();
	System.out.println("Enter value for x2:");
	int x2 = input.nextInt();
        System.out.println("Enter value for y1:");
        int y1 = input.nextInt();
        System.out.println("Enter value for y2:");
        int y2 = input.nextInt();
	double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	System.out.println("Length of the 1st line: " + length1);
	
        System.out.println("Enter details for 2nd line");
        System.out.println("Enter value for x1:");
        x1 = input.nextInt();
        System.out.println("Enter value for x2:");
        x2 = input.nextInt();
        System.out.println("Enter value for y1:");
        y1 = input.nextInt();
        System.out.println("Enter value for y2:");
        y2 = input.nextInt();
        double length2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of the 2nd line: " + length2);
	input.close();
	System.out.println("Equality of 2 lengths: " + (length1 == length2));

	}
}
