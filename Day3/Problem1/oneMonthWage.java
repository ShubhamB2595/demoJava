public class oneMonthWage {
	public static void main(String[] args) {
		//Declaring Constant and assigning value
		int EmpCheck = 1;
		int i = 0;
		while(i < 20) {
		//Generate Random value  
		double empAttendance = Math.floor(Math.random() * 10 % 2);
		//Conditional Statement
		if(EmpCheck == empAttendance) {
			System.out.println("Employee is Present day: "+ (i+1));
			i = i+1;
			}
		else {	
			System.out.println("Employee is Absent");
			}
		}
		int empRPHr = 20;	//Employee rate per Hr
		int empHrs = 8;		//Employee full day time
		int salary = empRPHr * empHrs * i;	//Salary Calculation
		System.out.println("Employee salary for the Month: " + salary);
	}
}
