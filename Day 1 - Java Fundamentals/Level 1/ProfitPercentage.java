public class ProfitPercentage{
	public static void main(String args[]){
		int cp=129;
		int sp=191;
		int profit=sp-cp;
		double profitPerc = ((double)profit/cp)*100;
		System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\n The Profit is INR "+profit+" and the Profit Percentage is "+profitPerc);
		}
	}