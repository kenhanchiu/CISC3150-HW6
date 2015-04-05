import java.io.Console;
import java.lang.*;

public class Calculator{
	public static void main(String[] args){
		Console c = System.console();
		double firstparameter = Double.parseDouble(args[0]);
		String secondparameter = args[1];
		double thirdparameter = Double.parseDouble(args[2]);
		int a = 0;
		if(secondparameter.equals("+")){
			System.out.println(firstparameter + thirdparameter);
			a = 1;
		}
		if(secondparameter.equals("-")){
			System.out.println(firstparameter - thirdparameter);
			a = 1;
		}
		if(secondparameter.equals("*")){
			System.out.println(firstparameter * thirdparameter);
			a = 1;
		}
		if(secondparameter.equals("/")){
			if(thirdparameter == 0){
				throw new IllegalArgumentException("Cannot divide by 0!");
			}
			else{
			System.out.println(firstparameter / thirdparameter);
			a = 1;
			}
		}
		if(secondparameter.equals("%")){
			if(thirdparameter == 0){
				throw new IllegalArgumentException("Cannot divide by 0!");
			}
			else{
				System.out.println(firstparameter % thirdparameter);
				a = 1;
			}
		}
		if(a != 1){
			throw new IllegalArgumentException("Not an operation!");
		}
	}
}