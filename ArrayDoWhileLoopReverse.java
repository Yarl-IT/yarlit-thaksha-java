class ArrayDoWhileLoopReverse{
	public static void main(String args[]){
		int[] y=new int[5];
		y[0]=10;
		y[1]=20;
		y[2]=30;
		y[3]=40;
		y[4]=50;
		
		int i=4;
		do{
			System.out.println(y[i]);
			i--;
			
		}while(i>=0);
		
	}
}