import java.util.Scanner;

public class Input {
	public static String getInputString(Scanner scanner) {
		System.out.println("공백으로 구분된 문자열 형식으로 계산식을 입력하세요. ");
		String inputString = scanner.nextLine();
		return inputString;
	}
}
