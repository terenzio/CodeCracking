//Given an array of single digit numbers, return the index of the first smallest prime number. 
//Where the prime number is made by combining the numbers. So for [1, 0, 7, 6, 7, 2, 9, 2], 
//the index returned would be 3, since 107 is the first prime. And what's the complexity. 

public class primeCalc1 
{

  public static void main(String[] arg) 
  {

		int[] anArray;              // declares an array of integers

        anArray = new int[8];      // allocates memory for 10 integers
          
        anArray[0] = 1; // initialize first element
        anArray[1] = 0; // initialize second element
        anArray[2] = 7; // etc.
        anArray[3] = 6;
        anArray[4] = 7;
        anArray[5] = 2;
        anArray[6] = 9;
        anArray[7] = 2;
        
        System.out.println("Element at index 0: " + anArray[0] + " is Prime? " + checkPrimeOrNot(anArray[0]));
        System.out.println("Element at index 1: " + anArray[1] + " is Prime? " + checkPrimeOrNot(anArray[1]));
        System.out.println("Element at index 2: " + anArray[2] + " is Prime? " + checkPrimeOrNot(anArray[2]));
        System.out.println("Element at index 3: " + anArray[3] + " is Prime? " + checkPrimeOrNot(anArray[3]));
        System.out.println("Element at index 4: " + anArray[4] + " is Prime? " + checkPrimeOrNot(anArray[4]));
        System.out.println("Element at index 5: " + anArray[5] + " is Prime? " + checkPrimeOrNot(anArray[5]));
        System.out.println("Element at index 6: " + anArray[6] + " is Prime? " + checkPrimeOrNot(anArray[6]));
        System.out.println("Element at index 7: " + anArray[7] + " is Prime? " + checkPrimeOrNot(anArray[7]));
        
        String num = "";
        
        for (int i=0; i<anArray.length; i++) {
        	
        	int ind = 0;
        	     
        	num = num + String.valueOf(anArray[i]);
        			
        	if (Integer.parseInt(num)!=1){
        		System.out.print(num);
            	System.out.println(" is prime? " + checkPrimeOrNot(Integer.parseInt(num)));
            	if (checkPrimeOrNot(Integer.parseInt(num)))
            	{
            		ind = i+1;
            		System.out.println("Prime found at Element: " + ind);
            	}           		            		
        	}        	        
        }        
  }
  
    static boolean checkPrimeOrNot(int input) {
	 
	    int factor = 0;
	  
	    for (int i = 2; i<Math.sqrt(input); i++) {
		  if ((input%i)==0) {
			  factor++;
			 System.out.println("result: " +input+ "/" +i+ "= "+(input%i));
		  } 
			  
	    }
	  
	  if (factor >= 2)
		  return false;
	  else
		  return true;	  	 //asdasd 
    }
 
//sdasdasdasdasdasd
}