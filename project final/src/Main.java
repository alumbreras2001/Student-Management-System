import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	//Class Main will call the functions in class studentss.
		
	//java project: Is an online student school portal where students can enroll in classes and see their total cost for the upcoming semester.
					//Administration can also modify enrolled students and access their information.
		
	//System will ask user to:
		
	//enter the number of new students to enroll	
	//enter their first and last name.
	//enter the classes they wish to enroll in the upcoming semester.
//will ask user if they will live on campus or not, and will show the total amount of living on campus.	
	//enter their total scholarship/loan amount for the upcoming semester.
	//total amount= cost of courses + total required fees + if student is staying on campus.
	//total scholarship/loan amount will be subtracted from the total amount.
	//Will give user the option to pay how much they wish to pay, given the total semester balance.
	
		
		//lets user enter how many students to enroll
		System.out.println("Enter the number of new students to enroll: ");
		Scanner scan = new Scanner(System.in);
		int numOfStudents = scan.nextInt();
		studentss[] students= new studentss[numOfStudents];
		
		for(int i=0; i<numOfStudents; i++) 
		{
			//will call the functions in class studentss
			students[i]= new studentss();
			students[i].enroll();
			students[i].housing();
			students[i].requiredFees();
			students[i].viewBalance();
			students[i].totalScholarships();
			students[i].payTuition();
		
			System.out.println(students[i].toString());
		}
			
			
		}
			

	}
