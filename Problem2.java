// Author: Aravind Kumar Kongara
// Language: Java
<<<<<<< HEAD
// Problem2 - Generate first n odd numbers
=======
// Problem 2 - Generate first n odd numbers
>>>>>>> ab101f7397d634b56491d2d1a34d59d40afd07b2

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print((2 * i - 1) + " ");
		}
		sc.close();
	}
}
