public class calc {
	public static void main(String[] args) {
		if (args.length > 0) {
			switch(args[0]) {
				case "--add"  :  addition(args);
							 	break;
				case "--sub"  :  subtraction(args);
							 	break;
				case "--mult" :  multiplication(args);
							 	break;
				case "--div"  :  division(args);
							 break;
				case "--pow"  :  exponentiation(args);
							 break;
				default       :  System.out.println("\nI don't recognize \""+args[0]+"\" as a command.");
							 	 System.out.println("\nValid Commands:");
							 	 System.out.println("--add: Addition, --sub Subtraction");
							 	 System.out.println("--mult: Multiplication, --div: Division");
							 	 System.out.println("--pow: Exponentiation\n");
			}
		} else {
	 	 System.out.println("\nValid Commands:");
	 	 System.out.println("--add: Addition, --sub Subtraction");
	 	 System.out.println("--mult: Multiplication, --div: Division");
	 	 System.out.println("--pow: Exponentiation\n");
		}
	}
	
	static void addition(String[] args) {
		double sum = 0;
		if (args.length >= 3) {
			for (int i = 1; i < args.length; i++) {
				double addend = Double.valueOf(args[i]);
				sum += addend;
				System.out.print(addend);
				if (i < args.length - 1) {
					System.out.print(" + ");
				}
			}
			System.out.println(" = "+sum);
		} else {
			System.out.println("\nAddition requires two or more values.\n");
			System.out.println("format example: --sub <addend> <addend> ...\n");
		}	
	}
	
	static void subtraction(String[] args) {
		if (args.length == 3) {
			double minuend = Double.valueOf(args[1]);
			double subtrahend = Double.valueOf(args[2]);
			double difference = minuend - subtrahend;
			System.out.println(minuend+" - "+subtrahend+" = "+difference);
		} else {
			System.out.println("\nSubtraction can only be done with two numbers.\n");
			System.out.println("format example: --sub <minuend> <subtrahend>\n");
		}
	}
	
	static void multiplication(String[] args) {
		double product = 1;
		if (args.length >= 3) {
			for (int i = 1; i < args.length; i++) {
				double factor = Double.valueOf(args[i]);
				product *= factor;
				System.out.print(factor);
				if (i < args.length - 1) {
					System.out.print(" * ");
				}
			} 
			System.out.println(" = "+product);
		} else {
			System.out.println("\nMultiplication requires two or more values.\n");
			System.out.println("format example: --mult <factor> <factor> ...\n");
		}
	}
	
	static void division(String[] args) {
		
		if (args.length == 3 && divisor != 0) {
			double dividend = Double.valueOf(args[1]);
			double divisor = Double.valueOf(args[2]);
			double quotient = dividend / divisor;
			System.out.println(dividend+" / "+divisor+" = "+quotient);
		} else {
			System.out.println("\nDivision can only be done with two numbers.");
			System.out.println("format example: --div <dividend> <divisor>");
			System.out.println("**the divisor cannot be equal to 0**\n");
		}
	}
	
	static void exponentiation(String[] args) {
		double base = Double.valueOf(args[1]);
		double exponent = Double.valueOf(args[2]);
		if (args.length == 3 && exponent % 1 == 0 && exponent >= 0) {
			double exponentiation = 1;
			for (int i = 1; i <= exponent; i++) {
					exponentiation *=base;
			}
			System.out.println(base+" raised to the power of "+exponent+" = "+exponentiation);
		} else {
			System.out.println("\nExponentiation requires two values.\n");
			System.out.println("format example: --pow <base> <exponent>");
			System.out.println("**the exponent must be a positive integer**\n");
		}
	}
}