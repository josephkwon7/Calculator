import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫 번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("두번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}
	
	static String getSymbol(Scanner scanner) {
		System.out.println("사칙연산 기호 : ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}

	static int calculate(int first, String symbol, int second) {
		int result = 0;
		if("+".equals(symbol)) {
			result = first + second;
			System.out.println("덧셈 : " + result);
		} else if ("-".equals(symbol)) {
			result = first - second;
			System.out.println("뺄셈 : " + result);
		} else if ("*".equals(symbol)) {
			result = first * second;
			System.out.println("곱셈 : " + result);
		} else if ("/".equals(symbol)) {
			result = first / second;
			System.out.println("나눗셈 : " + result);
		} else {
			System.out.println("사칙연산 기호가 아닙니다. ");
		}
		return result;
	}
	
	static void print(int result) {
		System.out.println("실행 결과 : " + result);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result = getFirstValue(scanner);

		while (true) {
			String symbol = getSymbol(scanner);
			
			if ("quit".equals(symbol)) {
				print(result);
				break;
			}

			int second = getSecondValue(scanner);
			
			result = calculate(result, symbol, second);
		}
		
		scanner.close();
			
	}
}
