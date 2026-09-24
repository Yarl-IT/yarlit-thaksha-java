import java.util.Scanner;
class GradeCalculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter marks for subject 1");
		int m1=sc.nextInt();
		
		System.out.println("enter marks for subject 2");
		int m2=sc.nextInt();
		
		System.out.println("enter marks for subject 3");
		int m3=sc.nextInt();
		
		int total=m1+m2+m3;
		int average=total/3;
		
		if(average>=75) {
			System.out.println("Grade: A");
		}
		else if(average>=60) {
			System.out.println("Grade: B");
		}
		else if(average>=40) {
			System.out.println("Grade: c");
		}
		else {
			System.out.println("Grade: fail");
		}
	}
}
		