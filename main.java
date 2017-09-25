import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		
		int num = lee.nextInt();
		
		System.out.println(iterSol(num));
		System.out.println(recurSol(num));
		System.out.println(iter_c_lineal(num));
		System.out.println(recur_c_lineal(num));
		
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
	
	public static double iter_c_lineal(int n){
		double sum=1.0;
		if(n<=0)
			return 1.0;
		for(int i=1;i<n; i++){
			sum=(2.0/i*sum)+i+sum;
		}
		return ((2.0/n)*sum)+n;
	}
	
	public static double recur_c_lineal(int n){
		if(n<=0){
			return 1.0;
		}
		return ((2.0/n)*sumat(n-1)+n);
	}
	
	public static double sumat(int n){
		if(n<=0)
			return 1.0;
		double sum=sumat(n-1);
		return ((2.0/n)*sum)+n+sum;
	}

}
