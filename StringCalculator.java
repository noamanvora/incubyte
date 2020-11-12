import java.util.Scanner;
 
public class StringCalculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		String str = sc.nextLine();
		StringCalculator noaman = new StringCalculator();
		int ans = noaman.add(str);
		System.out.println(ans);
	}

	public int add(String number)
	{
		int total=0;
		if(number.isEmpty())
		{
			return 0;
		}
		else
		{
			String[] arrnumber = number.split(",");
			for(String array : arrnumber)
			{
				total=total+ Integer.parseInt(array);	
			}
		}
		return total;
	}
}