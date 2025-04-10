public class InstanceMethodWithParameter{
	public static void main(String[] args){
		InstanceMethodWithParameter imwp = new InstanceMethodWithParameter();
		int result = imwp.addition(50,17);//arguments
		
		System.out.printf("The sum is %d%n",result);
	}
	public int addition(int num1, int num2){//parameters
		int sum = num1 + num2;
		
		return sum;
	}
}