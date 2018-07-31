import java.util.Scanner;

public class Calculator {

	static long calculate(String inputString) {
		String[] onlyInputValues = Utils.getOnlyValues(inputString);
		String[] onlyExprs = Utils.getOnlyExprs(inputString);
		
		long result = Long.parseLong(onlyInputValues[0]);
		for(int i = 0; i < onlyExprs.length; i++) {
			if("+".equals(onlyExprs[i])) {
				result = result + Long.parseLong(onlyInputValues[i+1]);
				System.out.println("덧셈 : " + result);
			} else if ("-".equals(onlyExprs[i])) {
				result = result - Long.parseLong(onlyInputValues[i+1]);
				System.out.println("뺄셈 : " + result);
			} else if ("*".equals(onlyExprs[i])) {
				result = result * Long.parseLong(onlyInputValues[i+1]);
				System.out.println("곱셈 : " + result);
			} else if ("/".equals(onlyExprs[i])) {
				result = result / Long.parseLong(onlyInputValues[i+1]);
				System.out.println("나눗셈 : " + result);
			} else {
				System.out.println("사칙연산 기호가 아닙니다. ");
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = Input.getInputValues(scanner);
		long result = calculate(inputString);
		Output.print(result);
		scanner.close();
	}
}
