import java.util.Scanner;
public class Total{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double total= 0.0;
		double n;
		n=sc.nextDouble();
		while(n!=0){
			total+=n;
			n=sc.nextDouble();
		}
		System.out.println("Total value: "+total);
		sc.close();
    }
}