package ft6;
import static org.junit.Assert.assertTrue;
import java.util.Scanner; 
public class cubesquare{ 
	public static void main(String[] args) 
	{ 
		try{ 
			Scanner s=new Scanner(System.in); 
			System.out.println("Enter an number"); 
			double n=s.nextDouble(); 
			double a=0,b=0; 
			a=n*n; 
			b=n*n*n; 
			System.out.println("The square of number="+a); 
			System.out.println("The cube of number="+b); 
			assertTrue(25==a);
			assertTrue(125==b);
		}
		catch(Exception e) 
		{ 
			System.out.println("Invalid"); 
		} 
	}
}

