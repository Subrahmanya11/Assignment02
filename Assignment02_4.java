package in.ineuron.main;

import java.util.Scanner;

public class Assignment02_4 {
	public static void merge(int a[], int l, int m, int h) {
		int i, j, k = l;
		int b[] = new int[h + 1];

		for (i = l, j = m + 1; i <= m && j <= h; k++) {

			if (a[i] <= a[j])
				b[k] = a[i++];
			else
				b[k] = a[j++];
		}
		while (i <= m)
			b[k++] = a[i++];

		while (j <= h)
			b[k++] = a[j++];

		for (i = l; i <= h; i++)
			a[i] = b[i];
	}

	public static void Sort(int a[], int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			Sort(a, l, m);
			Sort(a, m + 1, h);
			merge(a, l, m, h);

		}

	}

	public static void printarray(int a[]) {
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "  ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " + size + " elements ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("elements in array ");
		printarray(a);
		Sort(a, 0, size - 1);
		System.out.println("\nelements after sorting");
		printarray(a);

	}

}
