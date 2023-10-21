import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Temperature Conversions Between Celcius and Fahrenheit");
		int result=sc.nextInt();
		if (result==1) {
			System.out.println("Fahrenheit to Celsius");
			System.out.println("Enter Fahrenheit Value :");
			double Fahrenheit = sc.nextDouble();
			double Celsius = (Fahrenheit - 32)* 5/9;
			System.out.println("Celsius is "+Celsius);
		}
		else if(result==2) {
			System.out.println("Celsius to Fahrenheit");
			System.out.println("Enter Celsius Value :");
			double Celsius = sc.nextDouble();
			double Fahrenheit = (Celsius * 9/5)+ 32;
			System.out.println("Fahrenheit is "+Fahrenheit);
		}
		else {
			System.out.println("Not a valid choice!");
		}		
	}

}