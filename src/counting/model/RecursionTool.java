package counting.model;

public class RecursionTool {
	public double calculateFactorial(double currentNumber) {
		if (currentNumber == 0 || currentNumber == 1) {
			return 1;
		} else {
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}

	public int calculatedFibonacci(int currentNumber) {
		if (currentNumber == 0 || currentNumber == 1) {
			return 1;
		} else {
			return calculatedFibonacci(currentNumber - 1) + calculatedFibonacci(currentNumber - 1);
		}
	}
}
