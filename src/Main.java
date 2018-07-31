import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//입력 받기
		String inputString = Input.getInputString(scanner);
		
		//계산 하기
		int result = StringCalculator.doCalc(inputString);
		
		//출력 하기
		Output.print(result);
	}
}
