import java.util.Scanner;
class ArraySum{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] numbers=new int[5];
		int sum=0;
		
		
		System.out.println("enter 5 numbers");
		
		for(int i=0;i<5;i++){
		numbers[i]=sc.nextInt();
		sum=sum+numbers[i];
		}
		System.out.println("sum of 5 numbers: "+sum);
		
	}
}
	