package counting.view;

import javax.swing.JFrame;

import counting.controller.CountingController;

public class CountingFrame extends JFrame {
	
	private CountingController countingController;
	
	private CountingPanel countingPanel;
	
	public CountingFrame(CountingController countingController){
		super();
		this.countingController = countingController;
		this.countingPanel = new CountingPanel(this);
		
		this.setupFrame();
	}
	
	private void setupFrame(){
		this.setContentPane(countingPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Counting");
		
		this.setSize(500, 430);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
	}
	
	public CountingPanel getCountingPanel(){
		return countingPanel;
	}
	
	public CountingController getCountingController(){
		return countingController;
	}

}