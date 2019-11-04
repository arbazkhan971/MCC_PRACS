import java.util.Scanner;


public class Palindrome{


		public static void main(String []args){
			Scanner in = new Scanner(System.in);
			System.out.println("enter number:");			
			int number = in.nextInt();
			int reverse=0,rem,n;
			n = number;
			while(number!=0)
			{
				rem  = number%10;
				System.out.println(rem);
				reverse = reverse*10 + rem;
				
System.out.println(reverse);
				
number = number/10;
				

			}
			if (n == reverse){
			System.out.println("TI is palindrome");
			}else{
			System.out.println("it is not palindrome");
			}



			}






}
