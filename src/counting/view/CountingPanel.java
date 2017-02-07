package counting.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CountingPanel extends JPanel {
	
	private CountingFrame countingFrame;
	
	private SpringLayout springLayout;
	
	private JScrollPane textAreaScrollPane;
	private JTextArea textArea;
	private JTextField textField;
	private JButton fibButton;
	private JButton factButton;
	
	public CountingPanel(CountingFrame countingFrame){
		super();
		this.countingFrame = countingFrame;
		
		this.springLayout = new SpringLayout();
		
		this.textArea = new JTextArea();
		this.textAreaScrollPane = new JScrollPane(textArea);
		this.textField = new JTextField();
		this.fibButton = new JButton("Fibonacci");
		this.factButton = new JButton("Factorial");
		
		this.setupComponents();
		this.setupPanel();
		this.setupLayout();
		this.setupListeners();
	}
	
	private void setupComponents(){
		this.textArea.setEditable(false);
		this.textArea.setLineWrap(true);
		this.textArea.setWrapStyleWord(true);
		this.textAreaScrollPane.setBorder(BorderFactory.createEmptyBorder());
	}

	private void setupPanel(){
		this.setLayout(springLayout);
		this.add(textAreaScrollPane);
		this.add(textField);
		this.add(fibButton);
		this.add(factButton);
	}
	
	private void setupLayout(){
		springLayout.putConstraint(SpringLayout.NORTH, textAreaScrollPane, 20, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, textAreaScrollPane, 300, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, textAreaScrollPane, -20, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, textAreaScrollPane, 20, SpringLayout.WEST, this);
		
		springLayout.putConstraint(SpringLayout.NORTH, textField, 20, SpringLayout.SOUTH, textAreaScrollPane);
		springLayout.putConstraint(SpringLayout.EAST, textField, -20, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, textField, 20, SpringLayout.WEST, this);
		
		springLayout.putConstraint(SpringLayout.NORTH, fibButton, 20, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, fibButton, -40, SpringLayout.HORIZONTAL_CENTER, textField);
		
		springLayout.putConstraint(SpringLayout.VERTICAL_CENTER, factButton, 0, SpringLayout.VERTICAL_CENTER, fibButton);
		springLayout.putConstraint(SpringLayout.WEST, factButton, 40, SpringLayout.HORIZONTAL_CENTER, textField);
	}
	
	private void setupListeners(){
		this.factButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append(countingFrame.getCountingController().transferFactorial(textField.getText()) + "\n");
				textArea.append(countingFrame.getCountingController().getTimer().toString() + "\n");
				countingFrame.getCountingController().getTimer().resetTimer();
				textArea.append(countingFrame.getCountingController().transferIterativeFactorial(textField.getText()) + "\n");
				textArea.append(countingFrame.getCountingController().getTimer().toString() + "\n");
				countingFrame.getCountingController().getTimer().resetTimer();
				textField.setText("");
			}
		});
		
		this.fibButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append(countingFrame.getCountingController().transferFibonacci(textField.getText()) + "\n");
				textArea.append(countingFrame.getCountingController().getTimer().toString() + "\n");
				countingFrame.getCountingController().getTimer().resetTimer();
				textArea.append(countingFrame.getCountingController().transferIterativeFibonacci(textField.getText()) + "\n");
				textArea.append(countingFrame.getCountingController().getTimer().toString() + "\n");
				countingFrame.getCountingController().getTimer().resetTimer();
				textField.setText("");
			}
		});
	}
	
}