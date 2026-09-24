import java.util.Scanner;
class ATM{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int balance=30000;
			char choice;
			
			do{
				System.out.println("\n---ATM MENU---");
				System.out.println("1. cheak balance");
				System.out.println("2. deposit");
				System.out.println("3. Withdraw");
				
				System.out.println("choose option");
				int option= sc.nextInt();

				switch (option) {
					case 1:
					System.out.println("balance: "+balance);
					break;
					
					case 2:
					System.out.println("enter deposit amount: ");
					int dep=sc.nextInt();
					balance+= dep;
					System.out.println("updated balance: "+ balance);
					break;
					
					case 3:
					System.out.println("enter withdrawal amount: ");
					int wd=sc.nextInt();
					balance-= wd;
					System.out.println("updated balance: "+ balance);
					break;
					
					default:
					System.out.println("invalid option");
				}
					
				System.out.println("Do you want another option?(y/n): ");
				choice=sc.next().charAt(0);
			}while (choice=='y' || choice=='y');
			System.out.println("thank you! have a nice day");
		}
}