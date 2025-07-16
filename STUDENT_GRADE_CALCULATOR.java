import java.util.Scanner;

public class STUDENT_GRADE_CALCULATOR {
	 
	public static void main(String[] args) {
		 int student_id;
		 String name;
		 int noOfStudent;
		 int totalSubject;
		 double marks;
		 double totalMarks=0;
		 double average = 0;
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.print("Enter number of student: ");
		 noOfStudent =sc.nextInt();
		 System.out.print("Enter number of subject: ");
		 totalSubject =sc.nextInt();
		 System.out.println();
		 
		 for(int i=1;i<=noOfStudent;i++)
		 {
			 System.out.printf("Details of student %d :\n",i);
			 totalMarks=0;
			 for(int j=1;j<=totalSubject;j++)
			 {
				 int current =j;
				 System.out.printf("Enter marks of subject %d : ",j);
				 marks = sc.nextDouble();
				 if(marks<=100) {
					 totalMarks = totalMarks + marks;
				 }
				 else
				 {
					 System.out.println("Enterd marks are not valid, please enter correct marks..!!");
					 j = current -1;
				 }
			 }
			 System.out.printf("Total Marks :%.2f\n",totalMarks);
			 
			 average = totalMarks/noOfStudent;
			 System.out.printf("Average Percentage:%.2f\n",average);
			 if(average<=100 && average>=80)
			 {
				 System.out.println("Grade : A");
			 }
			 else if(average<=80 && average>=70)
			 {
				 System.out.println("Grade : B");
			 }
			 else if(average<=70 && average>=35)
			 {
				 System.out.println("Grade : C");
			 }
			 else
			 {
				 System.out.println("Grade : F");
			 }
			 
			 System.out.println();
		 }

	}

}
