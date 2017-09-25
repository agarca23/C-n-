import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		
		int num = lee.nextInt();
		
		System.out.println("C(n) para "+ num + " es " + recurSol(num));
		
		lee.close();
		

	}
	
	public static double iterSol(int n){
		
		double [] c = new double[n+1];
		c[0]=1;
		for(int i=1; i<=n;i++){
			double sum=0.0;
			
			for(int j=0; j<i;j++){
				sum+=c[j];
			}
			c[i]=(2.0/i)*sum+1;
		}
		
		return c[n];
	}
	
	public static double recurSol(int n){
		double sum=0.0;
		if(n<=0){
			return 1.0;
		}
		else{
			
			for(int i=0; i<n;i++){
				sum=sum+recurSol(i);
				
			}
			
			return ((2.0/n)*sum+n);
		}
		
		
	}
	
//	public static double iterBestSol(){
//		double sum=1.0;
//		for(int i=1; i<n; i++){
//			sum=((2.0/n)*sum)+n;
//		}
//	}

}
