import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		if(number>0){
		for(int i=1;i<=number;i++){
			if(i%2==0) System.out.println(i+" is even number");
			else System.out.println(i+" is odd number");
		}
		}
		else System.out.println("Enter a natural number");
		sc.close();
		}
	}