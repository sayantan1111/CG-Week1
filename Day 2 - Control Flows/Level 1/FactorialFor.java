import java.util.Scanner;
public class FactorialFor{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		if(n>0){
		int fact=1;
		for(int i=n;i>0;i--){
			fact*=i ;
		}
		System.out.println("factorial: "+fact);
		
		}
		else System.out.println("Enter a natural number");
		sc.close();
    }
}