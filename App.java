package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x > ");
		int x = sc.nextInt();
		System.out.print("Enter y > ");
		int y = sc.nextInt();
		
		sc.close();

		int[][] table = new int[x][y];
		
		System.out.println();
		
		for(int i = 0; i < table.length; i++) {
			for(int j=0; j < table[i].length; j++) {
				table[i][j] = (i+1)*(j+1);
				System.out.printf("%d\t", table[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
