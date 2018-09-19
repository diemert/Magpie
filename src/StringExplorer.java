/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  Try other methods here:
		//  Demonstrate the toUpperCase method.
		String upperCase = sample.toUpperCase();
		System.out.println ("sample.toUpperCase() = " + upperCase);

		int notFoundPsn = sample.indexOf("slow"); 
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		
		// Experiment with compareTo
		String example1 = "a";
		String example2 = "7";
		System.out.println(example1.compareTo(example2));
		
		// Experiment with substring
		String starter = "start56 middle end";
		int psn1 = starter.indexOf("middle");
		System.out.println(starter.substring(psn1, psn1 + "middle".length()));
	}
}