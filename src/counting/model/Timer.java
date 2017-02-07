package counting.model;

public class Timer {
	
	private long executionTime;
	
	public Timer(){
		executionTime = 0;
	}
	
	public void resetTimer(){
		executionTime = 0;
	}
	
	public void startTimer(){
		executionTime = System.nanoTime();
	}
	
	public void stopTimer(){
		executionTime = System.nanoTime() - executionTime;
	}
	
	public String toString(){
		String info = "The execution time is: " + executionTime + " in Nano\n";
		info += "Which is " + ((double) executionTime / 1000000000) + " in seconds\n";
		return info;
	}

}