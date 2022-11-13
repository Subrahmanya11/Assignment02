package in.ineuron.main;

import java.util.Scanner;

class Sort {
	int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i = low;
		int j = high;
		while (i < j) {
			while ((a[i] <= pivot) && (i < high)) {
				i++;
			}

			while (a[j] > pivot) {
				j--;
			}

			if (i < j) {
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		int temp = a[low];
		a[low] = a[j];
		a[j] = temp;

		return j;

	}

	void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int loc = partition(a, low, high);
			quickSort(a, low, loc - 1);
			quickSort(a, loc + 1, high);
		}
	}
}

public class Assignment02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter the Elements of Array: ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		Sort qs = new Sort();

		qs.quickSort(a, 0, size - 1);

		System.out.print("Elemets after Sorting: ");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
