import java.util.*;
class Example{
	public static void main(String args[]){	
		Scanner input=new Scanner(System.in);
		System.out.print("Input your age : ");
		int age=input.nextInt();
		System.out.println("Your current age : "+age);		
		
		//find your age after 10 years;
		age=age+10; //age+=10;
		System.out.println("Your age after 10 years : "+age);		
	}
}
