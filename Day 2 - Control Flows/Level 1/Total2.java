import java.util.Scanner;
public class Total2{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double total= 0.0;
		double n;
		while(true){
			
			n=sc.nextDouble();
			if(n<=0) break;
			total+=n;
		}
		System.out.println("Total value: "+total);
		sc.close();
    }
}