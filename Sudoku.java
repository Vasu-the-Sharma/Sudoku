package hackerblocks;

import java.util.Scanner;

public class Sudoku {
	static Scanner scn = new Scanner(System.in);

	// public static int sudo(int )

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int n = scn.nextInt();
		// int strg[][] = new int[n][n];

		int A[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		for (int i = A.length - 1; i >= 0; i--) {
			for (int j = A[0].length - 1; j >= 0; j--) {

				if (A[i][j] != 0) {
					continue;
				}
				// col
				for (int k = A[i].length - 1; k >= 0; k--) {
					if (A[i][k] == j)
						continue;
				}

				for (int k = A[i].length - 1; k >= 0; k--) {
					if (A[k][j] == j)
						continue;
				}

				A[i][j] = j;

			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();

		}

	}
}
