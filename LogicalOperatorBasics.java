class LogicalOperatorBasics
{
 
    public static void main(String args[])
    {
         System.out.println(true  || true);    //true
	 
         System.out.println(true  || false);   // true
	 
         System.out.println(false || true);    // true 
         
         System.out.println(false || false);	// false
 
	 System.out.println(true  && true);	// true
 
	 System.out.println(true  && false);   // false
 
         System.out.println(false && true);     //false
 
	 System.out.println(false && false);    // false
 
	 System.out.println(!true);             // false
   
         System.out.println(!false);            // true
 
	 System.out.println(13>10 || 13<10);     // true  (true || false)
 
	 System.out.println(13>10 && 13<10);     // false  (true && false)
   
        // System.out.println(!13>10  );           //error
   
         System.out.println( !(13==10) );       // true   !(false)
          
         
    }
}