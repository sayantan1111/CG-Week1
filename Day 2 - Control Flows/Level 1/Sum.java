import java.util.Scanner;
public class Sum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		if(n>=0){
		sum=n*(n+1)/2;
		System.out.println("The sum of "+n+" natural number is "+sum);
		}
		else System.out.println("The number "+n+" is not a natural number");
		}
	}