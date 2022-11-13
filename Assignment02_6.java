package in.ineuron.main;

import java.util.Scanner;

class Subset {
	boolean subsetArray(int a[], int b[]) {
		int i = 0;
		int j = 0;
		for (i = 0; i < b.length; i++) {
			for (j = 0; j < a.length; j++) {
				if (b[i] == a[j])
					break;
			}
			if (j == a.length)
				return false;
		}
		return true;
	}
}

public class Assignment02_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an array a: ");
		int size1 = sc.nextInt();
		int[] a = new int[size1];
		System.out.println("Enter array Elements");
		for (int i = 0; i < size1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter Size of an array b: ");
		int size2 = sc.nextInt();
		int[] b = new int[size2];
		System.out.println("Enter array Elements");
		for (int i = 0; i < size2; i++) {
			b[i] = sc.nextInt();
		}

		System.out.print("Array elements of a[]: ");
		for (int ele : a) {
			System.out.print(" " + ele);
		}
		System.out.print("\nArray elements of b[]: ");
		for (int ele : b) {
			System.out.print(" " + ele);
		}
		Subset s = new Subset();
		if (s.subsetArray(a, b)) {
			System.out.println(" \n b is a subset of an array a ");
		} else {
			System.out.println("\n b is not a subset of an array a ");
		}
	}
}
