class GalToLitTable {
	public static void main (String args []) {
	double gallons,liters;
	int counter;
	counter = 0;
	for (gallons = 1; gallons <= 100; gallons ++) {
		liters = gallons * 3.7854; // transfer to liters;
		System.out.println(gallons + " respectively in gallons " + liters + " liters.");
		counter ++;
		if(counter == 10) {
			System.out.println();
			counter = 0 ; // reset the counter of strings;
			
			}
		}
	}
 }