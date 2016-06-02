import java.util.Arrays;
import java.util.Random;

public class Main {
	private static Random r = new Random();

	public static void main(String[] args) {
		int a;
		int b;
		int c[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < 10_000_000; i++) {
			a = r.nextInt(6) + 1;
			b = r.nextInt(6) + 1;
			c[a + b]++;
		}
		System.out.println(Arrays.toString(c));

	}

}
