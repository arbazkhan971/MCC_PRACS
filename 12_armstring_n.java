public class Armstrong{

	public static void main(String []args){

			int sum=0,rem,n;
			for(int i=1 ;i<1000;i++){
			n = i;
			while(n!=0)
			{
				rem  = n%10;
				sum+=rem*rem*rem ;
				n = n/10;
				

			}
			if (i == sum){
			System.out.println("it is armstrong"+" "+ i);
			}
			sum=0;



		}
}


}
