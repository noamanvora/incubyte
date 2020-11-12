import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input : ");
		String str = sc.nextLine();
		StringCalculator noaman = new StringCalculator();
		int ans = noaman.add(str);
		System.out.println("Total of Positive Numbers : " + ans);
	}

	public int add(String number) {
		int total = 0;
		List<String> negativeNums = new ArrayList<String>();
		try {

			Pattern p = Pattern.compile("(-?[0-9]+)");
			Matcher m1 = p.matcher(number);
			ArrayList<Integer> positiveNums = new ArrayList<Integer>();

			while (m1.find()) {
				boolean isNegative = checknegative(m1.group());
				if (isNegative) {
					negativeNums.add(m1.group());
				} else {
					if(!(Integer.parseInt(m1.group()) > 1000)) {
						positiveNums.add(Integer.parseInt(m1.group()));	
					}
				}
			}

			for (Integer n : positiveNums) {
				total = total + n;
			}
			System.out.println("Positive numbers in input : " + positiveNums);
			if (negativeNums.size() > 0) {
				throw new Exception();
			}
		} catch (Exception n) {
			System.out.println(
					"Negative Numbers are not allowed. You have input below negative number : \n" + negativeNums);
		}
		return total;
	}

	public boolean checknegative(String num) {
		return Integer.parseInt(num) < 0;
	}
}
