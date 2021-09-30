public class DailyEmpWage {
	public static void main(String[] args) {
		int EmpPresent = 1;	//assigning value to compare the attendance
		double empAtt = Math.floor(Math.random() * 10 % 2);	//Random value 1 or 0
		if(EmpPresent == empAtt) {	//checking employee attendance
			System.out.println("Employee is Present");
			int empRPHr = 20;	//Employee rate per Hr
			int empHrs = 8;		//Employee full day time
			int salary = empRPHr * empHrs;	//Salary Calculation
			System.out.println("Employee salary for the Day: " + salary);
		}
		else {
			System.out.println("Employee is Absent, no salary generated");
		}
		
	}
}
