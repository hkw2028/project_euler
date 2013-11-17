package problem_12;

public class HighlyDivisibleTriangularNumber {
	/**
	    * @param args
	    */
	   public static void main(String[] args) throws Exception{
	      // TODO Auto-generated method stub
	      long startTime = System.currentTimeMillis();
	      findFirstTriangleNumberHavingOver500Divisors();
	      System.out.println( "time duration : "+( System.currentTimeMillis() - startTime ));
	   }
	   
	   private static void findFirstTriangleNumberHavingOver500Divisors() throws Exception{
	      
	      int i = 1;
	      long triangleNumber = 0;
	      do{
	         triangleNumber = generateTriangleNumber( i );
	         ++i;
	      }while( findNumberOfDivisors( triangleNumber ) < 500 );
	      System.out.println("TriangleNumberHavingOver500Divisors is "+triangleNumber);
	   }
	   
	   private static final long generateTriangleNumber( final long numbers ){
	      long triangleNumber = 0;
	      for( int i = 1; i <= numbers ; ++i ){
	         triangleNumber += i;
	      }
	      return triangleNumber;
	   }
	   
	   private static long findNumberOfDivisors( final long targetNumber ) throws Exception{
	      final long upperBound = ( long )Math.floor( Math.sqrt(  targetNumber ) );
	      final double root = Math.sqrt(  targetNumber );
	      long numberOfFactors = 0;
	      for( int i = 1 ; i <= upperBound ; ++i ){
	         if( targetNumber % i == 0 ){
	            assert Double.compare( i, root ) <= 0;
	            if( Double.compare( i, root ) < 0 ){
	               numberOfFactors += 2;
	            }else if( Double.compare( i, root ) == 0 ){
	               numberOfFactors += 1;
	            }				
	         }
	      }
	      return numberOfFactors;
	   }
	   
	  // @Test
	   public void testFindNumberOfFactors() throws Exception{
	      System.out.println( findNumberOfDivisors( 10 ) );
	      System.out.println( findNumberOfDivisors( 6 ) );
	      System.out.println( findNumberOfDivisors( 16 ) );
	      System.out.println( findNumberOfDivisors( 12 ) );
	   }
	   
	  // @Test
	   public void testGenerateTriangleNumber() throws Exception{
	      for( int i = 1 ; i < 11 ; i++ ){
	         System.out.print( generateTriangleNumber( i )+" " );
	      }
	   }
}
