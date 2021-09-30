public class empwageUC3 {
	public static void main(String[] args) {
		int HalfTime = 1, FullTime = 2, salary = 0;	//assigning value to compare the attendance, salary
		int empRPHr = 20;	//Employee rate per Hr
		int empHrs = 0;		//Employee working hrs

		double empAtt = Math.floor(Math.random() * 10 % 3);	//Random value 1, 2 or 0
	 //checking employee attendance
		if(empAtt == FullTime) {
			System.out.println("Employee is Present for full time");
			empHrs = 8;		//Employee full day time
			salary = empRPHr * empHrs;	//Salary Calculation
			System.out.println("Employee salary for the full Day: " + salary); }
		
		else if(empAtt == HalfTime) {
                        System.out.println("Employee is Present for half time");
                        empHrs = 4;		//Employee half day time
			salary = empRPHr * empHrs;  //Salary Calculation
                        System.out.println("Employee salary for the half Day: " + salary); }

		else { System.out.println("Employee is Absent, no salary generated"); }
		
	}
}

