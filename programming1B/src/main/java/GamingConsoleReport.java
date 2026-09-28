
import java.util.Scanner;

public class GamingConsoleReport {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// single-dimensional array holding the city names
		String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

		// single-dimensional array holding the vehicle types
		String[] gamingConsole = {"PS5", "XBOX", "SWITCH"};

		// Two-dimensional array: rows = cities, columns = vehicle types
		// accidents[city][0] = car accidents, accidents[city][1] = motor bike accidents
		int[][] accidents = new int[cities.length][gamingConsole.length];

		// single-dimensional array to store the total accidents for each city
		int[] totals = new int[cities.length];

		// ---------- CAPTURE THE DATA ----------
		for (int row = 0; row < cities.length; row++) {
			for (int col = 0; col < gamingConsole.length; col++) {
				System.out.print("Enter the number of " + gamingConsole[col]
				+ " gaming console for " + cities[row] + ": ");
				accidents[row][col] = input.nextInt();
			}
		}

		// ---------- CALCULATE TOTALS ----------
		for (int row = 0; row < cities.length; row++) {
			int sum = 0;
			for (int col = 0; col < gamingConsole.length; col++) {
				sum = sum + accidents[row][col];
			}
			totals[row] = sum;
		}

		// ---------- FIND THE CITY WITH THE MOST ACCIDENTS ----------
		int highestIndex = 0;
		for (int i = 1; i < totals.length; i++) {
			if (totals[i] > totals[highestIndex]) {
				highestIndex = i;
			}
		}

		String line = "------------------------------";

		// ---------- DISPLAY THE REPORT ----------
		System.out.println(line);
		System.out.println("GAMING CONSOLE REPORT");
		System.out.println(line);

		System.out.printf("%-20s%-20s%-20s%n", "", "PS5", "XBOX", "SWITCH");
		for (int row = 0; row < cities.length; row++) {
			System.out.printf("%-20s%-20d%-20d%n",
			cities[row], PS5[row][0], XBOX[row][1], SWITCH[row][2]);
		}

		System.out.println(line);
		System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
		System.out.println(line);

		for (int row = 0; row < cities.length; row++) {
			System.out.printf("%-16s%d%n", cities[row], totals[row]);
		}

		System.out.println();
		System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);
		System.out.println(line);
		input.close();
	}
}