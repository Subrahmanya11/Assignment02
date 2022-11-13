package in.ineuron.main;

import java.util.Scanner;

public class Assignment02_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		if (size <= 0) {
			System.out.println("Enter Size greater than zero");
		} else {
			System.out.println("Enter array Elements");
			for (int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			System.out.print("Array elements are: ");
			for (int ele : a) {
				System.out.print(" " + ele);
			}
			for (int i = 0; i < size; i++) {
				for (int j = 1; j < size - i; j++) {
					if (a[j] < a[j - 1]) {
						int temp = a[j - 1];
						a[j - 1] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.print("\nElements after sorting: ");
			for (int ele : a) {
				System.out.print(ele + " ");
			}
		}
	}
}		
