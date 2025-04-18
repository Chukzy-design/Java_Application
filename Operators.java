public class Operators{
    public static void main(String[] args) {
	     //Assingment operator(=)
		 
		 int num1,num2;
		 
		 num1 = 19;
		 num2 = 5;
		 
		 num1 += num2; // or num1 = num1 + num2
		 num1 *= num2;
		 num1 -= num2;
		 
		 //Arithmetic Operators(+,*,-,/,%)
		 int sum = num1 + num2;
		 
		 int product = num1 * num2;
		 
		 int difference = num1 - num2;
		 
		 double quotient = (double)num1 / num2;
		 
		 int modulos = num1%num2;
		 
		 //Relational Operators(>,<,<=,>=,==,!=)
		 boolean isLessThan = num1 < num2;
		 boolean isGreaterThan = num1 > num2;
		 boolean isGreaterThanOrEqualTo = num1 >= num2;
		 boolean isLessThanOrEqualTo = num1 <= num2;
		 boolean isEqualTo = num1 == num2;
		 boolean isNotEqualTo = num1 != num2;
		 
		 //Logical operators (&&,||,!)
		 boolean isAndOperator = num1 > num2 && num1 >= num2;
		 boolean isOrOperator = num1 == num2 || num1 >= num2;
		 boolean isNotOperator = !(num1 == num2 || num1 >= num2);
		 
		 
		 System.out.printf("The sum of the number is: %d%n",sum);
		 System.out.printf("The product of the number is: %d%n",product);
		 System.out.printf("The difference betweenn %d and %d is: %d%n",num1,num2,difference);
		 System.out.printf("The quotient of num1 and num2 is: %f%n",quotient);
		 System.out.printf("The remainder between num1 and num2 is: %d%n",modulos);
		 System.out.println("-------------------------------------------------------------------");
		 
		 System.out.printf("is %d < %d? %b%n",num1,num2,isLessThan);
		 System.out.printf("is %d > %d? %b%n",num1,num2,isGreaterThan);
		 System.out.printf("is %d >= %d? %b%n",num1,num2,isGreaterThanOrEqualTo);
		 System.out.printf("is %d <= %d? %b%n",num1,num2,isLessThanOrEqualTo);
		 System.out.printf("is %d == %d? %b%n",num1,num2,isEqualTo);
		 System.out.printf("is %d != %d? %b%n",num1,num2,isNotEqualTo);
		 System.out.println("-------------------------------------------------------------------");
		 
		 System.out.printf("Is %d > %d && %d >= %d? %b%n",num1,num2,num1,num2,isAndOperator);
		 System.out.printf("Is %d == %d || %d >= %d? %b%n",num1,num2,num1,num2,isOrOperator);
		 System.out.printf("Is !(%d > %d || %d >= %d)? %b%n",num1,num2,num1,num2,isNotOperator);
    }
}