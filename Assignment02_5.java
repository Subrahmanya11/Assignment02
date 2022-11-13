package in.ineuron.main;

import java.util.Scanner;

public class Assignment02_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		if (size <= 0) {
			System.out.println("Enter Size greater than zero");
		} else {
			System.out.println("Enter array Elements: ");
			for (int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			System.out.print("Array elements are: ");
			for (int ele : a) {
				System.out.print(" " + ele);
			}
		int min, temp = 0;
		for (int i = 0; i < a.length; i++) {
			min = i; // Assuming i th value as minimum and compare
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j; // index of minimum value assigned by comparing the array values
				}
			}
			// swaping of i th value with minimum value
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.print("\nSorted Elements are: ");
		for (int ele : a) {
			System.out.print(ele + " ");
		}
	}
  }
}
