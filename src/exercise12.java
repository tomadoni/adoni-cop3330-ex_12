import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    int principal=0;
	    double rate=0;
	    int year=0;
	    System.out.println("Enter the principal: ");
	    principal= kb.nextInt();
	    System.out.println("Enter the rate of interest: ");
	    rate= kb.nextDouble();
	    double newRate= rate/100;
	    System.out.println("Enter the number of years: ");
	    year= kb.nextInt();
	    double result= principal*(1+newRate*year);
	    System.out.println("After "+year+" years at "+rate+"%, the investment will be worth $"+result+".");

    }
}
