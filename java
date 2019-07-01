static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Allowing for user input
		System.out.println("Please enter the first number");
		int fnum = input.nextInt();
		System.out.println("Please enter the second number");
		int snum = input.nextInt();
		input.close();
		
		//my work engine
		int sum1 = fnum + snum;
		int sub = fnum - snum;
		int multi = fnum * snum;
		int div = fnum / snum;
		int mod = fnum % snum;
		
		//Print out result
		System.out.println("Adding the first number " +fnum +" to the second number "+ snum + " will equal: " + sum1 +".");
		System.out.println();
		System.out.println("Subtracting the first number " +fnum +" from the second number "+ snum + " will equal: " + sub +".");
		System.out.println();
		System.out.println("Multiplying the first number " +fnum +" by the second number "+ snum + " will equal: " + multi +".");
		System.out.println();
		System.out.println("Dividing the first number " +fnum +" by the second number "+ snum + " will equal: " + div +".");
		System.out.println();
		System.out.println("Modulating the first number " +fnum +" by the second number "+ snum + " will equal: " + mod +".");
	}
	
}
