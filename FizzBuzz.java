import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();

				for(int y=1; y<=a; y++) {
					String i = y + ",";

				if(y%15 == 0) {
						i = "FizzBuzz,";
					} else if(y%3 == 0) {
						i = "Fizz,";
					} else if(y%5 == 0) {
						i = "Buzz,";
					}
						System.out.print(i);
				}
	}
}
