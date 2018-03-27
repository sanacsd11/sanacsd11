
public class TestArrayEx {
	public static void main(String[] args) {

		double[] myList = { 6.2, 1.9, 2.4, 3.5, 5.2, 3.5, 1.0, 0.5, 6.1 };

		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + " ");
		}

		{
			System.out.println("################# ");
		}

		// Total
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println(" Total is " + total);

		{
			System.out.println("################# ");
		}

		// Max
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max)
				max = myList[i];
		}
		System.out.println("Max is " + max);

		{
			System.out.println("################# ");
		}

		// Min
		double min = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] < min)
				min = myList[i];

		}
		System.out.println("  Min is " + min);

	}
}
