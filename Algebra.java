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

	}

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
	int sum=0;
	if(x1 == 0) return x2;
	if(x2 == 0) return x1;
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
            int total = minus(1, sum);
			return total;
	
		}
	     return sum;
	    }

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int sum=1;
		if(n==0) return 1;
	    if(n==1)return x;
		if(n>0)
		{
			for(int i=0 ; i<n ; i++)
			sum=times(sum,x);
		return sum;
		}
		if(n<0)
		{
			int theN=Math.abs(n);
			if(mod(theN,2)==0)
			{
			for(int i=0 ; i<theN ; i++) sum=times(sum,x);
		return sum;
			}else return minus(0, sum);
		}
 	return sum;
	}
	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		if(x1 == x2)return 1;
		if(x1<x2 && x1==0)return 0;
		if (x2==0) return 0;
		int count = 0;
		if(x1>x2)
		{
			while (x1>=x2) {
				x1=minus(x1, x2);
				count++;
			}
			return count;
		}
		if(x1<0 && x2>0)
		{
		int theX1=Math.abs(x1);
		   while (theX1>=x2) 
		   {
			theX1=minus(theX1, x2);
			count++;
		   }
		   return minus(0,count);	
		}
		if(x2<0 && x1>0)
		{
		int theX2=Math.abs(x2);
		   while (x1>=theX2) 
		   {
			x1=minus(x1,theX2);
			count++;
		   }
		   return minus(0,count);	
		}
		return count;
	}
	// Returns x1 % x2
	public static int mod(int x1, int x2) {
	 int modX=0;
	 modX= minus(x1,times(x2,div(x1, x2)));
	 return modX;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		if(x<0) return -1;
		if (x==0 || x==1)return x;
		
		int epsilon=1;
		int theNumber= x;
		int root =0;
		
	while (epsilon<= theNumber) {
		int half= div((plus(epsilon,theNumber)),2);
		int midSqur= times(half, half);
		if(midSqur==x)return half;
		if(midSqur<x)
		{
			epsilon=half+1;
			root=half;
		}else{
			theNumber= half-1;
		}
	}
     return root;
	
	}		  	  
}