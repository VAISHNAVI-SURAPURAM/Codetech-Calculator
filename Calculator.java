import java.util.Scanner;
public class Calculator {
	public static void main(String[] a) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	Double n1=sc.nextDouble() ;
	System.out.println("enter second number"); 
	Double n2=sc.nextDouble();
	Double result=null;
	System.out.println("enter a operator +, -,*,/");
	char c=sc.next().charAt(0);
	switch(c)
	{
	case '+':
		result=n1+n2;
		break;
	case '-':
		result=n1-n2;
		break;
	case '*':
		result=n1*n2;
		break;
	case '/':
		if(n2!=0) {
		result=n1/n2;
		}
		break;
		default:
			System.out.println("enter a valid operator");	
	}
	System.out.println(result);
	sc.close();
}
}
