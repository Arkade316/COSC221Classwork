
/**
 * Declare a two-dimensional Integer array named grades with 30 rows and 10 columns then
 * calculates the average of all the elements in the grades array.
 * @author Kade Lawson
 *
 */
public class COCS221HomeWork6 {
	private static double total ;
	private static int numOfElements ;
	private static double average;
	
/** This method creates an array and returns that array */
	 static  double [][] createArray()
	 {
		
		 double [][] grades = new double[30][10];
		
		 return grades;
	}
	 
	 /** This method loop through a Double array and add all the element values together and return the total*/
	 static double arrayElementsAverage(double [][] a)
	 {
		
		
		for(int index = 0;index<a.length;++index) 
		{
			for(int count =0;count<10;++count) 
			{
				
				total += a[index][count];
			
			}
		}
		return total;
		
	 }
	 
	 
	 
	 /** This method takes in an type double value and return the averages*/
	 static double gradeAverages(double av) 
	 {
		 
		 average = av/numOfElements;
		 
		 return average;
	 }
	 
	 public static void main(String [] args) 
	 {
	
		  arrayElementsAverage(createArray());
		  gradeAverages(total);
		  System.out.println("The average is " + average);


	 }
}
