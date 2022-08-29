import java.util.ArrayList;
import java.util.Scanner;

//Quando digitar valor menor igual a zero, continuar pedindo o número - Dica: Usar do while
public class FizzBuzz_1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num= 0;
	

		System.out.println("Insert a number: ");
		num = read.nextInt();

		for (int i = 1; i <= num; i++) {
		do {
			 {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");

				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);

				}
			}
//		}
		} while (num > 0 && num < i);
	}
}
}
