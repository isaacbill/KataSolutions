package kata;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileyFaces {
	private static final Pattern pattern = Pattern.compile("[:;][-~]?[)D]");
	
	public static void main(String[] args)
	  {

	    List<String> arrow = Arrays.asList(":-) ;~D :) ;D", "isaac :-) ;) :)) ");

	    System.out.println("found: " + countSmileys(arrow));

	  }

	    public static int countSmileys(List<String> arrow) {

	      int count = 0;
	      for (String x : arrow) {
	          Matcher matcher = pattern.matcher(x);

	          while(matcher.find()) {
	              count++;
	          }            
	      }

	      return count;
	    }


}
