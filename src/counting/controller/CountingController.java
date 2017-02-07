package counting.controller;

import javax.swing.JOptionPane;

import counting.model.RecursionTool;
import counting.model.Timer;
import counting.view.CountingFrame;

public class CountingController {

	private Timer timer;
	private RecursionTool recursionTool;
	private CountingFrame countingFrame;
	
	public CountingController(){
		this.timer = new Timer();
		this.recursionTool = new RecursionTool();
		this.countingFrame = new CountingFrame(this);
	}
	
	public void start(){
		
	}
	
	public String transferFactorial(String input){
		String factorialInfo = "The factorial of " + input + " is ";
		
		if(isValid(input)){
			this.timer.startTimer();
			factorialInfo += this.recursionTool.calculateFactorial(Double.parseDouble(input));
			this.timer.stopTimer();
		}		
		return factorialInfo;
	}
	
	public String transferIterativeFactorial(String input){
		String factorialInfo = "The iterative factorial of " + input + " is ";
		
		if(isValid(input)){
			this.timer.startTimer();
			factorialInfo += this.recursionTool.calculateIterativeFactorial(Integer.parseInt(input));
			this.timer.stopTimer();
		}		
		return factorialInfo;
	}
	
	public String transferFibonacci(String input){
		String fibonacciInfo = "The Fibonacci of " + input + " is ";
		
		if(isValid(input)){
			this.timer.startTimer();
			fibonacciInfo += this.recursionTool.calculateFibonacci(Integer.parseInt(input));
			this.timer.stopTimer();
		}
		return fibonacciInfo;
	}
	
	public String transferIterativeFibonacci(String input){
		String fibonacciInfo = "The iterative Fibonacci of " + input + " is ";
		
		if(isValid(input)){
			this.timer.startTimer();
			fibonacciInfo += this.recursionTool.iterativeFibonacci(Integer.parseInt(input));
			this.timer.stopTimer();
		}
		return fibonacciInfo;
	}

	public boolean isValid(String input){
		try {
			Integer.parseInt(input);
			return true;
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(countingFrame, "Number cannot convert!");
			return false;
		}
	}
	
	public Timer getTimer(){
		return timer;
	}
	
}