
public class StringCalculator {
	public static int doCalc(String inputString) {
		String[] splittedString = Utils.getSplittedString(inputString);

		int i = 1;
		int result = Integer.parseInt(splittedString[0]);
		while (i < splittedString.length) {
			result = calculator(result, splittedString[i], Integer.parseInt(splittedString[i+1]));
			i += 2;
		}
		
		return result;
	}
	
	public static int calculator(int result, String expr, int next) {
		if ("+".equals(expr)) {
			result = result + next;
			System.out.println("덧셈 : " + result);
		} else if ("-".equals(expr)) {
			result = result - next;
			System.out.println("뺄셈 : " + result);
		} else if ("*".equals(expr)) {
			result = result * next;
			System.out.println("곱셈 : " + result);
		} else if ("/".equals(expr)) {
			result = result / next;
			System.out.println("나눗셈 : " + result);
		}
		return result;
	}
}
