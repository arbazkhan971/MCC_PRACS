import java.util.Scanner;
public class YMD{

	public static void main(String []args){

		int num_of_days = 30,n_years ,n_months,n_days;
		Scanner in  = new Scanner(System.in);
		System.out.println("give input as a number of days");
		int n = in.nextInt(); 	
		n_years = n/365;
		n_months = (n % 365)/num_of_days;
		n_days = (n % 365)%num_of_days;
		System.out.println("years = " + n_years); 
        	System.out.println("months = " + n_months); 
        	System.out.println("days = " + n_days); 


			}




}

