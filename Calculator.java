public class Calculator {
	public static void main(String[] args) {
		String command = args[0];
		switch(command) {
			case "--add"  : add(args);
							break;
			case "--sub"  : System.out.println("You want to subtract");
							break;
			case "--mult" : System.out.println("You want to multiply");
							break;
			default		  : System.out.println("I don't know what you want to do");
		}
	}
	
	static void add(String[] args) {
		double sum = 0;
		for(int i = 1; i < args.length; i++) {
			double addend = Double.valueOf(args[i]);
			System.out.print(addend);
			if(i < args.length - 1) {
				System.out.print(" + ");
			}
			sum += addend;
		}
		System.out.println(" = " + sum);
	}
}