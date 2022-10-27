import java.util.InputMismatchException;
import java.util.Scanner;
public class Java
{
public static int quotient( int a, int b ) throws
ArithmeticException
{
	
return a/b;

}
public static void main( String args[] )
{
	
Scanner scanner = new Scanner( System.in );
boolean condition= true;
do
{
	
try

{
System.out.print( "Please enter  numerator: " );

int a= scanner.nextInt();

System.out.print( "Please enter denominator: " );

int b = scanner.nextInt();
int result = quotient( a, b );

System.out.printf( "\nResult: %d / %d = %d\n", a,
b, result );
condition = false; 
}
catch ( InputMismatchException e )
{
System.err.printf( "\nException: %s\n",e );
scanner.nextLine();
System.out.println( "You must enter integers. Please try again.\n" );
}catch ( ArithmeticException e )
{
System.err.printf( "\nException: %s\n", e );
System.out.println( "Zero is an invalid denominator. Please try again.\n" );
}
} while ( condition );
scanner.close();
}
}
