import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input : ");
		String str = scanner.nextLine();
		StringCalculator noaman = new StringCalculator();
		int ans = noaman.add(str);
		System.out.println("Total of Positive Numbers : " + ans);
	}

	public int add(String number) {
		List<String> negativeNums = new ArrayList<>();
		List<Integer> positiveNums = new ArrayList<>();
		int total =0;
		try {
			Pattern p = Pattern.compile("(-?[0-9]+)");
			Matcher m1 = p.matcher(number);
			while (m1.find()) {
				boolean isNegative = checknegative(m1.group());
				if (isNegative) {
					negativeNums.add(m1.group());
				} else {
					if(!(Integer.parseInt(m1.group()) > 1000)) {
						total = total + Integer.parseInt(m1.group());
						positiveNums.add(Integer.parseInt(m1.group()));
					}
				}
			}
			if (negativeNums.size() > 0) {
				throw new Exception();
			}
		} catch (Exception n) {
			System.out.println(
					"Negative Numbers are not allowed. You have input below negative number : \n" + negativeNums);
		}
		System.out.println("Positive number in input : \n " + positiveNums);
		return total;
	}

	public boolean checknegative(String num) {
		return Integer.parseInt(num) < 0;
	}
}
