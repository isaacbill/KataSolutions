package kata;

public class PopulationGrowth {
	public static void main(String[] args) {
		
	}
		public static int nbYear(int p0, double percent, int aug, int p) {
	        // your code
	      int year = 0;
	        int population = p0;
	        while (population < p) {
				population += population*percent/100 + aug;
				year++;
	        }
	        return year;
		
	}

}
