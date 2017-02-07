package counting.controller;

import javax.swing.JOptionPane;

import counting.model.RecursionTool;
import counting.view.CountingFrame;
import counting.model.Timer;

public class CountingController {

	private RecursionTool recursionTool;
	private CountingFrame countingFrame;
	private Timer mathTimer;

	public CountingController() {
		this.recursionTool = new RecursionTool();
		this.countingFrame = new CountingFrame(this);
		this.mathTimer = new Timer();
	}

	public void start() {

	}

	public String transferFactorial(String input) {
		String factorialInfo = "The factorial of " + input + " is ";

		mathTimer.startTimer();

		if (isValid(input)) {
			factorialInfo += this.recursionTool.calculateFactorial(Double.parseDouble(input));
		}

		mathTimer.stopTimer();
		return factorialInfo;
	}

	public String transferFibonacii(String input) {
		String fibonaciiInfo = "The factorial of " + input + " is ";

		mathTimer.resetTimer();
		mathTimer.startTimer();

		if (isValid(input)) {
			fibonaciiInfo += this.recursionTool.calculateFactorial(Double.parseDouble(input));
		}

		mathTimer.stopTimer();
		return fibonaciiInfo;
	}

	public boolean isValid(String input) {
		try {
			Double.parseDouble(input);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(countingFrame, "Number cannot convert!");
			return false;
		}
	}

	public Timer getTimer() {
		return mathTimer;
	}

}