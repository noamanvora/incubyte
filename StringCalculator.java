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
		try {

			Pattern p = Pattern.compile("(-?[0-9]+)");
			Matcher m1 = p.matcher(number);
			ArrayList<Integer> list = new ArrayList<Integer>();

			while (m1.find()) {
					list.add(Integer.parseInt(m1.group()));
			}
			
			for (Integer n : list) {
				total = total + n;
			}
		} catch (NegativeNumberException n) {
			System.out.println(n);
		}
		return total;
	}
}