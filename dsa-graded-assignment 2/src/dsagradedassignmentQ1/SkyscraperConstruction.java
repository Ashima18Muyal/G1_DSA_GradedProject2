package dsagradedassignmentQ1;

import java.util.Scanner;

public class SkyscraperConstruction {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of floors in the building: ");
        int N = scanner.nextInt();

        int[] floorSizes = new int[N];
        System.out.println("Enter the floor size given on each day:");
        for (int i = 0; i < N; i++) {
            floorSizes[i] = scanner.nextInt();
        }

        SkyscraperConstructionDriver driver = new SkyscraperConstructionDriver(new StackImpl());
        driver.analyzeConstruction(N, floorSizes);

        scanner.close();
    }
}
