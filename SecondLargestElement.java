// WAP to find the second largest number in an array without sorting

package selfLearning;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 22, 32, 2 };
		int large = a[0];
		int slarge = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				slarge = large;
				large = a[i];
			} else if (a[i] > slarge && a[i] != large) {
				slarge = a[i];
			}
		}
		System.out.println("largets :" + large);
		System.out.println("second largets :" + slarge);

	}

}
