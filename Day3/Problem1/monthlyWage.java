public class monthlyWage {
	public static void main(String[] args) {
		int HalfTime = 1;	//assigning value to compare the attendance
		int FullTime = 2;
		int maxWorkHrs = 100;	//Maximum Working hrs in a month
		int maxWorkDays = 20;	//Maximum working days in a month
                int empRPHr = 20;       //Employee rate per Hr
		int totalhrs = 0;	//initialization of working hrs
		double totaldays = 0;	//initialization of working days
		int salary = 0;
		while (totalhrs < maxWorkHrs && totaldays < maxWorkDays ) {

		double empAtt = Math.floor(Math.random() * 10 % 3);	//Random value 1, 2 or 0
	 //checking employee attendance
		if(empAtt == FullTime) {
			totalhrs = totalhrs + 8;
			totaldays = totaldays + 1;
			System.out.println("Totalhrs: " + totalhrs + "	Totaldays: " + totaldays);
			}
		else if(empAtt == HalfTime) {
			totalhrs = totalhrs + 4;
			totaldays = totaldays + 0.5;
			System.out.println("Totalhrs: " + totalhrs + "	Totaldays: " + totaldays);
        	        }

		else {
			totaldays += 1;
			System.out.println("Employee is Absent, no salary generated");
			}

		}	//while closed
		
		salary = totalhrs * empRPHr;
		System.out.println("Salary for the month: "+ totalhrs + " * " + empRPHr + " = " + salary);
	}	//main closed
}	//class closed
