public class EmpwageSwitchCase {
	public static void main(String[] args) {
		int HalfTime = 1;	//assigning value to compare the attendance
		int FullTime = 2;
		double empAtt = Math.floor(Math.random() * 10 % 3);	//Random value 1, 2 or 0
		int empAtt1 = (int)empAtt;
	 //checking employee attendance using switch case
		switch (empAtt1) {
			case 1:
			System.out.println("Employee is Present for full time");
			int empRPHr = 20;	//Employee rate per Hr
			int empHrs = 8;		//Employee full day time
			int salary = empRPHr * empHrs;	//Salary Calculation
			System.out.println("Employee salary for the full Day: " + salary);
			break;

			case 2:
                        System.out.println("Employee is Present for half time");
                        int empRPHr1 = 20;       //Employee rate per Hr
                        int empHrs1 = 4;         //Employee half time
                        int salary1 = empRPHr1 * empHrs1;  //Salary Calculation
                        System.out.println("Employee salary for the half Day: " + salary1);
                	break;

			case 0:
			System.out.println("Employee is Absent, no salary generated");
			break;
		}
		
	}
}
