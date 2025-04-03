import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        input.close();
    }
}





public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int num = input.nextInt();
		
		System.out.println("The multiplication Table of " + num);
		
		int i = 1;
		while(i <= 12){
			System.out.println(num + " x " + i + " = " + num * i);
			i++;
		}
	}
}