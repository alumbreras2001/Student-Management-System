import java.util.Scanner;
public class studentss 

{
	

		private String firstName;
		private String lastName;
		private int Year;
		private String studentID;
		private static int id= 132016900;
		private String courses;
		private static int costOfCourse =350;
		private int tuitionBalance=0;
		private static String Scholarships;
		private int fees=900;
		private String value;
		private int campus=2625;
			


		
	//Ask user to enter students first and last name, and class level. Use "this." to reference variable. 
	public studentss()
	{
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter student first name: ");
			this.firstName=scan.nextLine();
			
			System.out.print("Enter student last name: " );
			this.lastName=scan.nextLine();
			
			System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
			this.Year=scan.nextInt();
			
			StudentID();			
			
	}	                 
	//Generate a student id.
	private void StudentID() {
		 id++;
		 this.studentID = Year + "" + id;
	}
	
	//
	public void enroll() {
		//Create a loop, ends when user enters Q to quit loop and adds the costOfCourse to the current balance.
		do
		{
		System.out.print("Enter course to enroll (Q to quit):");
		Scanner scan= new Scanner(System.in);
		String course = scan.nextLine();
		if(!course.equals("Q")) {
			courses= courses + "\n " + course;
			tuitionBalance=tuitionBalance + costOfCourse;
		}
		else {
			
			break;
		}
	}
		while(1!=0);
	}	
	
	//Ask user if they will live on campus
	//create a if statement if they answer yes and then give the cost of living on campus
	//Ask user to enter an amount they wish to pay and subtract from tuitionBalance.
	//if user enters no then use else statement to print nothing.
	public void housing() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you living on campus this semester?:");
		String value=scan.nextLine();
		
		
		
		if(value.equals("yes"))
		{
			tuitionBalance=tuitionBalance + campus;
			System.out.println("Cost of staying on campus for this semester: $" + campus);
			
		}
		else {
			System.out.println();
			
				
			
			}
		}
		
	//Print the required fees for the upcoming semester.
	//let user enter payment amount.
	//subtract payment from tuitionBalance
	public void requiredFees() 
	{
			System.out.println("Total Required fees for this semester is: $" + fees);
			tuitionBalance = tuitionBalance + fees ;
			
	}	
		//view Balance
	public void viewBalance() 
	{
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//Ask user to enter their total amount of scholarship/loan money for this semester.
	//subtract tuitionBalance from scholarship money.
	public void totalScholarships() {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter total amount of Scholarship/loan money for this semester: $");
		int scholarship=scan.nextInt();

		tuitionBalance = tuitionBalance-scholarship;
	
	}
		//Let user enter how much they wish to pay from tuition amount.
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner scan= new Scanner(System.in);
		int payment=scan.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
		//show student school profile(student id, name, grade level, classes enrolled), and their remaining balance for semester.
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: " + Year + "\n Student ID: " + studentID + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
		
		
		
	}

}
