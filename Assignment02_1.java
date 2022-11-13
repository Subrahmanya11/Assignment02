package in.ineuron.main;

import java.util.Scanner;

public class Assignment02_1 {

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
			System.out.println("Array elements are");
			for (int ele : a) {
				System.out.print(" " + ele);
			}
			boolean duplicate = false;
			for (int i = 0; i < size; i++) {
				for (int j = i + 1; j < size; j++) {
					if (a[i] == a[j])
					{
						System.out.println("\nDuplicate number " + a[j] + " is present at index " + j);
						duplicate = true;
						break;
					}
				}
			}
		
			if (duplicate == false)
				System.out.println(" No Duplicate elements present");
		}
	}
}
