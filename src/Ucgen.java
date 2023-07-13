import java.util.Scanner;

public class Ucgen {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n, i, j;
		System.out.print("Ters ucgen kac basamaklý olacak?: ");
		n = s.nextInt();
		
		for(i=1; i<=n ;i++)
		{
			for(j=n; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}