import java.util.Scanner;
public class SentinelLoop{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		
		int sum = 0;
		double average = 0;
		int pro = 1;
		int counter = 0;
		
		while(true){
			System.out.print("Enter Number: ");
			int num = input.nextInt();
			counter++;
			if(num == -1){
				break;
			}
			
			sum += num;
			pro *= num;
		}
		average = (double)sum/counter;
		
		System.out.printf("The sum is %d%n",sum);
		System.out.printf("The average is %d%n",average);
		System.out.printf("The product is %d%n",pro);
	}
}