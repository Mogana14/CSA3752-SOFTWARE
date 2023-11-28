package mt2;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
class intrest 
{
	public static void main(String[] args)
	{ 
		Scanner sc =new Scanner(System.in);
		float P=sc.nextFloat(); 
		float R=sc.nextFloat(); 
		float T=sc.nextFloat(); 
		float SI = (P * T * R) / 100; 
		System.out.println("Simple interest = " + SI);
		assertTrue(3600==SI);
		}
	}
