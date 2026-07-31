class ElseIfMarks{
	public static void main(String args[]){
		int marks=74;
		
		if((marks>=75) && (marks<=100)){
			System.out.println("Grade: A");
		}
		else if((marks>=65) && (marks<=74)){
			System.out.println("Grade: B");
		}
		else if((marks>=55) && (marks<=64)){
			System.out.println("Grade: C");
		}
		else if((marks>=45) && (marks<=54)){
			System.out.println("Grade: D");
		}
		else {
			System.out.println("Grade: F");
		}
		
		
	}
}
	