import java.util.Scanner;
public class Discount{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int fee = sc.nextInt();
		int discountPercent = sc.nextInt();
		double discount=fee*discountPercent/100.0;
		double amount=fee-discount;
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR " +amount );
		}
	}