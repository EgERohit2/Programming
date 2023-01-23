package selfLearning;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int n = 1; n <= 50; n++) {

			int count = 0;

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("prime number :" + n);
			} 

		}

	}
}
