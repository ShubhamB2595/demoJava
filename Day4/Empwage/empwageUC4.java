public class empwageUC4 {
	static final int HalfTime = 1, FullTime = 2;
	public static void main(String[] args) {
		int salary = 0;		//assigning value to compare the attendance, salary
		int empRPHr = 20;	//Employee rate per Hr
		int empHrs = 0;		//Employee working hrs

		double empAtt = Math.floor(Math.random() * 10 % 3);	//Random value 1, 2 or 0
	 //checking employee attendance
		switch ((int) empAtt) {
		case FullTime:
			System.out.println("Employee is Present for full time");
			empHrs = 8;		//Employee full day time
			salary = empRPHr * empHrs;	//Salary Calculation
			System.out.println("Employee salary for the full Day: " + salary); 
			break;
		
		case HalfTime:
                        System.out.println("Employee is Present for half time");
                        empHrs = 4;		//Employee half day time
			salary = empRPHr * empHrs;  //Salary Calculation
                        System.out.println("Employee salary for the half Day: " + salary); 
			break;

		default: System.out.println("Employee is Absent, no salary generated"); 
			break;	}
		
	}
}

