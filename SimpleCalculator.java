import java.util.Scanner;
class SimpleCalculator{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter your first number");
		double num1=input.nextDouble();
		
		System.out.println("enter your second number");
		double num2=input.nextDouble();
		
		System.out.println("\n choose operation");
		System.out.println("1. Addition(+)");
		System.out.println("2. Subtraction(-)");
		System.out.println("3. Multiplication(*)");
		System.out.println("4. Divition((/)");
		
		System.out.println("enter your choice");
		int choice=input.nextInt();
		
		switch(choice) {
			case 1:
			System.out.println("result is: "+(num1+num2));
			break;
			
			case 2:
			System.out.println("result is: "+(num1-num2));
			break;
			
			case 3:
			System.out.println("result is: "+(num1*num2));
			break;
			
			case 4:
			System.out.println("result is: "+(num1/num2));
			break;
		}
		input.close();
	}
}