public class MethodOverloading{
	public class void main(String[] args)
	
	public static void greeting(){
	    System.out.println("Good Afternoon, Everyone");
	}
	
	public static void greeting(String name){
	    System.out.println("Good Afternoon,%s%n",name);
	}
	
	public static void greeting(String name , int age){
	    System.out.println("Good Afternoon, %s you are %d years old");
	}
	
	public static void greeting(String name , int age , String gender){
	    System.out.println("Good Afternoon, %s, you are %d years old and you are a %s%n",name,age,gender);
	}
}