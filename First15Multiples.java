import java.util.Scanner;

public class First15Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("First 15 multiples of " + num);
		
		int i = 1;
        while (i <= 15){
            System.out.println(num * i);
			i++;
        }
    }
}
