package dsagradedassignmentQ1;

public class SkyscraperConstructionDriver {
	private final StackImpl stack;

	public SkyscraperConstructionDriver(StackImpl stack) {
		this.stack = stack;
	}

	public void analyzeConstruction(int N, int[] floorSizes) {
		for (int i = 0; i < N; i++) {
			int currentSize = floorSizes[i];

			System.out.print("Day: " + (i + 1));

			// Check if the current floor can be assembled
			if (stack.isEmpty() || currentSize > stack.peek()) {
				System.out.println(" " + currentSize);
				stack.push(currentSize);
			} else {
				System.out.println(); // No floor assembled on this day
			}
		}
	}

}
