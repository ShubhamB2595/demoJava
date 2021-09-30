public class empwageUC1 {
	public static void main(String[] args) {

		//Declaring Constant and assigning value
		final int EmpCheck = 1;

		//Generate Random value  
		double empAttendance = Math.floor(Math.random() * 10 % 2);
		System.out.println("Attendance value: " + empAttendance);

		//Conditional Statement
		if(EmpCheck == empAttendance) {	System.out.println("Employee is Present"); }
		else {	System.out.println("Employee is Absent"); }
	}
}
