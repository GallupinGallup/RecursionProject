package counting.view;

import javax.swing.JFrame;
import counting.controller.CountingController;
import counting.view.CountingPanel;
import java.awt.Dimension;
import javax.swing.*;

public class CountingFrame extends JFrame {
	private CountingController baseController;

	private CountingPanel basePanel;

	public CountingFrame(CountingController baseController) {
		super();
		this.baseController = baseController;
		basePanel = new CountingPanel(this);

		setupFrame();

	}

	private void setupFrame() {

		this.setContentPane(basePanel);
		this.setTitle("Counting Title Of Funnnnn!!!!");
		this.setSize(new Dimension(500, 500));
		this.setResizable(false);

		this.setVisible(true);

	}

	public CountingController getBaseController() {
		return baseController;
	}

	public void setBaseController(CountingController baseController) {
		this.baseController = baseController;
	}

}