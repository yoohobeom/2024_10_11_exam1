import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int num2 = sc.nextInt();

		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < num; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}
}
