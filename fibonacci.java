import java.util.Scanner;

public class Fibonacci{


	public static void main(String []args){
	int i,n1=0,n2=1,n3;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter value for count");	
	int count =in.nextInt();
	System.out.println("Entered count:"+count);
	for(i=2;i<count;i++){

		n3 = n1+n2;
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;

	}
}





}
