class InchToMeter {
	public static void main (String args []) {
	double inches, meters;
	int foots;
	foots = 0;
		for (inches = 1; inches <= 144; inches ++) {
		meters = inches * 39.37; // transfer to meters from inches;
		System.out.println(inches + " respectively in inches " + meters + " meters.");
		foots ++;
		if(foots == 12) {
			System.out.println();
			foots = 0 ; // reset the value of foots to 0;
			
			}
		}
	}
 }