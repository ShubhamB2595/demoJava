public class FullHalfDayWage {
	public static void main(String[] args) {
		int HalfTime = 1;	//assigning value to compare the attendance
		int FullTime = 2;
		double empAtt = Math.floor(Math.random() * 10 % 3);	//Random value 1, 2 or 0
	 //checking employee attendance
		if(empAtt == FullTime) {
			System.out.println("Employee is Present for full time");
			int empRPHr = 20;	//Employee rate per Hr
			int empHrs = 8;		//Employee full day time
			int salary = empRPHr * empHrs;	//Salary Calculation
			System.out.println("Employee salary for the full Day: " + salary);
		}
		else if(empAtt == HalfTime) {
                        System.out.println("Employee is Present for half time");
                        int empRPHr = 20;       //Employee rate per Hr
                        int empHrs = 4;         //Employee half time
                        int salary = empRPHr * empHrs;  //Salary Calculation
                        System.out.println("Employee salary for the half Day: " + salary);
                }

		else {
			System.out.println("Employee is Absent, no salary generated");
		}
		
	}
}
