package base;
import java.util.Scanner;
import org.apache.poi.ss.formula.functions.Finance;

/**
 * This class contains 4 attributes: tuition, percentIncrease, apr, and repayMonths.
 * The values for each of the attributes are either entered through the scanner or are
 * inputed when the instance of the class is created.
 * The class contains two methods. totalCost() calculates the total cost of a 4 year college
 * education based on current tuition and the rate of increase each year.
 * payentCalc()  calculates the monthly payments required to pay off a student loan in the specified
 * number of months at the current annual interest rate using the pmt function of the Finance library.
 * 
 * @author Colby Banbury
 *
 */

public class TuitionBill {
	Scanner in = new Scanner( System.in );
	private double tuition;
	private double percentIncrease;
	private double apr;
	private int repayMonths;
	
	TuitionBill(){
		System.out.println("enter your yearly tuition:");
		tuition = in.nextDouble();
		
		System.out.println("enter the percent yearly increase of your tuition:");
		percentIncrease = in.nextDouble();
		
		System.out.println("enter the annual percentage rate:");
		apr = in.nextDouble();
		
		System.out.println("enter how many Months you want it to take to repay:");
		repayMonths = in.nextInt();
	}
	
	TuitionBill(double t, double p, double a, int m){
		tuition = t;
		
		percentIncrease = p;
		
		apr = a;
		
		repayMonths = m;
	}
	
	
	public double totalCost()  {
		double percent = 1 + (percentIncrease/100);
		double tuition2 = (tuition * percent);
		double tuition3 =  (tuition2 * percent);
		double tuition4 =  (tuition3 * percent);
		double total = tuition + tuition2 + tuition3 + tuition4;
		return(total);
	}
	
	public double paymentCalc() {
		double p = totalCost();
		
		double payment = Finance.pmt(apr/12, repayMonths, -p);
		return(payment);
		
	}
	
	
	
	
	
}
