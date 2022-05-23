import java.util.ArrayList;
import java.util.Scanner;
public class City
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList Al=new ArrayList();
		System.out.println("Enter number of citied you want in the arraylist: ");
		int n = sc.nextInt();
		System.out.println("Enter the names of the cities: ");
		for(int i=1;i<=n;i++)
		{
			Al.add(sc.next());
		}
		System.out.println("The cities entered are: "+Al);
		Al.removeAll(Al);
		System.out.println("The cities are removed sucessfully"+Al);
		}
}




 





