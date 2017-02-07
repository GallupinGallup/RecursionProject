package counting.model;

public class Timer {
	private long executionTime;

	public Timer() {
		executionTime = 0;
	}

	public void resetTimer() {
		executionTime = 0;
	}

	public void startTimer() {
		executionTime = System.nanoTime();
	}

	public void stopTimer() {
		executionTime = System.nanoTime() - executionTime;
	}

	public String toString() {
		String info = "The executiontime is: " + executionTime + " in nanoseconds or "
				+ ((double) executionTime / 1000000000 + " seconds ");
		info += System.nanoTime();
		return info;
	}
}
