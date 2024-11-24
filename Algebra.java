// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
		System.out.println(plus(-1,3));   // -1+3
		System.out.println(plus(-1,-5));   // -1+-5
	    System.out.println(minus(7,2));  // 7 - 2
		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
		/* 
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
		 */
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
	int sum=0;
	if(x1 == 0) return x2;
	if(x2 == 0) return x1;


	// if x1,x2>0
    if(x1 >0 && x2 > 0)
	{
	  for(int i=0 ; i < x2 ; i++) sum++; 
	  for(int j=0 ; j < x1 ; j++ )sum++;
	return sum;
	}
	if(x1<0 && x2 > 0)
	{
		sum=x2;
		for(int i=0 ; i <Math.abs(x1); i++) sum--;
        return sum;
	}

	if(x2<0 && x1>0)
	{
		sum=x1;
		for(int i=0 ; i <Math.abs(x2); i++)sum--;
        return sum;
	}
	// if x1,x2<0
	if(x1<0 && x2<0)
	{
		for(int i=0 ; i < Math.abs(x2); i++)sum--; 
		for(int j=0 ; j < Math.abs(x1) ; j++ )sum--;	
	    return sum;
	}
    return sum;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int sum = 0 ;
		if(x1 == x2) return sum;
		if(x1>0 && x2>0)
		{
	      sum= x1;
		   for(int i=0 ; i<x2; i++)sum--;
		   return sum;
		}
		 if(x1>0 && x2<0)
		 {
			sum=x1;
			for(int i=0;i<Math.abs(x2);i++) sum++;
			return sum;
		 }
		 if(x2>0 && x1<0)
		 {
			sum=x2;
			for(int i=0;i<Math.abs(x1);i++) sum++;
			return sum;
		 }
		 if(x1<0 && x2<0)
		 {
			sum=x1;
			for(int i=0;i<Math.abs(x2);i++) sum++;
			return sum;
		 }
         return sum;
		 }
		


	

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int sum=0;
		if(x1==0 || x2==0) return sum;
		if(x2==1) return x1;
		if(x1==1) return x2;
		//if x1,x2>0
		if(x1>0 && x2>0){
			for(int i=0 ; i<x2 ; i++)
				sum=plus(sum,x1);
			return sum;
		}
		/* 
		if(x1<0 && x2<0){
			int newX1=Math.abs(x1);
			for(int i=0 ; i<Math.abs(x2) ; i++)
				sum=sum+ plus(sum, newX1);
            return sum;
		}
		if((x1 <0 && x2>0)||(x1 > 0 && x2<0))
		{
			int theX1=Math.abs(x1);
			int theX2=Math.abs(x2);
			for(int i=0 ; i<theX2 ; i++)
				sum=sum+ plus(sum, theX1);
            int total = 0 -sum;
			return total;

		}
			*/
	return sum;

	}


	/* 
	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		return 0;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		return 0;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		return 0;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		return 0;	
	}
		*/
		  	  
}