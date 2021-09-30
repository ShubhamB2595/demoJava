public class empwageUC5 {
	static final int HalfTime = 1, FullTime = 2;
	public static void main(String[] args) {
		int salary = 0;		//assigning value to compare the attendance, salary
		int empRPHr = 20;	//Employee rate per Hr
		int empHrs = 0;		//Employee working hrs

		for (int i=1; i<=20; i++) {
		double empAtt = Math.floor(Math.random() * 10 % 3);	//Random value 1, 2 or 0
	 //checking employee attendance and calculating salart for 20 working days
		switch ((int) empAtt) {
		case FullTime:
//			System.out.println("Employee is Present for full time");
			empHrs += 8;		//Employee full day time
			break;
		
		case HalfTime:
//                        System.out.println("Employee is Present for half time");
                        empHrs += 4;		//Employee half day time
			break;

		default: //System.out.println("Employee is Absent, no salary generated"); 
			break;	}
		}
		salary = empHrs * empRPHr;	//Salary Calculation
                System.out.println("Employee salary for 20 working Days: " + salary + " for total hrs " + empHrs); 
			
	}
}

